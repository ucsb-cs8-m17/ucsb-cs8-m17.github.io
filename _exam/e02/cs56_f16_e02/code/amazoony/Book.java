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
