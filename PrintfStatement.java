//printf statement [it is used to print the output in a formatted way]
// %[flags][width][.precision][specifier-character]
public class PrintfStatement {
    public static void main(String[] args){
         
        String name = "Spongebob";
        char firstLetter = 'S';
        int age = 30;
        double height = 60.5;
        boolean isEmployed = true;
         
        System.out.printf("Hello %s\n", name); //%s is used to print string
        System.out.printf("Your name starts with a %c\n", firstLetter); //%c is used to print character
        System.out.printf("You are %d years old\n", age); //%d is used to print integer
        System.out.printf("You are %f inches tall\n", height); //%f is used to print float/double
        System.out.printf("Employed: %b\n", isEmployed); //%b is used to print boolean

        System.out.printf("%s is %d years old", name, age); //multiple variables can be printed in a single printf statement
        
        double price1 = 9.99;
        double price2 = 100.15;
        double price3 = -54.01;

        System.out.printf("%f\n", price1); //prints the number with 6 decimal places
        System.out.printf("%f\n", price2); //prints the number with 6 decimal places
        System.out.printf("%f\n", price3); //prints the number with 6 decimal places

        System.out.printf("%.1f\n", price1); //prints the number with 1 decimal place
        System.out.printf("%.2f\n", price2); //prints the number with 2 decimal places
        System.out.printf("%.3f\n", price3); //prints the number with 3 decimal places

        System.out.printf("%+.1f\n", price1); //prints the number with 1 decimal place and a plus sign for positive numbers
        System.out.printf("%+.2f\n", price2); //prints the number with 2 decimal places and a plus sign for positive numbers
        System.out.printf("%+.3f\n", price3); //prints the number with 3 decimal places and a plus sign for positive numbers

        System.out.printf("%(.2f\n", price1); //prints the number with 2 decimal places and parentheses for negative numbers
        System.out.printf("%(.2f\n", price2); //prints the number with 2 decimal places and parentheses for negative numbers
        System.out.printf("%(.2f\n", price3); //prints the number with 2 decimal places and parentheses for negative numbers

        System.out.printf("% .2f\n", price1); //prints the number with 2 decimal places and a space for positive numbers
        System.out.printf("% .2f\n", price2); //prints the number with 2 decimal places and a space for positive numbers
        System.out.printf("% .2f\n", price3); //prints the number with 2 decimal places and a space for positive numbers

        double price4 = 9000.99;
        double price5 = 100000.15;
        double price6 = -54000.01;

        System.out.printf("%,.1f\n", price4); //prints the number with 1 decimal place and a comma as a thousands separator
        System.out.printf("%,.2f\n", price5); //prints the number with 2 decimal places and a comma as a thousands separator
        System.out.printf("%,.3f\n", price6); //prints the number with 3 decimal places and a comma as a thousands separator
        
        int id1 = 1;
        int id2 = 23;
        int id3 = 456;
        int id4 = 7890;

        System.out.printf("%04d\n", id1); //prints the number with 4 digits and leading zeros and padded with zeros
        System.out.printf("%04d\n", id2); //prints the number with 4 digits and leading zeros and padded with zeros
        System.out.printf("%04d\n", id3); //prints the number with 4 digits and leading zeros and padded with zeros
        System.out.printf("%04d\n", id4); //prints the number with 4 digits and leading zeros and padded with zeros 

        System.out.printf("%4d\n", id1); //print the number with padded 4 digit behind
        System.out.printf("%4d\n", id2); //print the number with padded 4 digit behind
        System.out.printf("%4d\n", id3); //print the number with padded 4 digit behind
        System.out.printf("%4d\n", id4); //print the number with padded 4 digit behind

        System.out.printf("%-4d\n", id1); //print the number with padded -4 digit behind
        System.out.printf("%-4d\n", id2); //print the number with padded -4 digit behind
        System.out.printf("%-4d\n", id3); //print the number with padded -4 digit behind
        System.out.printf("%-4d\n", id4); //print the number with padded -4 digit behind
    }
    
}
