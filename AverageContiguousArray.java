public class AverageContiguousArray {
     public static  void main(String[] args) {
        int k = 5;
        int[] a = {1, 5, 0, -2, 8, 7};
        double[] b = new double[a.length - k + 1];
        //int start = 0;
        double windowSum = 0;
        for (int start = 0, end = start + k - 1; start < end; start++, end++) {
            if (end >= a.length) {
                break;
            }
            if (start == 0) {
                for(int i = start; i <= end; i++ ) {
                    System.out.println(a[i]);
                    windowSum = windowSum + a[i];
                    //System.out.println(windowSum);
                }
                b[start] = windowSum/5;
                continue;
            }
            windowSum = windowSum - a[start - 1] + a[end];
            b[start] = windowSum/5;
        }
        for (double x : b) {
            System.out.print(x + " ");
        }

    }
}
