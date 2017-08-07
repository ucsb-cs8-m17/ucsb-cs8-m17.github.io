---
layout: lab
num: lab00
ready: false
desc: "Getting Started"
assigned: 2017-08-08 09:30:00.00-7
due: 2017-08-11 17:00:00.00-7
---





For this lab, there is one goal: write a Python 3 program that prints the string `Hello, World!` as its output.

In this sense, we are following a long tradition: for [more than 40 years](https://en.wikipedia.org/wiki/%22Hello,_World!%22_program) it has been a tradition to make printing `Hello, World!` be the first thing you do when learning a new programming language.

In Python 3, this program is very short.  It looks like this:

```python
print ('Hello, World!')
```

That's it!   Now, you can also add, on the first line, a *comment* with your name, and information about the course, for example:

```python
# Chris Gaucho, for CMPSC 8, Summer 2017
print ('Hello, World!')
```

You are encouraged to do that, because it helps someone looking at your code know that *you* wrote it.  But, other than that, it isn't necessary.  In general, in computer programming, a *comment* is something that is intended only for human readers of the code, and is otherwise "ignored by the system".   Nearly every programming language has some way to express comments, though the exact rules for formatting of comments--that is, the *syntax* of comments--differs from one language to another.

In Python, a `#` starts a comment.  Everything from the `#` to the end of that line is part of the comment.

Now, how will you create this bit of code?  It depends on whether you are completing this lab in Phelps 3525 on one of the Linux lab systems, or your own Window or Mac laptop.  

# Working on your own laptop

# Downloading Python 3.x (including IDLE) for your system.

These instructions assume <b>you are working with a Windows or Mac system.</b>  

* <b>If you are running Linux</b>, it is assumed that you already have some system administration skills (otherwise, you'd be running Windows or Mac.   In particular, we assume you know how to install software for your distribution of Linux with an appropriate package manager, e.g. apt-get, yum, dpkg, etc.    If you are on Linux, install Python 2.7.11 in whatever way is appropriate for your distribution of Linux.  That's all the help we can provide.

For Windows or Mac, you can install Python 3.x by visiting: http://python.org and clicking the Downloads link.

## Be sure you get Python 3, not Python 2

* BE SURE YOU GET PYTHON 3.6.2 (or a later version that starts with a 3).
* FOR THIS COURSE, YOU DO NOT WANT ANY VERSION OF PYTHON STARTING WITH 2.

If you already have a version of Python 3 on your system, that's ok.  

Supposedly, Python 2 and Python 3 can happily co-exist.   What's this all about?  We'll explain in lecture, but if you missed the lecture, or want to learn more, here's some information: https://wiki.python.org/moin/Python2orPython3

# Once you've downloaded Python 3, Start up Idle and enter your hello.py program

You should have gotten a program along with your Python 3 download called "Idle".

Idle is a program that allows you to create and modify Python programs.   It also allows you to check the program for formatting errors (syntax errors) and then run the program and see what it does.      

I'll demonstrate the use of Idle in lecture, since its much easier to just follow along than to try to explain everything in a text document.   If you need a further demonstration, you can find one on YouTube.  For example: 
[This video starting a 4:53](https://www.youtube.com/watch?v=kXbpB5_ywDw&t=4m53s)  (That video is for Python 3.1, but the stuff shown in the video is the same across all versions of Python 3.x).

We are going to put our hello.py into Idle, and run it.   Once you've run it and seen it work properly, you are ready to try to upload your program to submit.cs to submit your work for a grade.

# Uploading your program to submit.cs

Next, we'll try submitting our program to submit.cs, which is an autograder system used by many Computer Science department courses at UCSB.    You'll get some immediate feedback on whether you did it properly.

# Creating your submit.cs account

You may have already done the steps in this section--an email was sent out through Gauchospace inviting you to do so.   If you have, you may skip this section.

Otherwise, to create your submit.cs account, please take the following steps:

1. Navigate to the following website: https://submit.cs.ucsb.edu
1. Click on the "Create User" button, and enter your Umail address.
1. Check your umail for a message with additional instructions—follow the instruction in the email to select a password and activate your account.
1. Go back to the website: https://submit.cs.ucsb.edu and login with your account.
1. Select "Join Class", and click on the link for CS8_m17

At that point, you should be good to go.

# Navigate to the page for submitting lab00

The page for submitting lab00 is here: https://submit.cs.ucsb.edu/form/project/{{page.submit_cs_pnum}}/submission

Navigate to that page, and upload your `hello.py` file.

Note that if you try to upload a file with a name that does not match EXACTLY the name `hello.py`, the system will not allow you to do it.  The name cannot be, for example, `Hello.py`, or `HelloWorld.py`, or `hell0.py` (note the zero as in '007' instead of the letter 'o' as in octopus.)  Only `hello.py` is permitted.   This will always be the case with submit.cs: it is very picky about the filename that it wants.

Once you upload it, you should get a page that shows your submission is pending.

Refresh that page, and you should get one that indicates with either red, or green, whether the test cases for your code passed or failed.

If you got all green, and 100 points, then you passed, and you are finished with lab00!

