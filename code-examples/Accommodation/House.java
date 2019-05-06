package Lab5.Accommodation;

/**
 * Created by dbrennan on 4/25/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class House extends Dwelling {
    int noOfRooms;
    int roomArea = 150;
    @Override
    public void display() {
    }

    protected int getNoOfRooms() {
        return noOfRooms;
    }
    protected void setNoOfRooms(int pNoOfRooms){
        noOfRooms = pNoOfRooms;
    }
    protected int calculateAreaOfHouse() {
        return noOfRooms * roomArea;
    }
}//class
