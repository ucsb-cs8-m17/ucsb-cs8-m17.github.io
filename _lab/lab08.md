---
layout: lab
num: lab08
ready: true
desc: "Continue work on legacy code, perhaps try web programming"
assigned: 2016-11-17 16:00:00.00-8
due: 2016-11-17 19:00:00.00-8
---

THERE IS NOTHING TO SUBMIT FOR THIS LAB.

However, you SHOULD be here in person to consult with your mentor about your progress on your legacy code labs:

* [lab05](/lab/lab05/)
* [lab07](/lab/lab07/)

Check in with your mentor, and be sure that you, pair partner, and your mentor have a DOCUMENTED PLAN in your FEEDBACK repo for how you are going to get to your final 1000 points.

Be sure that you and your mentor are on the same page about what work qualified for your first 500 points.  The TAs are starting TONIGHT to go through and record grades for that.

# OPTIONAL: Webapps

If you like, we have some material&mdash;not necessarily comprehensive or polished&dash;on constructing Java web apps using:

* SparkJava
* Heroku
* MongoDB (a NoSQL database) hosted on mlab.com
* Corgis datasets from Virginia Tech.

You can find information about these topics at the links below.

I had hoped that we would have a a required structured lab on these topics, but with the Thanksgiving break, we have simply run out of time.     However, if you are interested, you are free to explore these.

I will lecture on this topic on the Wednesday before Thanksgiving break for anyone that is interested.  That material is being provided only for your interest, and will not be on the final exam.

# SparkJava

You can learn more about SparkJava, a framework for building webapps in Java, at these links:


* [SparkJava: Getting Started](https://pconrad-webapps.github.io/topics/sparkjava_getting_started/)&mash;this is a starting point that explains a bit about how to work with Maven, which is one of the prerequisistes for getting started with SparkJava.

* [SparkJava: Bootstrap](https://pconrad-webapps.github.io/topics/sparkjava_bootstrap/) This explains how to incorporate Bootstrap, a package of CSS and Javascript files, into a SparkJava webapp so that your User Interface looks "nice".  
    * I put "nice" in quotes, because for some people a Bootstrap based UI is like nails on a chalkboard
    * Nevertheless, it is *definitely* an easy way to get something up quickly, unless/until you want to dive into the gory details of web "design" as opposed to web "programming".

# Heroku

SparkJava webapps can be run on [Heroku](https://pconrad-webapps.github.io/topics/heroku/), a cloud computing platform.

There are at least two ways to deploy a SparkJava app on Heroku:

* Via connecting a github repo to automatically deploy your app on Heroku.   This is straightforward, and you do it through the Heroku website dashboard.  You simply configure your Heroku app to automatically deploy every time you do a push to the `origin master` branch.  This is the way I recommend you work, if you are working primarily on CSIL.
* Via the heroku command line toolbelt (which is great, if you are working on your own computer, where you can install the Heroku toolbelt easily, but it totally isn't worth trying if you are running on CSIL).  This also works fine on your own computer.

We do not yet have documentation for this online, but would be happy to show you how it works.   One we DO have documentation, a link to it will appear here.

# MongoDB

This series of article explains what MongoDB is, and how to use it:

https://pconrad-webapps.github.io/topics/mongodb/

# Incorporating Corgis data into a SparkJava/MongoDB webapp.

These two example repos show how data from the [Virginia Tech Corgis Project](https://think.cs.vt.edu/corgis/) can be incorporated into a Java webapp.

Good, clear instructions are still a work in progress, but for what they are worth, the README.md files do have an "initial attempt" at this:

* <https://github.com/pconrad-webapps/sparkjava-corgis-airlines-demo>
* <https://github.com/pconrad-webapps/sparkjava-corgis-graduates-demo>
