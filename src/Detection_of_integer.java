import java.util.Scanner;

public class Detection_of_integer {
    public static void main(String[] args) {
        System.out.println("Enter your input");
        Scanner s = new Scanner(System.in);
        Boolean b= s.hasNextInt();
        System.out.println(b);
    }
}
