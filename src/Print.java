import java.util.Scanner;
public class Print {
    public static void main(String[]args)
    {
        System.out.println("Enter the number of digits:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println("Enter the number:");
        int num=sc.nextInt();
        for(int i=0;i<=n;i++)
        {
            while(num!=0)
            {
                int num1=num%10;
                System.out.println(num1);

            }


        }

        {

        }
    }
}
