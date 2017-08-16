---
layout: lab
num: lab02
ready: false
desc: "FtoC and CtoF with test cases"
assigned: 2017-08-10 09:30:00.00-7
due: 2017-08-16 17:00:00.00-7
submit_cs_pnum: tbd
---


<div style="font-size:200%; border: 5px solid red;" markdown="1">

PLEASE DON'T START THIS LAB YET!

I'm still doing major surgery on it...

</div>




In this lab, you'll practice:

* Creating a file that has some functions in it
* Testing those functions interactively at the Python prompt
* Creating a file of automatic test cases for those functions
* Running those test cases
* Submitting your functions and test cases to submit.cs for grading


# Step 0: Warmup--experiencing floating point inaccuracy

Bring up a terminal window, and just type `python3`.  This should give you the Python Shell Prompt (`>>>`) where you can type in some expressions and see the resulting values.

Type in the `import math`, followed by `math.sqrt(2)`.  It should look like this:

```
>>> import math
>>> math.sqrt(2)
1.4142135623730951
>>> 
```

The value we get back is the square root of 2, which is an irrational number&mdash;its decimal representation goes on forever.  Unfortunately, computers store number with a finite number of decimal places&dagger;.   So, the representation we see for the square root of two, $$ \sqrt(2) $$ is really in fact an approximation.

<div style="font-size:80%">
&dagger;&nbsp;Technically, "binary places", but for purposes of this discussion it amounts to the same thing.)
</div>


We can see this if we multiply `math.sqrt(2)` by itself.  Try it:

```
>>> math.sqrt(2) * math.sqrt(2)
2.0000000000000004
>>> 
```

See that pesky `4` digit in the ten quadrillionths place?   My goodness, we are really, really close to 2.0, but if we ask whether the values are equal, Python says no:

```
>>> math.sqrt(2) * math.sqrt(2)== 2.0
False
```

In fact, Python is very clear about the difference between `2.0` and `math.sqrt(2) * math.sqrt(2)`, and can even tell us 
how big that difference is.  The `4` digit is only the tip of the very, very, very small iceberg:

```
>>> math.sqrt(2) * math.sqrt(2)- 2.0
4.440892098500626e-16
>>> 
```

This fact is going to be annoying to us many times.   One consequence is that <strong>when we test software involving floating point numbers, we must allow for some inaccuracy</strong>.   This "allowable inaccuracy" is sometimes called the <em>tolerance</em>, and it might be a small value such as `0.001`, or `0.000001`

Values such as this are typically written in scientific notation, e.g. 1x10<sup>-3</sup> or 1x10<sup>-6</sup>.

In Python, we write this as `1E-6` or `1E-9` respectively.

We'll come back to that idea later in this lab.

# Step 1: Make a `~/cs8/lab02` folder

In previous labs, you should already have created folders `~/cs8/lab00` and `~/cs8/lab01`.  You are now going to create folder `~/cs8/lab02` for the files for this lab.

In general, its probably a good idea to keep your work for this class under `~/cs8`, in folders called `lab00`, `lab01`, `lab02` etc.     

This isn't exactly *required* (no-one is going to check), but it's probably a good habit to develop.   Here's why:
all the rest of the instructions will be written based on the assumption that you did things this way.  And if you continue to take CS courses at UCSB, you'll often find that's the case from one course to the next.   

So, I'd strongly encourage you to do it. 



# Step 2: Create a file called `convert.py`

The contents of `convert.py` should be as shown below.  This contains two Python function definitions that,
at the moment are incorrect.

Choose "File => New File" in IDLE to bring up an "untitled" window, then copy and paste this code into that window.

Note that the formulas for converting between Celsius and Fahrenheit are incorrect.  That's deliberate, so just go with it for now.  We'll fix those at a later step.

```
def fToC(fTemp):
    return fTemp - 32

def cToF(cTemp):
    return cTemp + 32
 ``` 
      
# Step 3: Test your code by hand

To test this code, we'll first do what many programmers do: test the code by hand.  

That is, we'll run the file in IDLE, and then enter some function calls in the Python shell to see what results we get.  These two functions are supposed to convert between Fahrenheit where water freezes at 32 degrees, and Celsius where it freezes at 0 degrees.  Let's see if they work properly.

Use the Run Module command to run the code, and then try entering these function calls at the Python Shell prompt.  You should see output similar to what is shown below:

```
>>> fToC(32)
0
>>> cToF(0)
32
>>> 
```

As you can see, for those two particular values, the function appears to return the correct answer&mdash;32 degrees fahrenheit is indeed 0 degrees celsius, and 0 degrees celsius is indeed 32 degrees fahrenheit.  

So clearly, testing with a single value is not enough.  Indeed, if we test with another well known value, 212 Fahrenheit and 100 Celsius (the boiling point of water), we see that the output is incorrect:

```
>>> fToC(212)
180
>>> cToF(100)
132
>>> 
```

One of the problems with testing by hand is that it is tedious, and folks have a tendency to skip it.  So, experienced programmers have learned that its generally a better idea to automate the process of testing.     We'll learn how to do that next.   We'll see that when we set up these four tests, two of them will pass, and two of them will fail.

# Step 4: Setting up automated tests

Add this line at the top of your convert.py file:

```
import pytest
```

Then, add the following code to your `convert.py` file after the function definitions for `ftoC` and `cToF`.

We are using pytext.approx() here because any time you are testing with floating point numbers, we have to be aware that there may be some inaccuracy, as we discussed earlier.  

(Recall our discussion of what happens when you multiple `math.sqrt(2.0)` by itself.  Here, its probably overkill since we aren't using any irrational numbers, but it is still safer to always use some way of approximating equality when dealing with floating point.)


You can click the plus to open a dropdown showing what your entire file should look like at this point:

<div id="info" data-role="collapsible" data-collapsed="true" markdown="1">

## Contents of `convert.py` so far

```
import pytest

def fToC(fTemp):
    return fTemp - 32

def cToF(cTemp):
    return cTemp + 32
    
def test_fToC_freezing():
   assert ftoC(32.0)==pytest.approx(0.0) 

def test_cToF_freezing():
   assert cToF(0.0)==pytest.approx(32.0) 

def test_fToC_freezing():
   assert ftoC(32.0)==pytest.approx(0.0) 

def test_cToF_freezing():
   assert cToF(0.0)==pytest.approx(32.0) 

```


</div>

After entering this, save the file and use "Run Module" to make sure there are no error messages (red output in the Python Shell Window.).  If not, then you are ready for the next step.
            
# Step 5: Running the test cases
        
Running the test cases requires us to go <em>outside of IDLE</em> back to the terminal shell prompt.  

Your current directory needs to be the same one that your convert.py file is stored in.    That should be `~/cs8/lab02`, but if it isn't, then fix things so that the `convert.py` file is in that directory, and you are in that directory.   If you need help, ask for assistance.

You should be able to type the `ls` command  (or on Windows, `dir`) at the terminal shell prompt and see the `convert.py` file listed:

```
your-prompt-here $ ls
convert.py
your-prompt-here $ 
```

When that's the case, try this command:

```
python3 -m pytest convert.py
```

You should see output like this:

```
TODO FILL THIS IN
```


            
# Step 4: Add some more test cases
   
Add the code below to your test cases   
      
```      
def test_fToC():
   assert( ftoC(212.0)==approx(100.0) )
   assert( ftoC(32.0)==approx(0.0) )
   assert( ftoC(-40.0)==approx(-40.0) )
   
      
def test_cToF():
   assert( cToF(100.0)==approx(212.0) )
   assert( cToF(0.0)==approx(32.0) )
   assert( cToF(-40.0)==approx(-40.0) )   
   
```

# Step 5: Try running your program again 


# Step 3: Try running this program (expecting an error...)

# Step 4: Run: `pip3 install -U pytest`


# Step 5: Try running your program again 


```
def test_fToC():
   assert( ftoC(212.0)==approx(100.0) )
   assert( ftoC(32.0)==approx(0.0) )
   assert( ftoC(-40.0)==approx(-40.0) )
   
      
def test_cToF():
   assert( cToF(100.0)==approx(212.0) )
   assert( cToF(0.0)==approx(32.0) )
   assert( cToF(-40.0)==approx(-40.0) )   
```

Then, see if you can fix the code in `tempConversions.py` so that the tests pass.

This first involves changing the line in the definition of the `fToC(ftemp)` function that says:
```Python
  return ftemp - 32.0   # TODO: Fix this line of code
```

You'll need to correct the formula.  Keep in mind that in Python:
* The `*` symbol is used for multiplication.  In algebra, we can write `1.8x` to mean `1.8` multiplied by `x`, however, this does not work in Python.  In Python you must write `1.8 * x` if you want to multiply the variable `x` by 1.8.
* The `+` and `-` symbols are used for addition and subtraction
* The `/` symbol is used for division, e.g '9.0/5.0' means nine divided by five.  Note that if both numerator and denominator are integers, in Python 2, the result will be an integer.   In this case, the result is 1 (the 0.8 part is thrown away, not rounded up to 2).

Also, the order of operations in Python is that multiplication and division are done before addition and subtraction. Some examples: 
* If `x` is 5, then `x + 2 * 3` gives us 11, not 21.  The multiplication is perfomed before the addition.
* If `x` is 16, then `x - 6 / 2` gives us 13, not 5.   The division is performed before the subtraction.
* If you want to force the addition or subtraction to be done first, you must use parentheses, e. g. `(x + 2) * 3` or `(x - 6) / 2`

When you replace `return ftemp - 32.0` with the correct formula for converting a Fahrenheit temperature to Celsius, you should leave out the comment that says `# TODO: Fix this line of code `.

You'll also want to replace the similar line in the cToF function.


## Step 3: Prepare submission for submit.cs



### Step 3a: Make a `~/cs8/lab02` folder


In previous labs, you should already have created folders `~/cs8/lab00` and `~/cs8/lab01`.  You are now going to create folder `~/cs8/lab02` for the files for this lab.



In general, its probably a good idea to keep your work for this class all in the same folder, and within that folder, create a separate folder for each lab.   This isn't exactly *required* (no-one is going to check), but it's probably a good habit to develop.   Also, the rest of the instructions will be written based on the assumption that you did things this way.  So, I'd strongly encourage you to do it. 

### Step 3b: Set up the files `tempConversions.py` and `test_tempConversions.py` in that directory.

Open up IDLE, and select "File -> New".  Copy and paste the contents of tempConversions.py into that window.  Then choose File->Save on each of those files.

### Step 3c: Click "Run" in the window that has the file test_tempConversions.py.

In the window containing the test_tempConversions.py file, select "Run" (or press F5).

You should see the same output that you saw on the cyber-dojo.org site.

If you do not, then, see if you can determine what went wrong.

Once your tests pass here, you are ready to upload your code to submit.cs

### Step 3d: Upload your tempConversions.py file to submit.cs

You only need to upload tempConversions.py to submit.cs, since the test_tempConversions.py file is already on the submit.cs server.

Here's where to upload it: https://submit.cs.ucsb.edu/form/project/459/submission

If the tests pass, you are finished!

If you have trouble, ask during class, or post your questions to Piazza.

# For further exploration

The information below is not necessarily required to do this lab, but you may find it helpful or interesting.   It contains the answers to some questions that may come up as you try to complete the lab.

## Rules for function definitions

* Every Python function definition must start with a line in this format:
** `def`, exactly like that, followed by at least one space (usually exactly one).
** the name of the function (there are certain rules for these names, including no spaces in the name).
** a list of parameters in parens.  This list my be empty.  If there is more than one parameter, params are separated with commas.


## An aside about working with real numbers

Real numbers are numbers on the number line other than integers, such as -2.5, square root of 2, pi, and so forth.  

Python treats integers such as 2, 4, 100, and -42 differently from real numbers.  This is even true when we write an integer with a decimal point; that is 100 and 100.0 are treated differently in terms of Python's "internal processing", even though they represent the same number.

Python will be precise and exact in representing integers.  However, when representing real numbers, even ones that correspond to integers such as 100.0, there is always the potential for some error.  This is a consequence of the fact that the number of bits used to represent a number is finite, but the number of real numbers in any range is infinite.  

Thati is:
* If we use 32 bits, or 64 bits, or 128 bits to represent an integer, we know precisely how many integers we can represent, and we can be sure each one has a unique, exact representation.    
* Between any two real numbers, there is an uncountably infinite number of additional real numbers.  So, no matter how many bits we use, and no matter what range of numbers we choose to represent, we cannot represent them all exactly and precisely.  Therefore representations of real numbers are always an approximation, and there is always the potential for some error.  
 
This error is usually small and insignificant--but not always.  It can cause at least two kinds of problems:
* In calculations involving many steps, small errors can accmuulate into larger, more significant errors.  Knowing about this problem and designing ways to predict and control the error is part of a topic in Computer Science and Applied Math known as "numerical analysis".   
* When we test for equality, i.e. is cToF(100.0) == 212.0, there is the possibility that the calculation on the left gives us 212.0000000001  instead of 212.0000000000.  That tiny difference could cause the test case to fail, even though the calculation is as close as we can get.

So, in general, it's risky to test for exact equality with floating point numbers. Since this is designed to be a very introductory exercise, we are glossing over that detail.    The calculations we are doing are on numbers small enough that the number of bits of precision we have is likely to give us answers precise enough that the problem will not arise.

Later on, we'll see problems where this problem *does* present itself.  We'll see that the correct practice, when working with any kind of calculation involving real numbers (as opposed to integer) is to check whether the returned value is *approximately equal* to the value expected, i.e. that the difference between the two values is less than some *tolerance*.  This *tolerance* is usually very small, for example, 0.000001, or ten to the minus 6 (which can be written in Python either as `0.000001` or in scientific notation like this: `1.0E-6`).


