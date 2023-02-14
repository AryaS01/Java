import java.util.Scanner;
public class Rock_paper_scissors {
    public static void main(String[] args)
    {
        int choice,min=1,mid=2,max=3,x;
        System.out.println("Instructions:\n You are playing against the computer. You can choose any one from rock, paper and scissors.");
        System.out.println("Choose:\n1.Rock\n2.Paper\n3.Scissor\n");
        Scanner sc=new Scanner(System.in);
        choice=sc.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.println("You:Rock");
                x = (int) (Math.random() * (max - min - 1) + min);
                if(x==min)
                {
                    System.out.println("Computer: " + x);
                    System.out.println("Draw");
                }
                if(x==mid)
                {
                    System.out.println("Computer: " + x);
                    System.out.println("You lose");
                }
                if(x==max)
                {
                    System.out.println("Computer: " + x);
                    System.out.println("You lose");
                }

            }
            case 2 -> {
                System.out.println("You:Paper");
                x = (int) (Math.random() * (max - min + 1) + min);
                System.out.println("Computer: " + x);
            }
            case 3 -> {
                System.out.println("You:Scissor");
                x = (int) (Math.random() * (max - min - 1) + min);
                System.out.println("Computer: " + x);
            }
        }

        }



        }


