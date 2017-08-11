---
layout: lab
num: lab01
ready: true
desc: "Turtle Graphics: your initials and graduation year"
assigned: 2017-08-10 09:30:00.00-7
due: 2017-08-16 17:00:00.00-7
submit_cs_pnum: tbd
---

Goal
====

The goal of this exercise is to practice with Turtle Graphics in
Python by producing somewhere between two and four Python functions
that use Turtle Graphics to make particular shapes.

(You'll understand the reasons its "between three and six" in a
minute.)

What you'll be drawing
----------------------

You'll be drawing functions to produce your initials, and the year you expect to graduate from UCSB.    For example, if your name is Pat Brady and you expect to graduate in 2021, you'll write these five functions:

-   `drawP(width, height)`
-   `drawB(width, height)`
-   `draw2(width, height)`
-   `draw0(width, height)`
-   `draw1(width, height)`

You'll use the `draw2` function twice, since the `2` appears twice in `2021`

If your name is Chris Carillo, and you are graduating in 2020, you'll only
need three functions:

-   `drawC(width, height)`
-   `draw2(width, height)`
-   `draw0(width, height)`

As you can figure out by now, "Phill Conrad" graduating in 2017 would
need six functions.

Of course, there is nothing stopping you from making more functions
if you want to, just for practice.  (And I encourage you to do so!)

You'll also include function calls that use your functions to put your
initials and graduation year across the screen twice at two different sizes:
once at the top, and once at the bottom, like this:

![PC1985](PC1985_600.png)

Your first step is to plan our your letters.

To do that, we have a worksheet, [IC00](/hwk/ic00/) for you to complete.

Start on that first, then refresh this page for more instructions.

# The programming part

## Step 1: Create a lab01 directory under your cs8 directory

In [lab00](/lab/lab00) you created a directory `~/cs8/lab00` and, if
you followed the instructions to the letter, your `hello.py` file
is located in that directory.

You should now create a directory called `~/cs8/lab01` for a file
we are going to call `lab01.py`.

To do that, use the commands below.

(Just like last week, your prompt may not be exactly like the one shown here.  Instead of `-bash-4.2$ `, you might have something like `[cgaucho@cstl-15 ~]$ `.    The `cgaucho` here is your username, the `cstl-15` is where you are logged in, and the `~` is your current directory.    Don't be distracted by this detail.)


<pre>-bash-4.2$ <strong>cd</strong>
-bash-4.2$ <strong>pwd</strong>
/<em>cs</em>/<em>student</em>/<em>yourusername</em>
-bash-4.2$ <strong>cd cs8</strong>
-bash-4.2$ <strong>pwd</strong>
/<em>cs</em>/<em>student</em>/<em>yourusername</em>/cs8
-bash-4.2$ <strong>mkdir lab01</strong>
-bash-4.2$ <strong>cd lab01</strong>
-bash-4.2$ <strong>pwd</strong>
/<em>cs</em>/<em>student</em>/<em>yourusername</em>/cs8/lab01
-bash-4.2$
</pre>

## Step 2: Open `idle3` and create `lab01.py`

Open up `idle3` and select the menu option `File => New File` to create a new file.

In this file, put this code (but put your name instead of "your name goes here")

```
# lab01.py, your name goes here
import turtle

t = turtle.Turtle()

```

You can name your turtle anything you like; I used `t` because it's short to type.

Optionally, you can make your turtle look like a turtle by typing this:

```
t.shape("turtle")
```

Save this, and run it.   You should see a turtle appear.


## Step 3: Create a function for your first letter

Next, you are going to define a function to draw your first letter.

Name this function `drawX`, where `X` is the letter you are drawing
for your first initial. (For example, `drawA`, `drawB`, etc.)

As a model, use the code below for the drawA function.  This goes
right after the code you just put into the `lab01.py` file.

For your draw function, adapt this code, using the points you defined on the
[ic00](/hwk/ic00/) worksheet, and change the code that connects the
points with lines as needed.

After entering the function definition, at the bottom try a sample
function call with some width and height (e.g. `drawA(50,100)`).  The
function call should NOT be indented, just as shown in the example below.

Try running it and see if the letter looks ok.  Make changes until you see that it can draw the letter properly.

```
def drawA(width, height):
    """
    draw the letter A with a given width and height,
    with the current location being the lower left corner of the A
    using a turtle called t
    """

    # figure out where we are

    startX = t.xcor()
    startY = t.ycor()

    # figure out the other points using only what we know,
    # which is width, height, startX and startY
    
    topAX = startX + (width/2)
    topAY = startY + height

    bottomRightX = startX + width
    bottomRightY = startY
    
    barLeftX = startX + width/4
    barLeftY = startY + height/2

    barRightX = startX + (width/4) + (width/2)
    barRightY = startY + height/2
    
    # draw left hand side of the A (assumes we start at startX,startY)
    
    t.goto(topAX,topAY)

    # draw the right side of the A

    t.goto(bottomRightX, bottomRightY)

    # draw bar across the middle
    
    t.up()
    t.goto(barLeftX,barLeftY)
    t.down()
    t.goto(barRightX,barRightY)

    # leave turtle at lower right hand corner of letter
    
    t.up()
    t.goto(bottomRightX,bottomRightY)
    t.down()

drawA(50,100)

```

## Step 4: Make sure first letter function is reusable

Now, we want to make sure your function is general enough to be able to draw your letter:

* at different places on the screen
* at different heights and widths

To make sure that you can draw your first letter at two different places, change the function call
at the bottom of the file from something like this:

```
drawA(50,100)
```

to something like this, that draws an A of width 50 and height 100, picks up the pen and moves to a new location,
and then draws the A again with a different width and height.

```
drawA(50,100)
t.up()
t.goto(-200,-200)
drawA(40,80)
```

If your code is written in a general way, i.e. the `drawA` routine works ONLY with the `startX`, `startY`, `width`, and `height` values, both letters should look good.  If one of them looks incorrect, then see if you can determine what is wrong with your code.

When you see two good drawings of your first letter, you are ready for the next step.

## Step 5: Add the function for the next letter or number

Now we are going to add another function just like the first, right under it.

Keep the code that has the actual function calls *at the bottom* of the file.  The order should be:

* First, the code that imports and sets up the turtle, i.e.
   ```
   import turtle
   t = turtle.Turtle()
   t.shape("turtle")
   
   ```
* Second, the functions definitions for `drawA`, `drawX`, etc., e.g.
   ```
   def drawA(width,height):
   
      startX = t.xcor()
      startY = t.ycor()
      
      # etc..
   
   def drawX(width,height):
      
      # code for drawX is here, indented...
     
   ```
   
* Then, last, the section of code with function calls that draw your letters

   ```
   drawA(50,100)
   t.up()
   t.goto(-200,-200)
   drawA(40,80)
   # etc ...
   
   ```
   
Try running the code again after adding the function definition for your new letter.  Make sure you don't get any error messages&mdash;if you do, fix those before continuing.

Then, we'll try adding in code to call the function for the new letter.    We probably want to move over a bit before drawing it.  We can do that with with `t.forward()` or another `t.goto()` with some numbers:

<table>
<tr>
<td markdown="1">
```
drawA(50,100)
t.up()
t.forward(10)
t.down()
drawX(50,100)

t.up()
t.goto(-200,-200)
drawA(40,80)
t.forward(10)
t.down()
drawX(50,100)

```
<td>
<tr>
OR
</td>
<td markdown="1">
```
drawA(50,100)
t.up()
t.goto(60,0)
t.down()
drawX(50,100)

t.up()
t.goto(-200,-200)
drawA(40,80)
t.up()
t.goto(-150,-200)
t.down()
drawX(50,100)

```
</td>
</tr>
</table>

