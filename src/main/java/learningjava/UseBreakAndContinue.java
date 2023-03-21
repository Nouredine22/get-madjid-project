package learningjava;

public class UseBreakAndContinue {

//The break statement can also be used to jump out of a loop.
//The continue statement breaks one iteration (in the loop), if a specified condition occurs, and continues with the next iteration in the loop.

    public static void main(String [] args){

        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                //break;
                continue;
            }
            System.out.println(i);


        }
    }
}








