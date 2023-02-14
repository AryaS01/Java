import java.util.Scanner;
public class WAGE {
    public static void main(String[] args) {
        double hours_worked,rate_ph,wage;
        System.out.println("Enter hours");
        Scanner sc= new Scanner(System.in);
        hours_worked= sc.nextDouble();
        System.out.println("Enter rate");
        rate_ph=sc.nextDouble();
        if(hours_worked<=40)
        {
            wage=hours_worked*rate_ph;
        }
        else
        {
            wage=(40*rate_ph)+(hours_worked-40)*(1.5*rate_ph);
        }
        System.out.println(wage);
    }
}
