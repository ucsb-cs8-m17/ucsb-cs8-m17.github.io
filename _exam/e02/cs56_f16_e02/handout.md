---
layout: examHandoutNoName
num: e02
ready: true
desc: "Midterm Exam E02 Handout"
exam_date: 2016-11-16 12:30:00.00-8
---

<div style="font-size:80%;">

<h2>Code for Amazoony question</h2>

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

## `ButtonDemo.java`

<div style="font-size:95%">

{% highlight java linenos %}
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ButtonDemo {
  private JFrame frame;
  private JLabel label;
  public static void main (String[] args) {
        ButtonDemo gui = new ButtonDemo ();
        gui.go();
  }
  public void go() {
        frame = new JFrame();
        BoxLayout boxLayout = new BoxLayout(frame.getContentPane(), 
                                            BoxLayout.X_AXIS);
        frame.setLayout(boxLayout);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton button1 = new JButton("Button 1");
        button1.addActionListener(new Listener1());
        JButton button2 = new JButton("Button 2");
        button2.addActionListener(new Listener2());
        label = new JLabel("Nothing clicked yet");
        
        frame.getContentPane().add(label);
        frame.getContentPane().add(button1);
        frame.getContentPane().add(button2);
        frame.setSize(400,100);
        frame.setVisible(true);
  }
    
  class Listener1 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Button 1 clicked");
        }
    }

  class Listener2 implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            label.setText("Button 2 clicked");
        }
    }

}
{% endhighlight %}
</div>

