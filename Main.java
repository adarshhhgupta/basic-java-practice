import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String adjective1, noun1, adjective2, verb1, adjective3;
        
        System.out.print("Enter an adjective: ");
        adjective1 = in.nextLine();

        System.out.print("Enter an noun: ");
        noun1 = in.nextLine();

        System.out.print("Enter an adjective: ");
        adjective2 = in.nextLine();

        System.out.print("Enter an verb: ");
        verb1 = in.nextLine();

        System.out.print("Enter an adjective: ");
        adjective3 = in.nextLine();

        System.out.println(" \nToday I went to a " + adjective1 + " zoo . ");
        System.out.println(" In a exhibit I saw a " + noun1 + " . ");
        System.out.println(noun1 + " was " + adjective2 + " and " + verb1 + "!");
        System.out.println(" I was " + adjective3 + "!");

        in.close();




    }
}