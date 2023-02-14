import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.println("Choose your category:\n1.Male,age<18\n2.Female,age<18\n3.Female,age<40\n4.Male,age<40\n5.Male,age>40\n6.Female,age>40\n");
        choice= sc.nextInt();
        switch(choice)
        {
            case 1:
            case 2:
                System.out.println("NOT ELIGIBLE");
                break;
            case 3:
                System.out.println("You need to be older than 40 years to vote online");
                break;
            case 4:
            case 5:
                System.out.println("Only Females above 40 years of age can vote online");
                break;
            case 6:
                System.out.println("You are eligible to vote online!");
                break;
            default:
                System.out.println("Please enter a valid choice");
               break;


        }


    }



}
