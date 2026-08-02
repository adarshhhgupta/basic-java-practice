//ternary operator '?' = return 1 of 2 values if condition is true or false
//variable = (condition) ? ifTrue : ifFalse;  

public class ternaryoperator {
    public static void main(String[] args) {
        int score = 50;

        String passOrFail = (score >= 60) ? "Pass" : "Fail";
        System.out.println(passOrFail);

        int number = 3;
        String evenOrOdd = (number % 2 == 0) ? "Even" : "Odd";
        System.out.println(evenOrOdd);

        int hours = 13;
        String timeofday = (hours < 12) ? "A.M." : "P.M.";
        System.out.println(timeofday);

        int income = 60000;
        double taxrate = (income < 40000) ? 0.25 : 0.15;
        System.out.println(taxrate);
    }
    
}
