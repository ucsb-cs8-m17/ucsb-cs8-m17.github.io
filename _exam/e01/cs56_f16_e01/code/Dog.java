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

    public void finalize() {
	System.out.println("Finalizing: " + this.name);
    }

    public static void gc() {
	StackTraceElement ste = Thread.currentThread().getStackTrace()[2];
	String where =
	    ste.getClassName() + " "
	    + ste.getMethodName()
	    + " " + ste.getLineNumber() + " ";
	System.out.println("Requesting gc at: " + where);
	System.gc(); System.runFinalization ();
	System.gc(); System.runFinalization ();
    
    }

}
