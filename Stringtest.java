public class Stringtest {

    public static void main(String[] args){
        String s = new String("Jm4,i8wk`.."); // Created on heap
        String t = "Jm4,i8wk`.."; // Created in the string constant pool
        String x = s == t ? "Equal" : "Not equal";
        System.out.println(x);
        System.out.println(s.hashCode() + "----- " +t.hashCode() );; // Returns equal hashcode
        String k = t.intern();
        String l = k == s ? "Equal" : "Not equal";
        System.out.println("Interned response on string t" + l);
        String y = s.intern();// Returns the string reference having the same literal from the string constant pool
        String z = y == t ? "Equal" : "Not equal";
        System.out.println("Interned response " + z);

    }
}
