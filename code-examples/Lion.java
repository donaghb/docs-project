package Lab2;

/**
 * Created by dbrennan on 4/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class Lion extends Animal {
    private static int noOfLions = 0;
    private int age;
    private String name;
    private String gender;

    public Lion() {
        super();
        noOfLions++;
    }//default constructor

    public Lion(String pFood, int pLifeExpectancy, int pAge, String pName, String pGender) {
        super(pLifeExpectancy, pFood);
        age = pAge;
        name = pName;
        gender = pGender;
        noOfLions++;
    }

    protected String mane () {
        String mane;
        if (gender == "male") {
            mane = "a mane";
        }// if statement
        else {
            mane = "no mane";
        }//else statement
        return mane;

    }
    protected int numberOfLions() {
        return noOfLions;
    }

    protected void setAge(int pAge) {
        this.age = pAge;
    }

    public String toString() {
        return name + ", the lion is " + age + " years old, eats " + getFood() + " and has " + mane();
    }
}//class
