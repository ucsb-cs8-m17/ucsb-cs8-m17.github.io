---
num: "Lecture 10"
desc: "corgis databases, ant properties, sorting with lambdas"
ready: false
date: 2016-10-31 12:30:00.00-7:00
---


# Corgis databases

* <https://think.cs.vt.edu/corgis/java/airlines/airlines.html>
* <https://github.com/UCSB-CS56-pconrad/corgis-airlines-demo-01>

# Ant properties

* Variable like things in a build.xml file that you can use to factor out common values
* We want build.xml files, just like code, to be DRY (don't repeat yourself)
* See also: <http://ucsb-cs56-pconrad.github.io/topics/ant_properties/>

# Bundling one jar in another

* See the `jar` task in the `build.xml` of <https://github.com/UCSB-CS56-pconrad/corgis-airlines-demo-01>
* We use `zipgroupfileset` to specify that we want to include the jar file supplied by the corgis project into our jar file
* We got the idea to use `zipgroupfileset` from [this stack overflow article](http://stackoverflow.com/questions/3770071/including-external-jar-files-in-a-new-jar-file-build-with-ant)

# Running from a jar file

```
-bash-4.3$ java -cp build/corgiAirlines.jar edu.ucsb.cs56.corgis.airlines.demos.ExampleStringSort
[BOS, EWR, JFK, LAX, OAK, PHX, SAN, SBA, SFO, SJC, SNA]
-bash-4.3$
```

# Sorting with lambdas

In [ExampleSort01.java](https://github.com/UCSB-CS56-pconrad/corgis-airlines-demo-01/blob/master/src/edu/ucsb/cs56/corgis/airlines/demos/ExampleSort01.java) we use a lambda to sort by Airport Code

```java
    public static void main(String[] args) {
        // Get access to the library
        AirlinesLibrary airlinesLibrary = new AirlinesLibrary();
        // Access data inside the library
        ArrayList<Airline> list_of_airline = airlinesLibrary.getReports(true);

 	      Collections.sort(list_of_airline,
			    (a1,a2) ->
			      a1.getAirport().toString().compareTo(a2.getAirport().toString()));
	
        AirlinePrinter.printNicely(list_of_airline);
    }
```

The main class of [ExampleSort02.java](https://github.com/UCSB-CS56-pconrad/corgis-airlines-demo-01/blob/master/src/edu/ucsb/cs56/corgis/airlines/demos/ExampleSort02.java) is identical except for the lambda expression;
here we sort by airline code (Carrier, e.g. AA for American Airlines, DL for Delta, etc.)

```java
 		Collections.sort(list_of_airline,
			 (a1,a2) ->
			 a1.getCarrier().toString().compareTo
			         (a2.getCarrier().toString()));
```


