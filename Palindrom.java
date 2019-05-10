
import java.util.Scanner;

public class Palindrom {
    public static void main(String args[]) {
int num2=0;
int num3;
Scanner obj1=new Scanner(System.in);
System.out.println("enter a no to check a palindrom");
int num=obj1.nextInt();
        System.out.println("enterd no is " + num);
       int temp=num;
        while(num>0)
        {
             num3= num % 10;
           num2=num2*10+num3;
            num = num / 10;

        }
        System.out.println(num2);
       if (num2==temp)
        {
            System.out.println("this is palindrom number");
            int x,sum=0;
            while(num2>0)
            {

                x=num2%10;
                  if(x%2==0)
                  {
                   sum=sum+num2;
                      System.out.println(sum);
                  }
                  num2=num2/10;
            }
            System.out.println(sum);
            if(sum>25)
            System.out.println("success");
            else
                System.out.println("failure");
        }
   else
       {
           System.out.println("this is not a palindrom");
       }
       }

    }

