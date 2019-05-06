package Lab5.Accommodation;

/**
 * Created by dbrennan on 4/25/2019
 * COMMENTS ABOUT PROGRAM HERE
 */


public final class TechUniversity extends ThirdLevel {
    //    INSTANCE VARIABLES
    private int collegeNumber;

    //    GET METHODS
    protected int getNumberOfColleges() {
        return collegeNumber;
    }//getNumber
    //    SET METHODS
    protected void setNumberOfColleges (int pCollegeNumber) {
        collegeNumber = pCollegeNumber;
    }

}//class
