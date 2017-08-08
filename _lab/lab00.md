---
layout: lab
num: lab00
ready: false
desc: "Getting Started"
assigned: 2017-08-08 09:30:00.00-7
due: 2017-08-11 17:00:00.00-7
---


# Introduction

Your first lab for this week is an introduction to programming on CSIL and in the Computer Science lab. You will write your first Python program that will print a specific text out on your computer display.

## Goals for this lab

By the time you have completed this lab, you should be able to:

* use the computers in Phelps 3525 (and other labs like CSIL) to do basic things such as:
   * perform basic management of directories and files
   * create Python progams in IDLE 
   * submit an assignment using the submit.cs system
   
This assignment is designed to make sure you are comfortable working in the 
computing environment and know how to submit your work. It is mostly about
mechanics, not concepts. As a result, this assignment is not particularly intellectually
challenging.    Future labs will require quite a bit more thought!

# Step by Step Instructions

## Step 1: Verify your College of Engineering Account(s)

The Gauchospace message that welcomed you to the course invited you to 
create a College of Engineering account at this link:

<https://accounts.engr.ucsb.edu/create/>

We hope you did that&mdash;if so, you should be able to use that account to login on the computers
in Phelps 3525, as well as the computers in the CSIL lab. 


If your account doesn't work, ask a TA for assistance.

Phelps 3525 is only available during your weekly scheduled discussion section and during Summer 2017, on Tuesdays 1-3:30pm, and Wednesdays 3-5pm.  

At other times during the week, you can work in CSIL, the &quot;Computer Science Instructional Lab&quot;.

The CSIL lab, by the way, is on the ground floor of Harold Frank Hall.  The glass front doors of Harold Frank Hall look out towards the ocean.  Stand just outside those doors with your back towards the ocean.   The doors to the CSIL lab are just on your right.  (If you can't look over your shoulder and see an great big tree, with the ocean just behind it, you are on the wrong side of the building.)   Hours vary--its open almost all the time during the regular school year, but limited hours in summer.

## Step 2: Bring up a terminal window
 
On the Linux systems, there a lot of things we can do with pointing and clicking
with the mouse, just like on Windows or Mac. But there are also many things we can
only do with the command line, or can do more easily with the command line.

So, one of the first steps will often be to bring up a &quot;Terminal Window&quot;,
which is the Linux &quot;command line&quot;.

Here's how:

* Find the Applications Menu at the top left of the screen
* Select System Tools, then Terminal Window
* A Terminal Window should pop up


Step 4: Create some directories</h3>
 <p>At the command prompt, we are going to type several commands to create folders
 (called &quot;directories&quot;) on Linux in which you can store your programs. The
 commands are shown in the box below&mdash;but first, a little explanation.</p>
 <p>Each of the <strong>cd</strong> commands shown below is a command to &quot;change
 directory&quot;&mdash;that is to move into a different folder on the hard drive. </p>
 <ul>
   <li>When you type <strong>cd</strong> by itself, it takes you to your
  'home directory'.</li>
   <li>cd followed by a directory name (e.g. <strong>cd cs8</strong>) moves you into
   a directory under the current one</li>
  </ul>
 <p>Each of the <strong>mkdir</strong> commands &quot;makes a new directory&quot;
 (i.e. a new folder). </p>
 <ul>
   <li>For example,<strong> mkdir cs8</strong> creates a new directory called cs8,
	inside the current directory.</li>
  </ul>
 <p>Each of the pwd commands &quot;prints the working directory&quot;,
 i.e. it tells you where you are on the hard drive.</p>
 <ul>
   <li>Your home directory is something like <strong>/cs/student/jsmith</strong>
 or <strong>/engr/student/mdiaz</strong></li>
   <li>Under that, you might have a directory cs8&mdash;that would show up as
 <strong>/cs/student/jsmith/cs8</strong>, or <strong>/engr/student/mdiaz/cs8</strong></li>
 </ul>
 <p>At the command prompt, type each of these commands. What you type is shown in bold.
 You should get back exactly the output shown, (except that the part in italics may be different&mdash;each user will have something different show up there.)</p>
 <pre>-bash-4.2$ <strong>cd</strong>
-bash-4.2$ <strong>pwd</strong>
/<em>cs</em>/<em>student</em>/<em>yourusername</em>
-bash-4.2$ <strong>mkdir cs8</strong>
-bash-4.2$ <strong>cd cs8</strong>
-bash-4.2$ <strong>pwd</strong>
/<em>cs</em>/<em>student</em>/<em>yourusername</em>/cs8
-bash-4.2$ <strong>mkdir lab00</strong>
-bash-4.2$ <strong>cd lab00</strong>
-bash-4.2$ <strong>pwd</strong>
/<em>cs</em>/<em>student</em>/<em>yourusername</em>/cs8/lab00
-bash-4.2$ <strong>cd</strong>
-bash-4.2$ <strong>pwd</strong>
/<em>cs</em>/<em>student</em>/<em>yourusername</em></pre>
 <h4>Checking if it worked</h4>
 <p>To see if it worked, you can use the file manager on the desktop. Drag any windows
 that might be covering up the &quot;Home&quot; icon
 on your desktop&mdash;it should be near the upper left hand corner of the screen.
 When you double click on this icon, it will bring up your home directory. You should
 see inside a folder called cs8. If you double click on that, you should see inside
 of it, a folder called lab00.</p>
 <p>Note that you could also use mouse clicks and menu options to create these folders,
 instead of the command line. If you have trouble with the command line, then for today,
 it is ok to do it that way. </p>
 <p>Eventually, though, we want you to learn some of the Unix commands 
  also&mdash;the reasons it is important to know both will become more clear 
  as you move deeper into the study of programming and Computer Science.</p>

 <h3>Step 5: Bring up the program called IDLE</h3>
 <p>The preliminaries are done&mdash;now we are ready to start saving files
for Python!</p>
 <p>IDLE is a piece of software that you use to interact with the Python programming
 language. As we are using Python version 3 in this class, we also use IDLE version 3.
 Type the following at the command prompt:</p>
 <pre>-bash-4.2$ <strong>idle3</strong></pre>
 <p>The window that appears should have the Python Command prompt (&gt;&gt;&gt;)
 in it.</p>
 <ul>
   <li>This is sometimes called the &quot;Python Command Prompt&quot; window.</li>
   <li>This is also called the &quot;Python Shell&quot; window.</li>
 </ul>
 <p>When you have the IDLE window up, you are ready for the next step.</p>

 <h3>Step 6: Save a file in IDLE</h3>
<p>In IDLE, select &quot;File=&gt;New Window&quot; to open a new &quot;untitled&quot;
 window for Python code.</p>
<p>When it comes up, click and drag the window by its title bar over to the right
 of your Python Shell window.</p>
<p>Then, open a web browser to the link below. </p>
<ul>
  <li>Hint: You may be able to use right-click (control-click on Mac), to open this link
  in a new window.</li>
</ul>
<p><a href="http://www.cs.ucsb.edu/~mikec/cs8/assignments/labs/lab00/zen.txt">http://www.cs.ucsb.edu/~mikec/cs8/assignments/labs/lab00/zen.txt</a></p>
<p>Go ahead and read it, but then "select all" of the text, "copy" it and "paste"
 it into the new &quot;untitled&quot; window.</p>
<ul>
  <li>Note: if the usual keystrokes for copy and paste are not working, try the
 menu options under &quot;Edit&quot; for copy and paste.</li>
  </ul>
<p>At the top of the file, type "Copied by: " followed by your name and, if another
student is working with you today, the other student's name on the same line as yours.
Make sure you type "Copied by:" exactly as shown, including capitalization.</p>
<p>You'll have to save the file. Save the file with the name zen.txt inside the
 cs8/lab00 folder you created in the previous step. </p>

<h3>Step 7. Submit your assignment using the turnin program on CSIL</h3>
<p>To submit your assignment, you need to bring up a terminal window on CSIL.</p>
<p>To start this process, bring up a terminal window exactly the way you did in
 Step 2.</p>
<p>Next, we use the cd command that we practiced earlier:</p>
<pre>-bash-4.2$ <strong>cd</strong> 
-bash-4.2$ <strong>pwd</strong> 
/<em>cs</em>/<em>student</em>/<em>yourusername</em> 
-bash-4.2$ <strong>cd cs8</strong> 
-bash-4.2$ <strong>pwd</strong> 
/<em>cs</em>/<em>student</em>/<em>yourusername</em>/cs8 
-bash-4.2$ </pre>
<p>When you are in inside your cs8 directory, you are ready for the turnin step.
 Note that your account must work to get credit.  If your account
 does not work, you must go to CSIL later to turn in the lab.</p>
<p>Type the following at the prompt:</p>
<pre>turnin Lab00@cs8 lab00</pre>
<p>Careful: that's an uppercase 'L' at the start, and lowercase 'l' later, and the class
 name is "cs8". You should be asked if you want to turn in
 this file. Respond &quot;yes&quot;, and then you should get a message indicating that your
 efforts were successful!</p>

<h3>Step 8. Log Out</h3>
<p>Actually, this is the final step of <em>every lab</em>, but we probably won't
 remind you again after this one.
In fact, you should do this every time you walk away from a lab computer, either
 in Phelps 3525 or CSIL.</p>
 <p>Here's how:</p>
 <ul>
   <li>Find the System Menu at the top of the screen.</li>
   <li>Select Log Out</li>
  </ul>
 
<table bgcolor="lightcyan" border="1" cellpadding="4"><tbody><tr><td>
   <strong>Second partner should now log in and redo Steps 2 through 8.</strong>
   <br>The first partner should not leave though: help your partner out. Things should
   go much more quickly and smoothly the second time through.
</td></tr></tbody></table>

<hr>

<h2>Evaluation and Grading</h2>
<em>Each</em> student must accomplish the following to earn full credit for this lab:
 <ul>
   <li>Turn in a complete and accurate Hw0 - your TA should have collected it earlier.</li>
   <li>zen.txt is complete, with "Copied by:" and your name, and is saved in ~/cs8/lab00/.</li>
   <li>zen.txt is turned in from your user account.
   <!--<br><b>Deadline for after-lab submission: Tonight at 11:59pm.</b>
      <br><i>Note that to be eligible for late turn-in with credit, you MUST have attended
          your entire lab period.</i>--></li>
 </ul>
 <p>You should try to complete this assignment by the end of the lab section.
  This first lab, however, will be accepted late without penalty from students who register for
  the class late, or anyone who needs extra help.</p>
<p><strong>Deadline for after-lab submission: Friday, April 7 (11:59pm).</strong>
 Remember: attendance in-lab is mandatory to receive any lab credit.</p>
 
<hr>
<blockquote>
<h3>After both partners finish the lab work above</h3>
<p>Normally this section of the labs will have optional challenges for you to work on after
completing the mandatory tasks. That is, if you finish the required work early, then we
want you to do additional work until the lab officially ends.</p>
<p>Are you one of the first pairs to finish? Then look around for classmates who might be
struggling, and ask them if you can help. After all of your classmates are either done or being
competently helped by someone else, then you may ask the TA to be excused. That is, today
you may leave early, but only after you are sure that nobody needs your help.</p>
</blockquote>

 <hr>

<h3>If your account doesn't work:</h3>
 <p>If you try to create a College of Engineering account, and it doesn't work, then
  send email to support@cs.ucsb.edu. In your email, </p>
 <ul>
   <li>cc your instructor and your TA on the email.</li>
   <li>Indicate that you are enrolled in CS8 </li>
   <li> Tell approximately what day you enrolled in the class on GOLD and 
     when you completed (or attempted) the form at
     <a href="https://accounts.engr.ucsb.edu/create/">https://accounts.engr.ucsb.edu/create/</a> </li>
  </ul>
 <p>Note: DO NOT include your password in your email to support. In fact, NEVER send your
  password through email, and NEVER tell anyone else your password, not even the support
  staff. Real support staff will NEVER ASK YOU FOR YOUR PASSWORD&mdash;not over email,
  and not in person. They won't need it to help you. </p>
 <p>If someone is asking for your password over email, it is a scam called a
 &quot;phishing attack&quot;&mdash;don't be fooled by these dastardly villains. </p>
 <hr>
 <p>Copyright 2009, Phillip T. Conrad, CS Dept, UC Santa Barbara. Permission to copy
  for non-commercial, non-profit, educational purposes granted, provided appropriate
  credit is given;  all other rights reserved. Adapted by Ziad Matni and Mike Castano for this quarter.</p>






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

