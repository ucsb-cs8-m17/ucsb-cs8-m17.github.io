public class Dog {

    private static Dog dogOfTheWeek = null;

    private String name;

    public void setAsDogOfTheWeek() {
	dogOfTheWeek = this;
    }

    public static Dog getDogOfTheWeek() {
	return dogOfTheWeek;
    }

    public Dog(String name) { this.name = name;}

    public static void main(String [] args) {

	Dog d1 = new Dog("Snoopy");
	Dog d2 = new Dog("Princess");
	Dog d3 = new Dog("Rover");
	Dog d4 = new Dog("Spot");
	Dog d5 = new Dog("Fido");


	d5.setAsDogOfTheWeek();    /*  1 */
	d2 = d1;                   /*  2 */
	Dog d6 = d3;               /*  3 */
	Dog temp = d2;             /*  4 */
	d2 = d5;                   /*  5 */
	d5 = temp;                 /*  6 */
	d3 = getDogOfTheWeek();    /*  7 */
	d1.setAsDogOfTheWeek();    /*  8 */
	d1 = null;                 /*  9 */
	d2 = null;                 /* 10 */
	d3 = null;                 /* 11 */
	d4 = null;                 /* 12 */
	d5 = null;                 /* 13 */
	d6 = null;                 /* 14 */
	temp = null;               /* 15 */
    }                              /* 16 */
}
