import java.util.Scanner;

public class CountDigitsInANumber {

    public static void main(String[] args) {
        System.out.print("Enter any number:");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        int num = Integer.parseInt(sc.next());
        sc.close();
        int counter = 1;
        while ((num = num/10) != 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
