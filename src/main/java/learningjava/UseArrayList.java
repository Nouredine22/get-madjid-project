package learningjava;

import java.util.ArrayList;

public class UseArrayList {

    //The difference between a built-in array and an ArrayList in Java, is that the size of an array cannot be modified

    // create an arraylist object called Cars that will store strings:

    public static void main(String[] args){

        ArrayList<String> cars = new ArrayList<String>();

        cars.add("Volvo");
        cars.add("bmw");
        cars.add("ford");
        cars.add("mercedes");


        System.out.println(cars);
    }

}
