---
layout: examHandoutNoName
num: e03
ready: true
desc: "Final Exam E03 Handout"
exam_date: 2016-12-06 12:00:00.00-8
---

<div style="font-size:80%;">

<h2>Code for Amazany question</h2>

## Product.java
{% highlight java linenos %}
/** something that can be sold */
public abstract class Product {
    
    /** get the price (in cents) */
    public abstract int getPrice();
    
}

{% endhighlight %}

## Shippable.java

{% highlight java linenos %}
/** something that can be shipped */
public interface Shippable {
    /** get the shipping weight in pounds */
    public double getWeight();
}

{% endhighlight %}


## Book.java

{% highlight java linenos %}
/** A Book */
public class Book extends Product implements Shippable {

    private int price;
    private double weight;
    private String author;
    private String title;

    public Book(String author, String title, int price,
                double weight) {
        this.author = author;
        this.title = title;
        this.price = price;
        this.weight = weight;
    }

    public int getPrice() {return this.price;}
    public String getTitle() {return this.title;}
    public String getAuthor() {return this.author;}
    public double getWeight() {return this.weight;}
}
{% endhighlight %}

## Song.java

{% highlight java linenos %}
/** A downloadable Song */
public class Song extends Product {

    private int price;
    private String artist;
    private String title;

    public Song(String artist, String title, int price) {
        this.artist = artist;
        this.title = title;
        this.price = price;
    }

    public Song(String artist, String title) {
        this(artist,title,99);
    }

    public int getPrice() {return this.price;}
    public String getTitle() {return this.title;}
    public String getArtist() {return this.artist;}

}
{% endhighlight %}
</div>


<div class="page-break-before">&nbsp;
</div>


## `Dog.java`

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
	Dog d6 = d4;
	
	d3.setAsDogOfTheWeek();  gc();    
	d2 = d4;                 gc();                   
	Dog temp = d1;           gc();             
	d1 = d6;                 gc();                   
	d5 = temp;               gc();                 
	d2 = getDogOfTheWeek();  gc();    
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


<div class="page-break-before" markdown="1">
# class `java.util.ArrayList<E>`
</div>



<div style="font-size:90%; font-family: Arial Narrow, sans-serif;">

The following excerpts from the javadoc for `java.util.ArrayList<E>` may be
helpful to you in completing this exam.


## Inheritance Hierarchy (complete)

```
java.lang.Object
  java.util.AbstractCollection<E>
    java.util.AbstractList<E>
      java.util.ArrayList<E>
```

<div markdown="1"
     style="font-size: 80%; font-family: Arial Narrow, sans-serif;"
     class="hanging-indent-table">

| All Implemented Interfaces: | `Serializable, Cloneable, Iterable<E>, Collection<E>, List<E>, RandomAccess` |
| Direct Known Subclasses: | `AttributeList, RoleList, RoleUnresolvedList` |

</div>

## Constructors (complete)

<div markdown="1" class="hanging-indent-table">

| `ArrayList()` | Constructs an empty list with an initial capacity of ten.
| `ArrayList(Collection<? extends E> c)` | Constructs a list containing the elements of the specified collection,<br>in the order they are returned by the collection's iterator. |
| `ArrayList(int initialCapacity)` | Constructs an empty list with the specified initial capacity. |

</div>

## Most important methods, with brief description

<div markdown="1" class="hanging-indent-table">

| `boolean` | `add(E e)` | Appends the specified element to the end of this list. |
| `void` | `add(int index, E element)` | Inserts the specified element at the specified position in this list. |
| `void` | `clear()` | Removes all of the elements from this list.|
| `E` | `get(int index)` | Returns the element at the specified position in this list. |
| `int` | `indexOf(Object o)` | Returns the index of the first occurrence of the specified element in this list, <br>or -1 if this list does not contain the element. |
| `boolean` | `isEmpty()` | Returns true if this list contains no elements. |
| `int`	|  `lastIndexOf(Object o)` | Returns the index of the last occurrence of the specified element in this list,<br>or -1 if this list does not contain the element. |
| `E` | `remove(int index)` | Removes the element at the specified position in this list.|
| `boolean` | `remove(Object o)` | Removes the first occurrence of the specified element from this list, if it is present. |
| `E` | `set(int index, E element)` | Replaces the element at the specified position in this list with the specified element. |
| `int` | `size()` | Returns the number of elements in this list. |
| `void` | `sort(Comparator<? super E> c)` | Sorts this list according to the order induced by the specified `Comparator`. |

</div>

## Additional methods, listed by method signature only.

<div markdown="1" class="hanging-indent-table">

| `boolean addAll(Collection<? extends E> c)` | `boolean	addAll(int index, Collection<? extends E> c)` |
| `Object   clone()` |  `boolean  contains(Object o)` |
| `void	   ensureCapacity(int minCapacity)` | `void forEach(Consumer<? super E> action)` |
| `Iterator<E> iterator()` | `ListIterator<E>  listIterator()` |
| `ListIterator<E> listIterator(int index)` | `boolean removeAll(Collection<?> c)` |
| `boolean removeIf(Predicate<? super E> filter)` | `protected void removeRange(int fromIndex, int toIndex)` |
| `void replaceAll(UnaryOperator<E> operator)` | `boolean retainAll(Collection<?> c)` |
| `Spliterator<E>  spliterator()` | `List<E> subList(int fromIndex, int toIndex)`
| `Object[] toArray()` | `<T> T[] toArray(T[] a)` |
| `void    trimToSize()` | |

</div>

## Methods inherited from:

<div markdown="1" class="hanging-indent-table">

| `class java.util.AbstractList` | `equals, hashCode` |
| `class java.util.AbstractCollection` | `containsAll, toString` |
| `class java.lang.Object` | `finalize, getClass, notify, notifyAll, wait, wait, wait` |
| `interface java.util.List` |  `containsAll, equals, hashCode` |
| `interface java.util.Collection` |  `parallelStream, stream` |

</div>

<div style="margin-top: 2em; margin-bottom: 2em;">
&nbsp;
</div>


<h2 class="page-break-before">Hints for `.equals()`</h2>


As a reminder, a properly written overridden `.equals()` method:

* Takes an `Object o` as its parameter
* Returns a `boolean` value
* Checks each of the following conditions, and for each, returns an appropriate result:
   * Does `o` refer to the same object as the one on which the .equals method was invoked? 
   * Is `o` a null reference?
   * If `o` an instance of some other class, i.e. `getClass() != o.getClass()`
   * Typecasts `o` to an instance of the current class, and then compares values appropriately.





