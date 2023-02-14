import java.util.Scanner;
public class String_ps03 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name= sc.next();
        String letter = "Dear " +name+ ", Thanks a lot!";
        System.out.println(letter);
    }
}
