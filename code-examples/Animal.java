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

    public Animal(int pLifeExpectancy, String pFood) {
        lifeExpectancy = pLifeExpectancy;
        food = pFood;
    }

    public Animal(String pFood) {
        food = pFood;
    }


    public Animal(int pLifeExpectancy) {
        lifeExpectancy = pLifeExpectancy;
    }

    protected String getFood() {
        return food;
    }


    public String toString() {
        return "This " + getFood() + "eater has a life expectancy of " + lifeExpectancy + " years";
    }
}//class
