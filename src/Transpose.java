import java.util.Scanner;
class Transpose
{
    public static void main(String[] args)
    {
        System.out.println("Enter the number of rows and columns:");
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int column=sc.nextInt();
        int arr[][]=new int[row][column];

        System.out.println("Enter your matrix:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
                arr[i][j]=sc.nextInt();
                System.out.print(" ");
            }
        }
        System.out.println("The matrix before transpose is:");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<column;j++)
            {

                System.out.print(arr[i][j]+" ");
            }
            System.out.println(" ");

        }
        System.out.println("The matrix after transpose is:");
        for(int i=0;i<column;i++)
        {
            for(int j=0;j<row;j++)
            {

                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");

        }
    }
}

