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
