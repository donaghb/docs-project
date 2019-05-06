package Lab5.Accommodation;

/**
 * Created by dbrennan on 4/25/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public final class SemiDetached extends House {
    protected String relative;

    protected String hasRelative () {
        String hasRelative;

        if (relative == "yes") {
            hasRelative = "a relative lives in the connected property";
        }// if statement
        else {
            hasRelative = "a relative does not lives in the connected property";
        }//else statement
        return hasRelative;
    }

}//class
