
import java.util.Scanner;

class Program7
{
    public static void main(String args[])
    {
        System.out.println("Enter The Number:");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        int sorted = 0;
        int digits = 10;
        int sortedDigits = 1;
        boolean first = true;

        while (num > 0) {
            int digit = num % 10;

            if (!first) {

                int tmp = sorted;
                int toDivide = 1;
                for (int i = 0; i < sortedDigits; i++) {
                    int tmpDigit = tmp % 10;
                    if (digit <=tmpDigit) {
                        sorted = sorted/toDivide*toDivide*10 + digit*toDivide + sorted % toDivide;
                        break;
                    } else if (i == sortedDigits-1) {
                        sorted = digit * digits + sorted;
                    }
                    tmp /= 10;
                    toDivide *= 10;
                }
                digits *= 10;
                sortedDigits += 1;
            } else {
                sorted = digit;
            }

            first = false;
            num = num / 10;
        }
        System.out.println(sorted);
        int x,sum=0;
        while (sorted>0)
        {
            x=sorted%10;
            if(x%2==0)
            {
                sum=sum+x;

            }
            sorted=sorted/10;
        }
        System.out.println("sum is " +sum);
        if(sum>15)
            System.out.println("true");
        else
            System.out.println("false");
    }
}