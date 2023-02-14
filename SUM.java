import java.util.Scanner;

public class SUM {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:");
        Scanner s = new Scanner(System.in);
        System.out.println("Number 1=");
        int a = s.nextInt();
        System.out.println("Number 2=");
        int b = s.nextInt();
         int sum = a +b;
        System.out.println("The sum is");
        System.out.println(sum);

    }
}
