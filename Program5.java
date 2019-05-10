import java.util.Scanner;

public class Program5 {
    public static void main(String[] args)
    {   int sum=0;
        System.out.println("enter how many number do you want to enter");
        Scanner obj =new Scanner(System.in);
        int n=obj.nextInt();
        System.out.println("you have to enter " +n+ "number");
        System.out.println("enter nmbers");
        for (int i=0;i<n;i++)
        {
            int m=obj.nextInt();
            sum+=m;
        }
        System.out.println(sum);
    }
}
