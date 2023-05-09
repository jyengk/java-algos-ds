import java.util.Scanner;

public class FactorsOfNaturalNumber {

    public static void main(String[] args) {
        System.out.println("Enter the number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        for (int i =1 ; i<= Math.sqrt(num); i++) {
            if (num % i == 0) {
                int quotient = num / i;
                if (quotient == i) {
                    System.out.print(" " + quotient );
                    continue;
                }
                System.out.print(" " + quotient + " " + i);
            }
        }
    }
}
