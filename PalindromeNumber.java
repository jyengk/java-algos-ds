import java.util.Scanner;

public class PalindromeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int original = num;
        int reverse = 0;
        while (num != 0) {
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        if (original == reverse) {
            System.out.print("Is palindrome");
        } else{
            System.out.print("Not a palindrome");
        }
    }
}
