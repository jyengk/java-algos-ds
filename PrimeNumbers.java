import java.util.Scanner;

public class PrimeNumbers {

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime = true;
        if (num == 2) {
            isPrime = false;
        }
        for(int i=2; i <= Math.sqrt(num); i++) {
            if (num%i == 0) {
                isPrime = false;
            }
        }

        String status = isPrime? "Is a prime number" : "Is NOT a prime number";
        System.out.println(status);
        sc.close();
    }
}
