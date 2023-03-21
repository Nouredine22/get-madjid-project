package learningjava;

import java.sql.SQLOutput;

public class JavaMethods {

    //A method is a block of code which only runs when it is called.

    static void myMethod(){
        System.out.println("this is a method");

    }
    public static void main(String[] args){

        myMethod();

        // a method can also called a multiple time
        myMethod();
        myMethod();


    }
}
//out put "this is a method"