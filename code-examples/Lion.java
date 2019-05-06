package Lab2;

/**
 * Created by dbrennan on 4/10/2019
 * Lion class to create lion objects
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
    }//alternative constructor, includes mane boolean which is used in the toString

    protected int numberOfLions() {
        return noOfLions;
    }//calculates the number of lion objects instantiated 

    protected void setAge(int age) {
        this.age = age;
    }//change the local variable so I could try out 'this' keyword. 'this' is used to distinguise between the class variable and the variable used in the method

    protected String getName(){
        return name;
    }//created a getName method to use it in the output statement in TestAnimal, so it reads '<name> eats <foodType>, has a life expectancy etc'

    public String toString() {
        if (mane) {
            return getName() + super.toString() + " and has a mane";
        } else {
            return getName() + super.toString() + " and does not have a mane";
        }

    }//now it does what was asked, using the toString method setup in the Animal base class. Added the getName method here, as well as adding the has mane/doesn't have mane boolean.
}//class
