import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your marks in each subjects:");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your marks in subject 1:");
        int a = s.nextInt();

        System.out.println("Enter your marks in subject 2:");
        int b = s.nextInt();

        System.out.println("Enter your marks in subject 3:");
        int c = s.nextInt();

        System.out.println("Enter your marks in subject 4:");
        int d = s.nextInt();

        System.out.println("Enter your marks in subject 5:");
        int e = s.nextInt();
        int total = a+b+c+d+e;

        int percentage = total/5;

        System.out.println("Your percentage is:");
        System.out.println(percentage);


    }
}