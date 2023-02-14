import java.util.Scanner;

public class Kilometres_to_miles_conversion {
    public static void main(String[] args) {
        System.out.println("Enter Kilometres:");
        Scanner s = new Scanner(System.in);
        System.out.println("Kms=");
        float km = s.nextFloat();
        double miles = km * 0.621371;
        System.out.println("The distance is "+miles+ " miles");

    }

}
