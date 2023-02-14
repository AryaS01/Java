import java.util.Scanner;

public class String_operations {
    public static void main(String[] args)
    {
        String name = "Aryalekshmi";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        String name2 = "     Arta       ";
        System.out.println(name2.trim());
        System.out.println(name.substring(2));
        System.out.println(name.substring(2,5));
        System.out.println(name.startsWith("Ar"));
        System.out.println(name.startsWith("ar"));
        System.out.println(name.endsWith("ya"));
        System.out.println(name.charAt(4));
        System.out.println(name.indexOf("p"));
        System.out.println(name.indexOf("ya"));
        System.out.println(name.indexOf("a",3)); //index is returned
        //similar commands for last index as line 18 19 20
        System.out.println(name.equals("aryalekshmi")); //case sensitive
        System.out.println(name.equalsIgnoreCase("aryaLekshmi"));
        //Escape sequence characters : \n \t \' \\ etc

    }


}
