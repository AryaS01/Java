import java.util.Scanner;
public class Nptel {
    public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            int sum = 0;
            System.out.print("0 ");
            for (int i = 2; i < n * 2; i += 2) {
                System.out.print(i + " ");
                if (i % 3 == 0) {
                    sum += i;
                }
            }
            System.out.println();
            System.out.println("Even numbers divisible by 3: 0 " + (sum - 0));
            System.out.println("Sum: " + sum);
        }
    }


