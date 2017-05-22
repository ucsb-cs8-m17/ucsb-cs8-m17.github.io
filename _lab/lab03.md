---
layout: lab
num: lab03
ready: true
desc: "First look at Legacy Code"
assigned: 2016-10-13 16:00:00.00-7
due: 2016-10-26 12:00:00.00-7
last_before: Midterm Exam
gauchospace_link: https://gauchospace.ucsb.edu/courses/mod/assign/view.php?id=681773
mdname: F16_lab03
---

Before you begin this lab, you should be officially assigned to a mentor and to a pair.

(In rare cases, we may allow trios, or individuals, but only with official permission from the instructor.  If you are solo or trio programming, see [this note](solo_trio/).)


If you have not yet been assigned to a mentor and pair, please contact your TA or instructor.


Together with your pair partner, you will do the following steps.   Note: this list is just an <em>overview</em> of the entire process, so that you can see a <em>short</em> list of all the things you need to do.   You'll have to consult the rest of the instructions for details.

1. Consult the web page [https://ucsb-cs56-f16.github.io/info/projects/](https://ucsb-cs56-f16.github.io/info/projects/) to check that it accurately reflects your mentor, github id, pair partner, and pair partner's github id.  
   * If you are not on the list, or if there is any error consult a mentor, TA or instructor to fix it.
1. Then, find the legacy repo to which you've been assigned.  If you haven't been assigned a repo, ask your mentor to assign you and your pair 
   partner to a repo.
2. Once you've been assigned to a repo, the pair partner with the github id that comes "first" in the alphabet should fork the repo to their own githubid.   We'll call this person "pair partner 1".
3. Then, pair partner 1 should add pair partner 2 as a collaborator (and if applicable, pair partner 3).
3. Whoever is driving, clone the forked repo to the computer where you are working (this may be a directory on CSIL, or it may be
   your own laptop or desktop machine.  If it is your own computer, you'll need to install Java 8 and Ant.)
4. Once you have cloned the *forked* repo, create a file called <tt>{{site.qtr}}_{{page.num}}.md</tt> in the root directory of the repo.   In this file, 
   at the top, put both pair partner's names (if you prefer you may use first name last initial, e.g. Selena G., Justin T.)
5. In that file, using Markdown formatting, write answers to the questions listed below in the section <strong>{{site.qtr}}_{{page.num}}.md instructions</strong> below.    There are more detailed instructions below.
   * Don't know Markdown? Check out this [cheat sheet](https://github.com/adam-p/markdown-here/wiki/Markdown-Cheatsheet)!
6. Commit that file to the forked repo, then do a pull request back to the UCSB-CS56-Project repo you forked from.
7. Once you've done the pull request, record that you've done the pull request on Gauchospace, following the instructions [here]({{page.gauchospace_link}}).

Then you are finished with {{page.num}}, and your first encounter with legacy code.

# Find the list of "issues" for the project, and read through them.

For each repo, there is a list of known "issues".

* These are found on github.com on the ORIGINAL repo that you forked from, the one under https://github.com/UCSB-CS56-Projects
*  They will not be on your forked copy.
*  IMPORTANT: When *adding* new issues, you will add them *directly* on the UCSB-CS56-Projects version of the repo, not on the forked copy.

You'll be trying to understand those issues, as well as determine additional issues that could be added.

In the end, you are doing the steps you'd need to do to "get ready" to take on this as your legacy code project.  

# {{site.qtr}}_{{page.num}}.md instructions

Your next set of steps will be, in general, to learn about the project, and write about the current state of the project  Your goal is to understand what the project is about, identifying things that are good, and things that could be improved.  

In the root directory of your forked copy of the project repo, <strong>add a file called <tt>{{page.mdname}}</tt></strong> in which you write a short assessment of your findings.  

This file <tt>{{page.mdname}}</tt> should include the following.  (If you are having trouble knowing how to complete these steps, read through the rest of the lab instructions, including the "frequently asked questions" section below before asking for help.)  

* (a) (20 pts) A brief description of the project.  Here, I'm looking for a short description: probably 1 sentence, 2-3 at most.
* (b) (20 pts) a set of user stories (as a X I can Y so that Z) that describe what the current software in its current state can do.
* (c) (20 pts) a brief assessment of whether the software runs or not.   If it runs, briefly describe what it does,  
* (d) (20 pts) a set of user stories (at least 2, but you are encouraged to write up to 4 or more if you can, as many as you think is reasonable) about features that COULD be added to the software to make it more useful, fun, better, etc.
* (e) (20 pts) An assessment of the current quality of the README.md.   What information could be added to make it easier for the next generation of folks maintaining this code to use the software, and/or maintain the software? 
* (f) (20 pts) An assessment of the current state of the build.xml file.   Are there targets that need descriptions?  Is there old legacy JWS stuff that needs to be removed?  (More on this below).
* (g) (20 pts) An assessment of the current "issues".  Are there enough issues that you could earn 1000 points by working on this project?   Are the issues clear in terms of what the expectations are?
* (h) (20 pts) A list of additional issues that you may have added, if any. For each, a link to the issue is good enough.
* (i) (100 pts) Most important: an assessment of the actual code.  Write a bit about how the code is organized.  Are the purposes of the classes, and their methods clear?  Is it obvious how the classes relate to one another?   Is the code easy to read and understand?   If you had to give someone else that was going to work on the code just "one screenful of text" to help that programmer get up to speed quickly, what information would you convey?
* (j) (40 pts) Related to code quality, but factored out into a separate issue because it is so important: how is the test coverage?   Are there JUnit tests at all?  If so, how much of the project is covered by testing?  Are there opportunities to expand test coverage, and if so, how would you go about it?

# When you are done... do a pull request

When you are finished, do a pull request back to original repo that you forked from.   The pull request will typically only be the change of adding your {{page.mdname}}, unless you went ahead and made some changes to improve the project.  If you did, those changes will count towards a future project grade.

Your mentor will comment on the pull request, and then your TA will "accept" the pull request when your submission is graded.  The grade will put into Gauchospace, and your feedback will be added to your feedback repo.

# Fill out the info on Gauchospace

On Gauchospace, at {{page.gauchospace_link}} fill in the requested information (including the name of your pair partner).

It is ok if only one pair partner adds all of the links on Gauchospace, but the <strong>second partner should at least make a submission on Gauchospace that mentions the name of their pair partner, so that we can record your grade for both pair partners.</strong>

# Frequently Asked Questions

## Is this the project we'll be working on the rest of the quarter 

Maybe yes, maybe no.   Its <em>partially</em> up to you.

You will be given that option&mdash;but you'll also have the option to switch to another project.  So part of this exercise is also to see whether you think this project is interesting enough that you want to stick with it, or whether you want to trade away for some other project.

If you trade away, then you'll contribute your project into a "pool" of available projects.  Once that pool is established, you'll be invited to rank the projects in that pool by your preferences.  Then, based on preferences plus an element of random chance to break ties, we'll make a second project assignment.   You are not guaranteed to get your first choice, but historically, most folks have gotten their first, second, or third choice in that second round.

## If we find things that need to be fixed, should we fix them? 

Note that ACTUALLY making code changes is NOT part of this lab.    You MAY do that, but it isn't necessary at this stage. 

Why it might be a good idea to go ahead:

* If you DO decide, together with your pair partner, that you WANT to take this project on as your legacy code project for the course, then you MAY go ahead and start making those changes.  
* If you do, you'll be a little bit "ahead" of the work you need to do later in the quarter.
* You might need to fix a few small things just to be able to compile and run.  Feel free to do that.

Why it might be a good idea to wait: 

* If you are NOT going to be taking on this project as YOUR legacy code project, but instead, are planning to take your chances on the second round selection process, you might be doing extra work by starting now.

## I don't even know where to start.  Can you help?

If you are having trouble getting started, I suggest that together with your pair partner, you take turns driving/navigating through these steps. You can use regular or strong-style pairing, as you see fit.

1. Put your name, your partner's name, and each of your github ids in the  file.
2. Read the README.md file and try to understand what the project is about.
3. Read the "issues" on github.com (these will be on the ORIGINAL repo that you forked from) and try to understand what each one is asking the programmer to do.
4. Run the ant build.xml file with <code>ant -p</code> and see what the ant targets are.  Then also look into the build.xml file directly&mdash;if there are some targets that don't have description elements but SHOULD, that's something to notice.
5. Try compiling and running the code and see if the code actually works or not.

Once you've done all of that, invite your mentor to come over and talk with you about the repo you were assigned.  Your mentor will likely be familiar with the project already&mdash;over the last couple of weeks, they spent some time looking at it.  Along with your mentor, come up with a plan for some things you can do in about 2-3 hours time that can improve the code somewhat.  These may include:

1. Writing proposals for improving the README (perhaps with screenshots, developer documentation, and build/usage instructions)
1. Identifying bugs with the project
1. Looking at test coverage (and noting which portions of the project have no test coverage)
1. Suggesting additional features and adding them as issues
1. Identify portions of codebase that can be cleaned up and refactored and create corresponding issues
1. Commenting on existing issues to ask clarifying questions, or point out any parts of the issues that are unclear.  Ask yourself---if I were assigned to work on this, would I know what to do and where to start? Or would I be confused and have questions? If its the latter, ask the questions in the comments.

Code related stuff:

1. Identify uncommented portions of codebase, add normal and Javadoc comments to that portion of codebase, and/or change variable and method names to ones that make comments unnecessary/superfluous.
1. Read build.xml and attempt to identify unnecessary/obsolete/confusing portions of build script and make corresponding issues.
1. Checking package names to see whether they correspond to the preferred naming convention for legacy code projects.
1. Check public, private, "package private" for attributes and methods.
1. If there are objects that have too much functionality bundled into them, but they should be refactored into multiple smaller objects, make this observation.

Write all of your observations in the {{page.mdname}} file.

## Low Hanging Fruit 

Low Hanging Fruit means <b>some specific <i>easy</i> things you can do to improve the code!</b>

We may add some hints as to what those things might be here, so refresh and revisit this page often.

If/when we do add new material, we'll post on Piazza.

## What happens after this lab?

In your next encounter with legacy code, you'll start working on the "issues" that you read about during your first encounter, either for this same project, or for some other project to which you are assigned.

After the first midterm, we'll update you on how the next round will go, and what your choices are in terms of staying with the project to which you were initially assigned, or possible switching to a different project.

----



<div style="display:none;">
http://ucsb-cs56-f16.github.io/lab/lab03
</div> 

