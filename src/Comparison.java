import java.util.Scanner;

public class Comparison {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter A number:");
        int x= s.nextInt();
        System.out.println("Enter the number with which you need to compare your previous number:");
        int y= s.nextInt();
        System.out.println(x>y);

    }
}

