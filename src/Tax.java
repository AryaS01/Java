import java.util.Scanner;
public class Tax {
    public static void main(String[] args) {

       /* int choice;
        double salary,net;
        System.out.println("Please choose your income range:\n1.Below 2.0L\n2.5-5.0L\n3.5.0-10.0L\n4.Above 10.0L\n");
        Scanner sc= new Scanner(System.in);
        choice= sc.nextInt();
        System.out.println("Please enter your exact salary:");
        salary= sc.nextDouble();
        switch(choice)
        {
            case 1:
                System.out.println("No tax, your net income would be "+salary+"L");
                break;
            case 2:
                  net=salary-(0.05*salary);
                System.out.println("Your tax is 5% of your income,so net income is: "+net+"L");
                break;
            case 3:
                  net=salary-(0.2*salary);
                System.out.println("Yor tax is 20% of your income,so net income is: "+net+"L");
                break;
            case 4:
                  net=salary-(0.3*salary);
                System.out.println("Your tax is 30% of your income,so net income is: "+net+"L");
                break;
            default:
                System.out.println("Please choose from the above mentioned options.");
                break;
        }*/

        double income,net_income;
        System.out.println("Please enter your income in lacs:");
        Scanner sc = new Scanner(System.in);
        income= sc.nextDouble();
        if(income<2.5) {
            System.out.println("No tax, your net income would be "+income+"L");
        }
        else if(income<5.0)
        {
            net_income= income-(0.05*income);
            System.out.println("You have 5% tax and your net income would be"+net_income+"L");
        }
        else if(income<10.0)
        {
            net_income= income-(0.2*income);
            System.out.println("You have 20% tax and your net income would be"+net_income+"L");
        }
        else if(income>10.0)
        {
            net_income= income-(0.3*income);
            System.out.println("You have 30% tax and your net income would be " +net_income+"L");
        }
    }
}

