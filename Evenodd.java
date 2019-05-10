import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args)
    {
        System.out.println("enter a number");
        Scanner obj=new Scanner(System.in);
        int n=obj.nextInt();
        if(n%2==0)
        {
            if(n>20 && n<30)
            {
              System.out.println("jerry");
            }
        }
        else {
            if(n>20 && n<30)
            {
                System.out.println("Tom");
            }

        }

    }
}
