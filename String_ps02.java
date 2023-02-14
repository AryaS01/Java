import java.util.Scanner;
public class String_ps02 {
    public static void main(String[] args)
    {
        System.out.println("Please enter your string");
        Scanner sc = new Scanner(System.in);
        String str = "My name   is  Arya       ";
        System.out.println(str.replace(" " ,"_"));

    }
}
