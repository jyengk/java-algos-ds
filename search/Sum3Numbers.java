package search;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

//Too lazy to type
public class Sum3Numbers {

    public static void main(String[] args) {
        System.out.println("Enter the target sum: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        System.out.println("Enter the length of the array: ");
        int l = sc.nextInt();
        System.out.println("Enter the array elements one by one: ");
        int[] a = new int[l];
        for (int i =0; i< l ;i++) {
            a[i] = sc.nextInt();
            //System.out.println("added number to the array is " + a[i]);
        }
        sc.close();
        Arrays.sort(a);
        for (int i=0; i < (a.length - 2); i++) {
            int start = i++;
            int end =  - 1;

        }

    }
}
