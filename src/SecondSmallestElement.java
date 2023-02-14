import java.sql.SQLOutput;
import java.util.Scanner;

public class SecondSmallestElement {
    public static  int getSecondSmallest( int total,int a[])
    {
        int temp;
        for(int i=0;i<total;i++)
    {
        for(int j=i+1;j<total;j++)
        {
            if(a[i]>a[j]) {
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
            }
        }
        return a[1];
        }
        public static void main(String args[]) {
            System.out.println("Please enter the total number of elements in the array:");
            Scanner sc = new Scanner(System.in);
            int total = sc.nextInt();
            int a[] = new int[10];
            System.out.println("Enter the array");
            for (int i = 0;  i < total; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println("Second smaller: " + getSecondSmallest(total,a));
        }
            }





