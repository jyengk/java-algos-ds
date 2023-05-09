// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        System.out.printf("Hello and welcome!");

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        for (int i = 1; i <= 5; i++) {

            // Press Shift+F9 to start debugging your code. We have set one breakpoint
            // for you, but you can always add more by pressing Ctrl+F8.
            System.out.println("i = " + i);
        }

        String a = "AABBBCD";
        int n = a.length();
        System.out.println("Length of string " + n);
        int i=0, j=1;
        while(j < n) {

            if (a.charAt(i) == a.charAt(j)) {
                i++;
                j++;
                continue;
            }
            if (a.charAt(i) != a.charAt(j)) {
                i++;j++;
                if(j >= n) {
                    System.out.println("First non repeasting character " + a.charAt(i));
                    break;
                } else{
                    System.out.println("X:= " + a.charAt(i) + " Y:= " + a.charAt(j));
                    if(a.charAt(i)  != a.charAt(j)) {
                        System.out.println("Here " + a.charAt(i) );
                        break;
                    }
                }

            }
        }
    }
}