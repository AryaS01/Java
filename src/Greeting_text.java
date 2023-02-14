import java.util.Scanner;
public class Greeting_text {
    public static void main(String[] args) {
        System.out.println("Please enter your name:");
        Scanner s = new Scanner(System.in);
        String str = s.next();
        System.out.println("Hello " + str + "!Have a good day!");
    }
}
