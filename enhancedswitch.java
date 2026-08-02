//Enhanced switch = A replacement to many else if statement, JAVA 14 feature

import java.util.Scanner;

public class enhancedswitch {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println("Enter any day from week: ");
        String day = in.nextLine();
        /* this is long way of writing switch statement
        switch(day){
            case "Monday" -> System.out.println("It is a weekday");
            case "Tuesday" -> System.out.println("It is a weekday");
            case "Wednesday" -> System.out.println("It is a weekday");
            case "Thursday" -> System.out.println("It is a weekday");
            case "Friday" -> System.out.println("It is a weekday");
            case "Saturday" -> System.out.println("It is a weekend");
            case "Sunday" -> System.out.println("It is a weekend");
            default -> System.out.println(day + "is not a valid day");
        } */

            // this is short way of writing using enhanced switch statement
        switch(day){
            case "Monday", "Tuesday", "Wednesday", "Thursday", "Friday" -> 
                System.out.println("It is a weekday");
            case "Saturday", "Sunday" -> 
                System.out.println("It is a weekend");
            default -> 
                System.out.println(day + "is not a valid day");
        }

        in.close();
    }
    
}
