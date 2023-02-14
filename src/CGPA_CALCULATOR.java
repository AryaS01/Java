import java.util.Scanner;

public class CGPA_CALCULATOR {
    public static void main(String[] args) {
        System.out.println("Enter your marks in 3 subjects:");
        Scanner s = new Scanner(System.in);
        System.out.println("Sub 1:");
        float a = s.nextFloat();
        System.out.println("Sub 2:");
        float b = s.nextFloat();
        System.out.println("sub 3:");
        float c =s.nextFloat();
        float cgpa = (a+b+c)/30;
        System.out.println("Your cgpa is");
        System.out.println(cgpa);
    }
}
