import java.util.Scanner;

public class ReversANumber {
    // num%10 gives the last digit and num/10 gives the remaining digits
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int reverse = 0;
        while(num != 0) {
            reverse = reverse*10 + num%10;
            num = num/10;
        }

        System.out.println(reverse);
    }
}
