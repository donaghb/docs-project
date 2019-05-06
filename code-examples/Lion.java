package Lab2;

/**
 * Created by dbrennan on 4/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Lion extends Animal {
    private static int noOfLions = 0;
    private int age;
    private String name;
    private boolean mane = false;

    public Lion() {
        super();
        noOfLions++;
    }//default constructor

    public Lion(String pFood, int pLifeExpectancy, int pAge, String pName, boolean mane) {
        super(pLifeExpectancy, pFood);
        age = pAge;
        name = pName;
        this.mane = mane;
        noOfLions++;
    }

    protected int numberOfLions() {
        return noOfLions;
    }

    protected void setAge(int pAge) {
        this.age = pAge;
    }

    protected String getName(){
        return name;
    }

    public String toString() {
        if (mane) {
            return getName() + super.toString() + " and has a mane";
        } else {
            return getName() + super.toString() + " and does not have a mane";
        }

    }
}//class
