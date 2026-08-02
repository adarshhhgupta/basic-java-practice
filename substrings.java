// .substring() = A method used to extract a portion of a string .substring(start, end)
import java.util.Scanner;
public class substrings {
    public static void main(){

        Scanner in = new Scanner(System.in);

        String email = "BroCode1@gmail.com";
        String username = email.substring(0, 8);
        String domain = email.substring(9);

        System.out.println(username);
        System.out.println(domain);

        //another flexible method of substring

        String usernameone = email.substring(0, email.indexOf("@"));
        String domainone = email.substring(email.indexOf("@") + 1);

        System.out.println(usernameone);
        System.out.println(domainone);

        //method 3 taking input from user 

        String emailone, usernametwo, domaintwo;
        System.out.print("Enter your email: ");
        emailone = in.nextLine();

        if(emailone.contains("@"))
        {
            usernametwo = emailone.substring(0, emailone.indexOf("@"));
            domaintwo = emailone.substring(emailone.indexOf("@") + 1);

            System.out.println(usernametwo);
            System.out.println(domaintwo);
        }
        else
        {
            System.out.println("Email must contain '@'");
        }

    }
    
}
