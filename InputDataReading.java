import java.util.Scanner;

public class InputDataReading {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("\n");
        System.out.println("What is your name?");
        int i = 0;
        while(scanner.hasNext()) {
            System.out.println("Number of times entered " + ++i);
            String name = scanner.next();
            System.out.println("Hello " + name);
            break;// No exit from this w/o the break
        }
        scanner.close();

        String randomString = "9hajek!,k2op3l" +
                "";
        Scanner regexScanner = new Scanner(randomString);
        regexScanner.useDelimiter("\\D");

        while(regexScanner.hasNext()) {
            String x = regexScanner.next();
            System.out.println(x);
        }

        regexScanner.close();
        System.out.println("================================");
        String num = randomString.replaceAll( "[^\\d,]", "" );
        String[] sarr = num.split("\\D");
        for (String a : sarr) {
            System.out.println("This is the split value ->" +
                    "" + a);
        }
    }
}


