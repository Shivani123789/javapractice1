import java.util.Scanner;

public class Program3 {
    public static void main(String[] args) {

        Scanner obj = new Scanner(System.in);
        System.out.println("enter a word ");
        String word = obj.nextLine();
        System.out.println("your entered word is " + word);
        int n = word.length();

        for (int i = 0; i <= n; i++) {
            char c = word.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                System.out.println("vowel");
            } else if (c >= 'a' && c <= 'z') {
                System.out.println("constant");
            } else {
                System.out.println("error");
            }

        }
    }}
