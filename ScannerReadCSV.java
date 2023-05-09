import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerReadCSV {

    public static void main(String[] args) throws FileNotFoundException {
        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();
        System.out.println("Your name is " + name);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        System.out.println("Your age is : " + age);
        sc.close();*/
        Scanner csvssc = new Scanner(new File("C:\\Users\\jiann\\workspace\\cding\\src\\main\\resources\\employees.csv"));
        csvssc.useDelimiter("\n");
        List<Employees> ls = new ArrayList<>();
        while(csvssc.hasNext()) {
            String eString = csvssc.next();
            Scanner tempSc = new Scanner(eString);
            tempSc.useDelimiter(",");
            Employees e = new Employees();

            e.setId(tempSc.nextInt());
            e.setName(tempSc.next());
            e.setPost(tempSc.next());

            ls.add(e);
            tempSc.close();
        }
        csvssc.close();
        for (Employees e : ls) {
            System.out.println(e);
        }

    }
}

class Employees{
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    String name;
    String age;
    String post;

    public String toString() {
        return "Id :" + id + " | Name  : " + name +  " | Post :" + post;
    }
}
