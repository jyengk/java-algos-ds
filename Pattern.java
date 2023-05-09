public class Pattern {

    public void pattern10() {
        int n = 5;
        for (int i=0; i <= 2*n - 1; i++) {
            int end = i;
            if (i > 4) {
                end = 2*n - i;
            }
            for (int j=0;j<end;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void pattern11() {
        int n = 5;
        for (int i= 1; i<= n;i++ ) {
            int start = 1;
            if (i%2 == 0) {
                start = 0;
            }
            for (int j = 1; j <= i; j++ ) {
                System.out.print(start);
                start = 1 - start ;
            }
            System.out.println();
        }
    }

    public void pattern12() {
        int row = 4;
        int column = 2*row;
        for(int i = 1; i <= row;i++) {
            int j = 1;
            for (; j <= i; j++) {
                System.out.print(j);
            }
            int space = column - 2*i +1;
            for (int k= 1; k < space; k++) {
                System.out.print(" ");
            }
            j--;
            for (; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();

        }
    }

    public void pattern13() {
        int start = 0;
        for (int i = 0; i < 5 ;i++) {
            for (int j = 0 ; j <=i ; j++) {
                start++;
                System.out.print(start + " ");
            }
            System.out.println();
        }
    }

    public void pattern14() {
        for (int i = 0; i < 5 ;i++) {
            char start = 'A';
            for (int j = 0 ; j <=i ; j++) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }

    public void pattern15() {
        int n = 5;

        for (int i = 0, column = n ; i < n ;i++, column--) {
            char start = 'A';
            for (int j = column; j > 0  ; j--) {
                System.out.print(start + " ");
                start++;
            }
            System.out.println();
        }
    }

    public void pattern16(){
        int n = 5;
        char value = 'A';
        for(int i =0; i< n; i++, value++ ) {
            for(int j= 0 ;j <=i;j++) {
                System.out.print(value);
            }
            System.out.println();
        }
    }

    public void pattern17() {
        int n = 3;
        int row =4;

        for (int i = 0; i<row; i++, n--) {
            for (int j=0;j<n;j++) {
                System.out.print(" ");
            }
            char value = 'A';
            for(int k=0; k < 2*i+ 1; k++) {
                System.out.print(value);
                if (k >= i) {
                    value--;
                } else {
                    value++;
                }
            }
            System.out.println();

        }
    }

    public void pattern18() {
        int row = 5;
        char value = 'E';
       // int newIntValue = value -2;
       // char newVal = (char)newIntValue;
        //System.out.print(newVal);
        for(int i= 0; i < row;i++) {
            char startValue = value;
            char newStartValueInt = (char) (startValue - i);
            for (int j=0; j<=i; j++) {
                System.out.print(newStartValueInt);
                newStartValueInt++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        for (int i=0; i < 5 ; i++) {
            for (int j=0; j < 5; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println("\n");

        for (int i=1; i <= 5; i++) {
            for (int j=0 ; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i=1; i <=5; i++) {
            for (int j=1; j <=i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for (int i=1; i <=5; i++) {
            for (int j=1; j <=i ; j++) {
                System.out.print(i);
            }
            System.out.println();
        }

        for (int i=0; i < 5; i++) {
            int j = 5-i;
            for(; j > 0 ; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = 0, x=5; i < 5 ; i++, x--){
            for (int j= 1; j <= x ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i=0, j=4 ; i < 5 ; i++, j--) {
            for (int x = 0; x < j ; x++) {
                System.out.print(" ");
            }
            for(int k= 0 ; k < 2*i + 1 ; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("\n");
        for(int i=0, x=4; i < 5; i++, x--) {
            for(int j=0; j < i ; j++) {
                System.out.print(" ");
            }
            for(int k=0;k< 2*x+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        Pattern p = new Pattern();
        p.pattern10();
        p.pattern11();
        p.pattern12();
        p.pattern13();
        p.pattern14();
        System.out.println();
        p.pattern15();
        System.out.println();
        p.pattern16();
        p.pattern17();
        p.pattern18();
    }
}
