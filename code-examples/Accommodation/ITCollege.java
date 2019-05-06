package Lab5.Accommodation;

/**
 * Created by dbrennan on 4/25/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public final class ITCollege extends ThirdLevel {
    static String willApply;
    protected String changeStatus () {
        String techUni;
        if (willApply == "yes") {
            techUni = "will apply for Tech University status";
        }// if statement
        else {
            techUni = "will apply for Tech University status";
        }//else statement
        return techUni;
    }

}//class
