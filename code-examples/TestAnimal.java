package Lab2;

/**
 * Created by dbrennan on 4/14/2019
 * COMMENTS ABOUT PROGRAM HERE
 */
public class TestAnimal {
    public static void main(String[] args) {
        Lion Lion1 = new Lion("antelope", 15, 6, "Leo", true );
        Lion Lion2 = new Lion("gazelle", 17, 4, "Lynda", false );

        Lion1.setAge(3);

        System.out.println(Lion1);
        System.out.println(Lion2);
        System.out.println("There are " + Lion2.numberOfLions() + " lions");

    }//main
}//class
