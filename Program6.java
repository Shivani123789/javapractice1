import java.util.Scanner;

public class Program6 {
    public static void main(String [] args)
    {
        System.out.println("enter a character");
        Scanner obj=new Scanner(System.in);
        char c=obj.next().charAt(0);
        if(c>=65 && c<=90)
        {
            System.out.println("upper case");
        }
       else if(c>=97 && c<=122)
        {
            System.out.println("lower case");
        }
        else if(c>=48 && c<=57)
        {
            System.out.println("digit");
        }
        else {
            System.out.println("Special character");
        }

    }
}
