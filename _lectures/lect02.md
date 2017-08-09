---
num: "Lecture 2"
desc: "Python data and functions"
ready: false
date: 2017-08-09 09:30:00.00-7:00
---

# lab00 and lab01

* lab00 is now ready for you to work on it.
* Eventually, we'll explain how to work on labs on your own computer.
   * If you want a head start on that, come to office hours with your laptop, and we'll go over it with you.
* For now, if you want to work on it before Friday, come to:
   * Office hours in Phelps, today (Wed 08/09/2017, 3-5pm) or
   * Go to CSIL, Mon-Fri 8am-5pm
   * The instructions for [lab00](/lab/lab00/) explain where CSIL is (ocean side of HFH)
   
   
# Data Representation

`int`, `float`, `str`, `list`, `tuple`, `dict`

# Functions

In Math: $$ f(x) = x^2 $$

In Python:

```python
def f(x):
   " multiply x times itself "
   return x * x
```

# return vs. print

* I give you a dollar and you give me something tangible in return (that I can hold in my hand)

vs.

* I give you a dollar and you "do something for me" 

Economists call this a "good" vs. a "service".

This is an analogy for return vs. print.  We'll explain more in lecture today and future lectures.


# Turtle Graphics

We'll use IDLE (for Python 3).   The command to start it up at command line is  `idle3` (on CSIL, and on MacOS).
(On Windows, look for IDLE in the Start Menu).

A few commands:

```
>>> import turtle
>>> fred = turtle.Turtle()
>>> fred.forward(100)
>>> fred.shape("turtle")
>>> 
```

Documentation for Turtle:

<https://docs.python.org/3.6/library/turtle.html>
