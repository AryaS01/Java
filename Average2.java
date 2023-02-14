import java.util.Scanner;
public class Average2 {
    public static void main(String[] args) {
        int i,marks=0,counter=1,sum=0;
       String msg="Enter the marks(negative to quit)";
        System.out.println(msg);
        Scanner sc= new Scanner(System.in);
        marks=sc.nextInt();
        for(i=1;i>0;i++)
        {
            if(marks>100)
            {
                System.out.println("Enter a new number");
               marks=sc.nextInt();
        }
              if(marks==-1)
{
break;
}
else
{
counter++;
sum+=marks;
System.out.println(msg);
marks=sc.nextInt();
}
}
double average = sum/counter;
System.out.println("The average is: "+average);
}
}