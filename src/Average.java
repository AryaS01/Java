import java.util.Scanner;
public class Average {
    public static void main(String[] args) {
        System.out.println("--Press -1 to exit--");
        Scanner sc=new Scanner(System.in);
        int counter=1,total=0,mark2,mark;
        for(int i=1;i>0;i++)
        {
            System.out.println("Enter the mark in the subject:");
            mark = sc.nextInt();
            if (mark==-1)
            {
                 break;
            }
            else if (mark>=0 && mark <=100)
            {
                int x=mark;
                counter++;
            }
            else
            {
                System.out.println("Please re-enter the marks.");
                 mark2=sc.nextInt();
                mark=mark2;
                counter++;
            }
            total = total + mark;
        }

        double average=(double)total/counter;
        System.out.println("The average is:"+average);
    }
}
