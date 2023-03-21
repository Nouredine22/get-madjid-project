package learningjava;

public class ConstrutorsJava {

    int m;  //create attributes

    // create a class constructor for the constructor class
    public ConstrutorsJava() {
        m = 5; // Set the initial value for the class attribute m .
    }
        public static void main(String[] args){

        ConstrutorsJava myObj = new ConstrutorsJava(); // create an object of class main (this will call the constructor)
            System.out.println(myObj.m);// this will print the value of m
                                         // OUTOUT will be 5


    }




    }

