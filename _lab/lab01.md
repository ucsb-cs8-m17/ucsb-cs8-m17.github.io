---
layout: lab
num: lab01
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

# Create a file called `tempConversions.py`

The contents of `test_tempConversions.py` should be as shown below.  This contains two Python function definitions that,
at the moment are incorrect.

Choose "File => New File" in IDLE to bring up an "untitled" window, then copy and paste this code into that window.

```
# tempConversions.py   A module for converting between fahrenheit and celsius

# The following starting point code passes some test cases, 
# but it fails others.  Your job in this lab exercise is to modify the code
# so that is passes all of the test cases

def fToC(ftemp):
      ''' convert fahrenheit to celsius '''
      return ftemp - 32.0   # TODO: Fix this line of code
  
def cToF(ctemp):
      ''' convert celsius to fahrenheit '''
      return ctemp + 32.0   # TODO: Fix this line of code
```


# Create a file called `test_tempConversions.py`

The contents of `test_tempConversions.py` should be as shown below.  

Choose "File => New File" in IDLE to bring up an "untitled" window, then copy and paste this code into that window.

```
from tempConversions import fToC
from tempConversions import cToF

import unittest

class TestTempConversions(unittest.TestCase):

  # When using unittest, we list our test cases here
  # 

  def test_fToC_32_gives_0(self):
    self.assertAlmostEqual(  0.0,  fToC(32.0) )

  def test_cToF_0_gives_32(self):
    self.assertAlmostEqual( 32.0,  cToF(0.0) )

  # Add more test cases here, indented exactly like the ones above


# THE CODE BELOW THIS LINE SHOULD BE LEFT ALONE
# The if test below says, in essence, when you run this file,
# please run all of the unit tests.
if __name__ == '__main__':
    unittest.main()

```



Here is the link to the cyber-dojo.org session for this lab:  http://cyber-dojo.org/enter/show/63BB65 

In this session, you have:
* a Python *module* called `tempConversions` in the file `tempConversions.py`
* a Python file with test cases called `test_tempConversions.py`

Briefly: your job is to fix the two functions defined in `tempConversions.py` so that they are correct.  Initially, it may appear that they *are* correct, because they are passing all of their test cases, as evidenced by the fact they when we click "test", the code appears "green".  However, we soon see that our tests are not complete enough.    So we first copy/paste two additional tests into the file `test_tempConversions.py`, and then the tests fail.   We then can correct the code and see that the functions are now correct.

Once you've tried the code in cyber-dojo.org, we'll go over how to do this in submit.cs as well.

# Instructions

The tempConversion.py files contains two functions for converting
between fahrenheit and celsius.    They are correct for some of the
test cases given.  But there are additional test cases that don't pass.


(1) Click "test" and see that the code is green, initially, i.e.
    it passes all of its test cases.

(2) Copy and paste the following two additional test cases into 
    test_tempConversion.py.   See that the code now fails these two
    additional test cases.

  def test_fToC_212_gives_100(self):
    self.assertAlmostEqual( 100.0,  fToC(212.0) )

  def test_cToF_100_gives_212(self):
    self.assertAlmostEqual( 212.0,  cToF(100.0) )

(3) Fix the code so that it passes the new test cases and is green.


# Step-by-Step

## Step 1: Start a new session

Navigate to http://cyber-dojo.org/enter/show/63BB65 and click *start* to begin a new session.

You'll be assigned some "animal" as your avatar. Click OK to accept this animal.

Then you'll see some files listed on the left:

* instructions
* tempConversions.py
* test_tempConversions.py
* output
* cyber-dojo.sh

You can click each file's name to see and edit its code.

Take a moment, first to read the information below, as you click on each file and become familiar with the code inside.

Here is some more information about each of the files you'll find in this project.

### The file `tempConversions.py`

* `tempConversions.py` is a Python *module*, i.e. a file containing definitions
* a module can be imported for use into another file.
* Specfically, the module `tempConversions` contains two function definitions, for `ftoC(fTemp)` and `ctoF(cTemp)`
* The function definitions given here are not correct.  They work for some parameter values, but not for others.

### The file `test_tempConversions.py`

* This file starts with the two lines:
** `from tempConversions import fToC` and
** `from tempConversions import cToF` 
* These lines bring the functions `fToC` and `cToF` from the `tempConversions.py` file into the file where we are running the tests.

Then we see this line:
* `import unittest`

This line says that we are using the `unittest` testing framework.   You do NOT need to know every single detail of this framework to do this lab&mdash;I'll walk you through what you need to know.  However, if you are the kind of person that likes to go into depth, you can read more here, with the advance warning that a lot of it is pretty technical, and involves concepts we haven't covered yet:  https://docs.python.org/2/library/unittest.html

The next line creates a *class*.  A class, in Python, is a collection of function definitions and sometimes other things a as well.    We won't be talking in detail about classes for a few weeks, but in `unittest`, when you do testing,  you create a class, and each of the function definitions inside that class is one of your test cases.   

Consider this line:
*  `class TestTempConversions(unittest.TestCase):`

Here is how the different parts of that break down:

* It starts with the word `class` to tell Python we are creating a class
* Then it has the name of our class (which can be anything we like, but we typically start it with the letters `Test`, with a capital `T`.
* The next part, `(unittest.Testcase):` is needed to say that this class is full of test cases.  This is actually something called *inheritance*, but we don't need to know the details of that right now.

The part we really DO want to concern ourselves with is the test cases.  They look like this.

```Python

 def test_fToC_32_gives_0(self):
    self.assertAlmostEqual(  0.0,  fToC(32.0) )

  def test_cToF_0_gives_32(self):
    self.assertAlmostEqual( 32.0,  cToF(0.0) )

```

Note a few important things about these test cases:
* THEY MUST BE INDENTED to be "part of" the class.    
* Each of them is a function definition, where the name of the function starts with the letters `test_` exactly like that.
* Each of them has a single parameter called `self`.  That's an annoying detail of working with `unittest`.  Just accept it on faith for right now.
* Inside, we use special functions that are invoked by typing `self.` followed by the function name, and its parameters inside a set of parentheses.  Generally, these are functions where the first parameter is the result we expect, and the second parameter is a function call.

The particular function we are using is this one:

```
assertAlmostEqual(first, second)
```

This function expects numerical parameters `first` and `second`.  It checks that the parameters `first` and `second` are approximately equal by computing the difference, rounding to seven decimal places, and comparing that to zero.   Note that these methods round the values to the given number of decimal places (i.e. like the round() function) and not significant digits.

It is possible to specify a different number of decimal places, or a given delta by adding a third parameter&mdash;but we won't get into that in this lab.  We'll save that for later.  If you want to know more, you can read the details here: 
* Navigate to https://docs.python.org/2/library/unittest.html and search on the page for `assertAlmostEqual`

An aside: the reason we test for "approximate equality" is that testing numbers with decimals for exact equality is risky.
The "For further exploration" section below has further information on this topic, which we'll revisit later in the course.

### The file `instructions`

This file contains instructions, including two additional test cases to copy/paste into the file test_tempConversions.py

### The file `output`

This file shows the result of the last test that you have run.    If the previous test encountered any errors, they'll be shown in this file.   Unlike the other files, you don't have the capability to make changes here--you can only look at the file's contents.

### The file `cyber-dojo.sh`

This file contains the command that runs each time you click the test button.    You will not need to make any changes to this file.

Once you've looked over all of the code, you are ready to try running the code.

## Step 2: Click test--the tests will pass

Click test.  The tests will pass, and you'll see a green circle showing that they passed, and output that ends with this output (the `in 0.01 seconds` may be slightly different, but the `2 passed` should be there):

```
=========================== 2 passed in 0.01 seconds
===========================
```

So this seems fine.  But there's a problem: despite the two passing tests, the code is still incorrect!

The problem is that we haven't specified enough tests yet.

Look at the instructions file, and find two additional tests that look like this:

```Python

  def test_fToC_212_gives_100(self):
    self.assertAlmostEqual( 100.0,  fToC(212.0) )

  def test_cToF_100_gives_212(self):
    self.assertAlmostEqual( 212.0,  cToF(100.0) )

```

Copy/paste those into the `test_tempConversions.py` file.  Be sure they are indented properly.

Click test again.  The additional tests will fail.  You should see a red circle indicating the failures, and a message that 2 tests passed and two failed.   The failure output should look, more or less, like this (the formatting may be a bit off):

```
.FF.
======================================================================
FAIL: test_cToF_100_gives_212 (test_tempConversions.TestTempConversions)
----------------------------------------------------------------------
Traceback (most recent call last):
  File "./test_tempConversions.py", line 24, in test_cToF_100_gives_212
    self.assertAlmostEqual( 212.0,  cToF(100.0) )
AssertionError: 212.0 != 132.0 within 7 places

======================================================================
FAIL: test_fToC_212_gives_100 (test_tempConversions.TestTempConversions)
----------------------------------------------------------------------
Traceback (most recent call last):
  File "./test_tempConversions.py", line 21, in test_fToC_212_gives_100
    self.assertAlmostEqual( 100.0,  fToC(212.0) )
AssertionError: 100.0 != 180.0 within 7 places

----------------------------------------------------------------------
Ran 4 tests in 0.001s

FAILED (failures=2)
```

Look at the output above.  You'll see that the tests are failing.   
* The output contains some parts that may be mysterious such as `Traceback (most recent call last):`
* Other parts, however, are pretty straightforward to intepret, such as: `AssertionError: 100.0 != 180.0 within 7 places`, especially when looked at in the context of the previous line: `self.assertAlmostEqual( 100.0,  fToC(212.0) )`
* Look over this output, and see if you can make sense of it.

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

Each time you add some code, try clicking the test button again.  When you've fixed the formulas so that all four tests pass, you are ready to move on to the next step.

That will look like this:

```
....
----------------------------------------------------------------------
Ran 4 tests in 0.001s

OK
```

So, you are finished with cyber-dojo.org, and ready to move on to submit.cs

## Step 3: Prepare submission for submit.cs

Now that we've practiced this on the cyber-dojo.org site, let's do the same thing again, but this time, building our code in IDLE, and submitting to submit.cs.

As we do this, you may want to keep your cyber-dojo.org session open (unless you want to just do the entire process over again from scratch.)


### Step 3a: Make a cs20/lab01 folder


Somewhere on your computer's disk space (i.e. on your computer's hard drive), create a folder called cs20.  Inside that folder, create another folder called lab01.  

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


