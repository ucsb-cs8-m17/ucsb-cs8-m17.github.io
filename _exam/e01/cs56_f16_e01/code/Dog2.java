public class Dog2 {

    private static Dog2 dogOfTheWeek = null;

    private String name;

    public void setAsDog2OfTheWeek() {
	dogOfTheWeek = this;
    }

    public static Dog2 getDog2OfTheWeek() {
	return dogOfTheWeek;
    }

    public Dog2(String name) { this.name = name;}

    public void finalize() {
	System.out.println("Finalizing " + this.name);       
    }

    public static void gc(int i) {
	System.out.println("Line " + i);
	System.gc();
	System.runFinalization ();
	System.gc();
	System.runFinalization ();
    }
    
    public static void doggies() {

	Dog2 d1 = new Dog2("Snoopy");
	Dog2 d2 = new Dog2("Princess");
	Dog2 d3 = new Dog2("Rover");
	Dog2 d4 = new Dog2("Spot");
	Dog2 d5 = new Dog2("Fido");


	d5.setAsDog2OfTheWeek();    /*  1 */ gc(1);
	d2 = d1;                   /*  2 */ gc(2);
	Dog2 d6 = d3;               /*  3 */  gc(3);
	Dog2 temp = d2;             /*  4 */ gc(4);
	d2 = d5;                   /*  5 */ gc(5);
	d5 = temp;                 /*  6 */  gc(6);
	d3 = getDog2OfTheWeek();    /*  7 */ gc(7);
	d1.setAsDog2OfTheWeek();    /*  8 */ gc(8);
	d1 = null;                 /*  9 */ gc(9);
	d2 = null;                 /* 10 */ gc(10);
	d3 = null;                 /* 11 */ gc(11);
	d4 = null;                 /* 12 */ gc(12);
	d5 = null;                 /* 13 */ gc(13);
	d6 = null;                 /* 14 */ gc(14);
	temp = null;               /* 15 */ gc(15);
    } 

    public static void main(String [] args) {
	doggies();
	gc(16);
    }

}
