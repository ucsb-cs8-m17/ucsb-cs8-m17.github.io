---
num: "Lecture 2"
desc: "Python data and functions"
ready: false
date: 2017-08-09 09:30:00.00-7:00
---

# Code from today's lecture

Including the Turtle code


<https://github.com/ucsb-cs8-m17/lecture2_0809>



# Questions and Answers

* Q: Installing Python?
* A: Visit http://python.org/download

# lab00 and lab01

* lab00 is now ready for you to work on it.
* Eventually, we'll explain how to work on labs on your own computer.
   * If you want a head start on that, come to office hours with your laptop, and we'll go over it with you.
* For now, if you want to work on it before Friday, come to:
   * Office hours in <s>Phelps</s> CSIL, today (Wed 08/09/2017, 3-<s>5pm</s>4:45pm) or
   * Go to CSIL, Mon-Fri 8am-4:45pm
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

# Notes from IDLE on data represenation

```
Python 3.6.2 (v3.6.2:5fd33b5926, Jul 16 2017, 20:11:06) 
[GCC 4.2.1 (Apple Inc. build 5666) (dot 3)] on darwin
Type "copyright", "credits" or "license()" for more information.
>>> print("Hello, World!")
Hello, World!
>>> 3 + 5
8
>>> x = 17
>>> x + 1
18
>>> x * 3
51
>>> x + 1
18
>>> x =  x + 1
>>> x
18
>>> x * 3
54
>>> 
====================== RESTART: /Users/pconrad/hello.py ======================
Hello, World!
>>> print ("Hello, World!")
Hello, World!
>>> 
====================== RESTART: /Users/pconrad/hello.py ======================
Hello, World!
>>> 
====================== RESTART: /Users/pconrad/hello.py ======================
Hello, World!
>>> 
====================== RESTART: /Users/pconrad/hello.py ======================
Hello,  World!
>>> 
=============================== RESTART: Shell ===============================
>>> ====================== RESTART: /Users/pconrad/hello.py ======================
SyntaxError: invalid syntax
>>> 
>>> 1
1
>>> 2+4
6
>>> -67
-67
>>> type(1)
<class 'int'>
>>> type(3 + 4)
<class 'int'>
>>> type(3.4)
<class 'float'>
>>> type("UCSB")
<class 'str'>
>>> schools = ["UCSB","UCLA","Stanford","Harvard"]
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Harvard']
>>> len(schools)
4
>>> type(schools)
<class 'list'>
>>> type([23,5,7])
<class 'list'>
>>> type([2.3, -5.6, 17.0])
<class 'list'>
>>> stuff = ["foo",34,-8,True]
>>> stuff
['foo', 34, -8, True]
>>> len(stuff)
4
>>> type(stuff)
<class 'list'>
>>> stuff[0]
'foo'
>>> stuff[1]
34
>>> stuff[2]
-8
s
>>> stuff[3]
True
>>> type(stuff[0])
<class 'str'>
>>> type(stuff[1])
<class 'int'>
>>> type(stuff[2])
<class 'int'>
>>> for thing in stuff:
	print(type(thing))

	
<class 'str'>
<class 'int'>
<class 'int'>
<class 'bool'>
>>> for thing in stuff:
	print(thing,type(thing))

	
foo <class 'str'>
34 <class 'int'>
-8 <class 'int'>
True <class 'bool'>
>>> courses = ("CMPSC 8","MATH 3A","WRIT 2")
>>> len(courses)
3
>>> courses[0]
'CMPSC 8'
>>> courses[2]
'WRIT 2'
>>> type(courses)
<class 'tuple'>
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Harvard']
>>> schools.append("Cal Poly")
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Harvard', 'Cal Poly']
>>> schools.sort()
>>> schools
['Cal Poly', 'Harvard', 'Stanford', 'UCLA', 'UCSB']
>>> schools.reverse()
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Harvard', 'Cal Poly']
>>> schools[-1]
'Cal Poly'
>>> schools[-1] = "Berkeley"
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Harvard', 'Berkeley']
>>> courses
('CMPSC 8', 'MATH 3A', 'WRIT 2')
>>> courses.sort()
Traceback (most recent call last):
  File "<pyshell#57>", line 1, in <module>
    courses.sort()
AttributeError: 'tuple' object has no attribute 'sort'
>>> courses(-1)="MATH 3B"
SyntaxError: can't assign to function call
>>> courses[-1]
'WRIT 2'
>>> courses[-2]
'MATH 3A'
>>> courses
('CMPSC 8', 'MATH 3A', 'WRIT 2')
>>> courses[0]
'CMPSC 8'
>>> courses[-1] = "MATH 3B"
Traceback (most recent call last):
  File "<pyshell#63>", line 1, in <module>
    courses[-1] = "MATH 3B"
TypeError: 'tuple' object does not support item assignment
>>> schools[-1]="Princeton"
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Harvard', 'Princeton']
>>> schools.pop()
'Princeton'
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Harvard']
>>> schools.pop()
'Harvard'
>>> schools
['UCSB', 'UCLA', 'Stanford']
>>> schools.append("Yale")
>>> schools
['UCSB', 'UCLA', 'Stanford', 'Yale']
>>> englishToSpanish = { "one" : "uno", "two" : "dos" }
>>> englishToSpanish["one"]
'uno'
>>> englishToSpanish["two"]
'dos'
>>> englishToSpanish["three"]
Traceback (most recent call last):
  File "<pyshell#75>", line 1, in <module>
    englishToSpanish["three"]
KeyError: 'three'
>>> englishToSpanish["three"]="tres"
>>> englishToSpanish
{'one': 'uno', 'two': 'dos', 'three': 'tres'}
>>> englishToSpanish["four" : "cuaatro" }
SyntaxError: invalid syntax
>>> englishToSpanish["four" : "cuaatro" ]
Traceback (most recent call last):
  File "<pyshell#79>", line 1, in <module>
    englishToSpanish["four" : "cuaatro" ]
TypeError: unhashable type: 'slice'
>>> englishToSpanish["four"] = "cuaatro"
>>> englishToSpanish
{'one': 'uno', 'two': 'dos', 'three': 'tres', 'four': 'cuaatro'}
>>> englishToSpanish["four"] = "cuatro"
>>> englishToSpanish
{'one': 'uno', 'two': 'dos', 'three': 'tres', 'four': 'cuatro'}
>>> 
```
