package search;

public class LargestThreeElementsInArray {
    public static  void  main (String[] args) {
        int first = Integer.MIN_VALUE;;
        int second = Integer.MIN_VALUE;;
        int third = Integer.MIN_VALUE;;

        int[] a = {10, 32, 1, 4, 28};
        for (int i=0;i < a.length;i++) {
            if (a[i] > first) {
                int temp = first;
                first = a[i];
                third = second;
                second = temp;
            } else if (a[i] > second)  {
                int temp = second;
                second = a[i];
                third = temp;
            } else if (a[i] > third) {
                third = a[i];
            }
        }
        System.out.println(first + "," + second + "," + third);
    }
}
