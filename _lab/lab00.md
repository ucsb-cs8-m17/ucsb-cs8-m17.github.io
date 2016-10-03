---
layout: lab
num: lab00
ready: true
desc: "Getting Started"
assigned: 2016-09-22 09:30:00.00-7
due: 2016-09-29 21:00:00.00-7
---


If you find typos or problems with the lab instructions, please report them on Piazza

Step 0: Getting oriented
========================

Chances are you are already familiar with all of the following because you already took CS courses that used this stuff (i.e. CS8, CS16, CS24, CS32).

If not--if for example, you are a transfer student and this is your first CS course using the CSIL Lab resources, please let your TA know and he/she will help you find resources to come up to speed on these things. Or, your TA can assign you a pair partner that knows this stuff and doesn't mind helping you come up to speed.

-   knowing your College of Engineering/CSIL computer account username/password--and having an active working account.
-   knowing how to login to the systems in Phelps 3525 and the CSIL lab, and bring up both a web browser, and a terminal window.
-   knowing that "CSIL" is both a server you can log into, as well as a physical room full of computers--and knowing where to find that physical room, and what hours it is open.
-   knowing how to use a **basic text editor such as emacs or vim** to edit files on the Linux systems in Phelps 3525 and CSIL.
-   knowing basic Unix/Linux commands to create directories, change directory, manipulate files, etc., e.g. mkdir, cd, pwd, mv, rm, ls.

The rest of these instructions will assume you know all of the above. If not, then let your TA know, and we'll point you to resources where you can come up to speed.


As a separate item, you should also know how to connect to CSIL from your own computer (PC/Mac/Linux)

-   Windows: Putty, optionally with XMing. See for example: [CSIL Access:Windows](https://foo.cs.ucsb.edu/56wiki/index.php/CSIL_Access:Windows).   Note that a better option than PuTTY/XMing may be [MobaXTerm](http://mobaxterm.mobatek.net/), since it integrates ssh and X11 access into a single free tool.
-   Mac/Linux: `ssh` `-Y` `username@csil.cs.ucsb.edu`, [CSIL Access:Mac and Linux](https://foo.cs.ucsb.edu/56wiki/index.php/CSIL_Access:Mac_and_Linux).

But, you don't need that for today's lab---so let's continue.

The rest of the lab: Step-by-Step
=================================


Here is an overview of the remaining steps in the lab:

0. If you didn't already do it:
    - Create a github.com account
    - Fill out the form at <http://bit.ly/cs56-f16-survey>
1. Visit <https://github.ucsb.edu> and login with your CSIL account, to establish your github.ucsb.edu account.

2. Login to your CSIL account, and create a ~/cs56 subdirectory.

3. In that directory, use your favorite text editor to create a file containing
 the following code.  Call the file `HelloWorld.java`.  Put your name instead of `Your Name Here`.

```java

/**
  @author Your Name Here
*/

public class HelloWorld {

  public static void main(String[] args) {
    System.out.println("Hello, World!");
  }

}
```

4. Compile the file with the command `javac HelloWorld.java`

5. Run the file with the command `java HelloWorld`

6. Navigate to `submit.cs.ucsb.edu`.   

7. Join the class CS56_f16 

8. The next step is to submit your work to submit.cs for grading.  The way
   you do that depends on whether you are working on one of the CSIL machines,
   or on your own computer.   

   If you are working on CSIL, use the command:

   ```
   ~submit/submit -p 524 HelloWorld.java
   ```

   If you are working on your own machine, visit: 

   <https://submit.cs.ucsb.edu/form/project/524/submission>

9. Once you see that you have a score of 100 for the lab, you are *almost*
   finished with lab00.  There is, however, one more step.

   Much of the work for the first part of this course will be done in pairs.
   
   Find a pair partner to work with, and let one of the
   mentors know who that person will be.
   
   It is best to choose on the basis of your level of your prior experience with Java, as well as
   compatible schedules.

   The mentor will record your choice on the course website by
   first name, and last initial on the "Team" pages.   Be sure that your name appears there
   together with your pair partner's name on your team page before you leave lab today.
   
