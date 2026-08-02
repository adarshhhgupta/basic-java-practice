//weightconverterprogram

import java.util.Scanner;
public class weightconverter {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double weight, newWeight;
        int choice;

        System.out.println("Weight conversion program");
        System.out.println("1. Convert lbs to kgs");
        System.out.println("2. Convert kgs to lbs");

        System.out.print("Enter your choice 1 || 2: ");
        choice = in.nextInt();

        if(choice == 1)
        {
            System.out.println("Enter your weight in lbs only");
            weight = in.nextDouble();

            newWeight = weight * 0.453592;
            System.out.println("New unit weight after conversion is: " + newWeight);
        }
        else if(choice == 2)
        {
            System.out.println("Enter your weight in kgs only");
            weight = in.nextDouble();

            newWeight = weight * 2.20462;
            System.out.println("New unit weight after conversion is: " + newWeight);
        }
        else{
            System.out.println("Enter a valid weight");
        }

    }
}
