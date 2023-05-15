package search;

import java.util.Scanner;

//Search for duplicates of the i/p number using binary search
// Sorted array
public class SearchForDuplicates {

    public static int getIndex(int[] a, int num) {
        int startIndex = 0;
        int endIndex = a.length - 1;
        while (endIndex >= startIndex) {
            int mid = (endIndex + startIndex) / 2;
            if (num == a[mid]) {
                return mid;
            }
            if (num > a[mid]) {
                startIndex = mid + 1;
            } else {
                endIndex = mid - 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        System.out.println("Enter the number to look for: ");
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        s.close();
        int[] a = {0,1,1,2,2,2,2,3,3,3,3,4,5};
        int index = getIndex(a, num);
        if (index == -1) {
            System.out.print("Number not found");
            return;
        }
        int count = 0;
        int left = index;
        while(left >= 0) {
            if (a[left] == num) {
                count++;
                left--;
                continue;
            }
            break;

        }
        int right = index + 1;
        while(right <=  (a.length - 1)) {
            if (a[right] == num) {
                count++;
                right++;
                continue;
            }
            break;
        }

        System.out.println("Count: " + count);

    }
}
