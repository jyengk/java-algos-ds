package slidingwindow;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Given a word and a text, return the count of the occurrences of anagrams of the word in the text(For eg: anagrams of word for are for, ofr, rof etc.))
 *
 * Examples:
 *
 *     Input : forxxorfxdofr
 *                 for
 *     Output : 3
 *     Explanation : Anagrams of the word for – for, orf, ofr appear in the text and hence the count is 3.
 *
 *     Input : aabaabaa
 *                 aaba
 *     Output : 4
 *     Explanation : Anagrams of the word aaba – aaba, abaa each appear twice in the text and hence the count is 4.
 */
public class CountOccurrencesOfAnagrams {

    public static void main(String[] args) {
        System.out.println("Enter the anagram string to be searched: ");
        Scanner sc = new Scanner(System.in);
        String ip = sc.next();
        System.out.println("Enter the string from where the anagram is to be looked for: ");
        String s = sc.next();
        sc.close();
        int len = s.length();
        HashMap<Character, Integer> anagramMap = new HashMap<>();
        for (int i = 0; i< len; i++) {
            char value = s.charAt(i);
            anagramMap.put(value, anagramMap.getOrDefault(value, 0) + 1);
        }
        HashMap<Character, Integer> windowMap = new HashMap<>();
        for (int start =0, end =0; start <= end; end++) {
            char c = s.charAt(end);
            windowMap.put(c, windowMap.getOrDefault(c, 0) + 1);
            if (end - start + 1 == len) {
                if (h) {

                }
            }
            if (windowMap.size() > anagramMap.size() || (end - start + 1) > len) {

            }
        }


    }
}
