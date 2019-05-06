package Lab5.Accommodation;

/**
 * Created by dbrennan on 4/25/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public final class Manufacture extends Industrial {
    private final int AREAOFUNIT = 500;
    private int noOfUnits;
    protected double calculateareaOfManufacturing(){
        return AREAOFUNIT * noOfUnits;
    }
    @Override
    public void display() {
        
    }

    protected int getNoOfUnit(){ return noOfUnits;}//GET METHOD
    protected void setNoOfUnit(int pNoOfUnits) {
        noOfUnits = pNoOfUnits;
    }//Set Method

}//class
