import java.util.*;
public class Loops {
    public static void main(String[] args) {
        int num=1;
        System.out.println("Enter the limit up to which u need to print the natural numbers:");
        Scanner sc= new Scanner(System.in);
        int limit=sc.nextInt();
        do
            {
                System.out.println(num);
                num++;
            }while(num<=limit);


    }
}
