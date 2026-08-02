import java.util.Scanner;
public class temperatureconversion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double temp, newTemp;
        String unit;

        System.out.println("Enter a temperature vale: ");
        temp = in.nextDouble();

        System.out.println("Enter a degree unit for temp 'C' or 'F': ");
        unit = in.next().toUpperCase();

        newTemp = (unit.equals("C")) ? (temp - 32) * 5/9 : (temp * 9/5) + 32;

        System.out.printf("%.1fo%s", newTemp, unit);
    }
    
}
