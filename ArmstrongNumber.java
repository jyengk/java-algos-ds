import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {
        System.out.print("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int original = num;
        sc.close();
        int sum = 0;
        int count = 0;
        List<Integer> ls = new ArrayList<>();
        while (num != 0) {
            count++;
            int rem = num %10;
            ls.add(rem);

            num = num / 10;
        }

        for (int value: ls) {
           /* int x = 1;
            for ( int i = 0 ;i< count ;i++) {
                x = x * value;
            }*/
            int x =0;
            x += Math.pow(value, count);
            sum = sum + x;
        }
        if (sum == original) {
            System.out.println("Is an Armstrong Number");
            return;
        }
        System.out.println("Not an armstrong number");
    }
}
