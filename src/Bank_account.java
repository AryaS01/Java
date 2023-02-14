import java.util.Scanner;

public class Bank_account {
    int accnum, balance, deposit, withdraw, total_bal;
    String name;
    Scanner sc = new Scanner(System.in);

    void createAccount() {

        System.out.println("Please enter your name");
        name = sc.nextLine();
        System.out.println("Please enter your account number:");
        accnum = sc.nextInt();
        System.out.println("Please enter your account balance");
        balance = sc.nextInt();
    }

    void deposit() {
        System.out.println("Please enter the amount to be deposited:");
        deposit = sc.nextInt();
        total_bal = balance + deposit;
        System.out.println("Rs. " + deposit + " successfully deposited");

    }

    void withdraw() {
        System.out.println("Please enter the amount to be withdrawn");
        withdraw = sc.nextInt();
        if (withdraw <= balance) {
            total_bal = balance - withdraw;
            System.out.println("Rs. " + deposit + " successfully withdrawn");
        } else {
            System.out.println("Insufficient account balance");
        }
    }

    void checkBalance() {
        System.out.println("Your current account balance is Rs. " + total_bal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank_account a = new Bank_account();
        int choice;
        a.createAccount();
        do {

            System.out.println("Please enter your choice:");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check balance\n4.Exit\n");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    a.deposit();
                    break;
                case 2:
                    a.withdraw();
                    break;
                case 3:
                    a.checkBalance();
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Please enter a valid choice");
                    break;
            }
        }
        while (choice != 5);
    }
}


