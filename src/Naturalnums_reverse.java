import java.util.Scanner;
public class Naturalnums_reverse {
    public static void main(String[] args) {
        System.out.println("Please enter your limit:");
        Scanner sc = new Scanner(System.in);
        int limit=sc.nextInt();
        for(int i=limit;i!=0;i--)
        {
            System.out.println(i);
        }
    }
}
