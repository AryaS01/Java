import java.util.Scanner;
public class Website_type {
    public static void main(String[] args) {
        System.out.println("Please paste the url here:");
        Scanner sc = new Scanner(System.in);
        String website=sc.nextLine();
        if(website.endsWith(".com"))
        {
            System.out.println("Commercial website");
        }
        if(website.endsWith(".org"))
        {
            System.out.println("Organization website");
        }
        if(website.endsWith(".in"))
        {
            System.out.println("Indian Website");
        }
    }
}
