package search;

import java.util.Scanner;

public class BinarySearch {
    // Binary search for sorted arrays.
    public static void main(String[] args) {
        System.out.println("Enter the number to look for :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();
        int[] a = {5, 7, 12, 30, 41, 53, 61};
        int startIndex = 0;
        int endIndex = a.length - 1;
        while (endIndex >= startIndex) {
            if (a.length/2 == 0) {
                System.out.println("Number not found in the array.");
                break;
            }
            int midIndex = (startIndex + endIndex ) /2;
            if (num == a[midIndex]) {
                System.out.println("Found number at : " + midIndex);
                break;
            }
            if (num < a[midIndex]) {
                endIndex = midIndex - 1;
            } else {
                startIndex = midIndex + 1;
            }
        }
    }
}
