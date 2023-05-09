import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        System.out.print("Enter two digits: ");
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        sc.close();
        System.out.println(num1 + " and " + num2);
        int ori1 = num1;
        int ori2 = num2;
        int remain = -1;
        while (remain != 0) {
            remain = num1%num2;
            num1 = num2;
            num2 = remain;
        }
        System.out.println(" GCD " + num1);
        // GCD X LCM = num1 X num2
        int lcm = (ori1 * ori2)/num1;
        System.out.println(" LCM " + lcm);



    }
}
