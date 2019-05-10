import java.util.Scanner;

public class Program8 {
    public static void main(String[] args)
    {
        int targetno=27;
        Scanner obj=new Scanner(System.in);
        System.out.println("enter a number between 1 to 50");



            for(int i=0;i<50;i++)
            {
                int n=obj.nextInt();
                if (n==targetno)
                {
                    System.out.println("number is match with original number");
                    break;
                }
                else if (n<targetno)
                {
                    System.out.println("number is less than original number");
                    System.out.println("please try another number");
                }
                else {
                    System.out.println("number is greater than original number");
                    System.out.println("please try another number");
                }

        }
    }

}
