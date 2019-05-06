package Lab5.Accommodation;

/**
 * Created by dbrennan on 4/25/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public abstract class Accommodation {
    private static int nextRefNumber = 1001;
    private int refNumber;


    public abstract void display();

    public Accommodation() {
        refNumber = nextRefNumber;
        nextRefNumber++;
    }//DEFAULT CONSTRUCTOR




}//class
