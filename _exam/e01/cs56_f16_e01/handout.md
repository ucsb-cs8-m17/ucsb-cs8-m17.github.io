---
layout: examHandoutNoName
num: e01
ready: true
desc: "Midterm Exam E01 Handout"
exam_date: 2016-10-19 12:30:00.00-7
---

## INSTRUCTIONS FOR QUESTION 1

The `TBD` class is intended to represent FILL THIS IN.

For each TBD, we need to be able to store:

* attribute
* another attribute
* yet another attribute

For your convenience, you may assume that there is a `Bar` class available to you with:

* list constructors and methods here

Your job is to write the public class `TBD`, with all of the following:

<style>
  div.enclosed-list-uses-lower-alpha ol li {
  list-style-type: lower-alpha;
  }
</style>

<div class="enclosed-list-uses-lower-alpha" markdown="1">

1. (8 pts) Correct syntax and structure of a Java class.
1. (7 pts) Private instance variables for the data members (attributes)
1. (7 pts) A two-argument constructor that takes arguments for TBD

   Example invocation:
   
   ```java
   TBD FILL THIS IN

   ```

1. (7 pts) getter methods called TBD that return appropriate values
1. (7 pts) an appropriate .equals method
1. (7 pts) an appropriate .hashCode method
1. (7 pts) a correct `toString()` method.  The method should return a representation of
    the aircraft object in a format that follows these examples.   

   ```
   TBD

   ```

   
</div>

Note that for *this* exam, you do NOT need to include Javadoc comments.

Total Points: <span class="pointCount">Total points: ?</span>

<h2 class="page-break-before">Code for Question 6</h2>

{% highlight java linenos %}
public class Dog {

    private static Dog dogOfTheWeek = null;
    private String name;

    public void setAsDogOfTheWeek() {
	dogOfTheWeek = this;
    }

    public static void resetDogOfTheWeek() {
	dogOfTheWeek = null;
    }

    public static Dog getDogOfTheWeek() {
	return dogOfTheWeek;
    }

    public Dog(String name) { this.name = name;}

    public static void main(String [] args) {

	Dog d1 = new Dog("Fido");
	Dog d2 = new Dog("Princess");
	Dog d3 = new Dog("Rover");
	Dog d4 = new Dog("Snoopy");
	Dog d5 = new Dog("Spot");
	Dog d6 = d2;
	
	d4.setAsDogOfTheWeek();  gc();    
	d5 = d2;                 gc();                   
	Dog temp = d3;           gc();             
	d3 = d5;                 gc();                   
	d5 = temp;               gc();                 
	d3 = getDogOfTheWeek();  gc();    
	d1.setAsDogOfTheWeek();  gc();    
	d6 = null;               gc();
        d5 = null;               gc();			
	d4 = null;               gc();                 
	d3 = null;               gc();                 
	d2 = null;               gc();                 
	d1 = null;               gc();                 
	temp = null;             gc();
	resetDogOfTheWeek();     gc();
    }                              

    public static void gc() {
     // ... encourage garbage collection
    }     

}
{% endhighlight %}
