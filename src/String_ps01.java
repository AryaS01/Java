import java.util.Scanner;
public class String_ps01 {
    public static void main(String[] args)
    {
        System.out.println("Please enter your string:");
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str.toLowerCase());
    }
}
