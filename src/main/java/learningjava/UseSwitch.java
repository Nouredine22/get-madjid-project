package learningjava;

public class UseSwitch {


    //Instead of writing many if..else statements, you can use the switch statement.
    //
    //The switch statement selects one of many code blocks to be executed:

    public static void main(String[] args){

        int day = 4;

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

                // the output will be Thursday
        }

    }
}
