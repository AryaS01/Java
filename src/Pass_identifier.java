import java.util.Scanner;
public class Pass_identifier {
    public static void main(String[] args) {
        byte s1,s2,s3;
          float total_percent,avg;
        System.out.println("Enter your marks in three subjects:");
        Scanner sc= new Scanner(System.in);
        s1= sc.nextByte();
        s2=sc.nextByte();
        s3=sc.nextByte();
        avg= (s1 + s2 + s3)/3.0f;
        total_percent=avg*100;
        if(s1>=40 && s2>=40 && s3>=40 && total_percent>=33)
        {
            System.out.println("PASSED");
        }
        else
        {
            System.out.println("FAILED");
        }



    }
}
