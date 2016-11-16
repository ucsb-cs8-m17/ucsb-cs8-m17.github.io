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
