package Lab2;

/**
 * Created by dbrennan on 4/10/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public abstract class Animal {
    private String food;
    private int lifeExpectancy;

    public Animal() {

       }//default constructor

    public Animal(int lifeExpectancy, String pFood) {
        this.lifeExpectancy = lifeExpectancy;
        food = pFood;
    }

    protected String getFood() {
        return food;
    }

    public String toString() {
        return " eats " + getFood() + ", has a life expectancy of " + lifeExpectancy + " years,";
    }
}//class
