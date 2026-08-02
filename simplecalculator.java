// this is a simple calculator program environment in Java
import java.util.*;
public class simplecalculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double num1, num2;
        char operator;
        double result = 0;
        boolean validOperator = true;

        System.out.println("Enter the first number: ");
        num1 = in.nextDouble();

        System.out.println("Enter an operator (+, -, *, /, ^): ");
        operator = in.next().charAt(0);

        System.out.println("Enter the second number: ");
        num2 = in.nextDouble();

        switch(operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if(num2 == 0) {
                    System.out.println("Cannot divide by zero!");
                    validOperator = false;
                }
                else {
                    result = num1 / num2;
                }
            }
            case '^' -> result = Math.pow(num1, num2);
            default -> {
                System.out.println("Invaled operator!");
                validOperator = false;
            }
        }
        if(validOperator) {
            System.out.println(result);
        }
        in.close();
    }
}
