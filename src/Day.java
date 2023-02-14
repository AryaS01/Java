import java.util.Scanner;
public class Day {
    public static void main(String[] args) {
        int choice;
        System.out.println("Please choose a number:\n1\n2\n3\n4\n5\n6\n7\n");
        Scanner sc = new Scanner(System.in);
        choice= sc.nextInt();
        switch (choice) {
            case 1 -> System.out.println("Monday");
            case 2 -> System.out.println("Tuesday");
            case 3 -> System.out.println("Wednesday");
            case 4 -> System.out.println("Thursday");
            case 5 -> System.out.println("Friday");
            case 6 -> System.out.println("Saturday");
            case 7 -> System.out.println("Sunday");
            default -> System.out.println("Please enter a valid choice");
        }
    }
}
