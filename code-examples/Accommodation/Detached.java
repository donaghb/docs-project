package Lab5.Accommodation;

/**
 * Created by dbrennan on 4/25/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public final class Detached extends House{
    static String garden;


    protected String hasGarden () {
        String hasGarden;
        if (garden == "yes") {
            hasGarden = "includes a garden";
        }// if statement
        else {
            hasGarden = "does not include garden";
        }//else statement
        return hasGarden;
    }

    protected boolean inclGarden () {

        final boolean b = true;
        return b;
    }

}//class
