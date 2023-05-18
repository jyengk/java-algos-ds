package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringKDistinctCharacters {

    public static Map cleanUpHashMap(Map<Character, Integer> currentHashMap, Character stringChar) {

        if (currentHashMap.get(stringChar) != null && currentHashMap.get(stringChar) <= 0) {
            System.out.println("Guess this will be removed" + stringChar);
            currentHashMap.remove(stringChar);
        } else {
            int freq = currentHashMap.get(stringChar);
            --freq;
            if (freq <= 0) {
                currentHashMap.remove(stringChar);
            } else {
                currentHashMap.put(stringChar, freq);
            }

        }
        return currentHashMap;
    }

    public static void main(String[] args) {
        String x = "aabacbebebe";
        int k = 3;
        int len = x.length();
        int start = 0;
        int end = start + 1;
        int longest = Integer.MIN_VALUE;
        int longestStart = 0;
        int longestEnd = 0;
        Map<Character, Integer> currentCharMap = new HashMap<>();
        currentCharMap.put(x.charAt(start), 1);
        longest = 1;
        for (;start < end & end < len; end++) {


            if (currentCharMap.get(x.charAt(end)) == null && currentCharMap.size() < k) {
                System.out.println("First" + currentCharMap.get(x.charAt(end)));
                currentCharMap.put(x.charAt(end), 1);
                continue;
            }

            if (currentCharMap.get(x.charAt(end)) != null && currentCharMap.size() <= k) {
                System.out.println("Second " + currentCharMap.get(x.charAt(end)));
                int frequency = currentCharMap.get(x.charAt(end));
                ++frequency;
                currentCharMap.put(x.charAt(end), frequency);
                continue;
            }

            if (currentCharMap.get(x.charAt((end))) == null && currentCharMap.size() >= k) {
                System.out.println("Third " + currentCharMap.get(x.charAt(end)));
                int tempStringLen = end - start; // End is already one index ahead
                if (tempStringLen > longest) {
                    longest = tempStringLen;
                    longestStart = start;
                    longestEnd = end - 1;
                }
                currentCharMap.put(x.charAt(end), 1);
                while(currentCharMap.size() > k && start <= end) {
                    System.out.println("While loop");
                    currentCharMap = cleanUpHashMap(currentCharMap, x.charAt(start));
                    start++;
                }
                currentCharMap.put(x.charAt(end), 1);
            }
        }
        int tempStringLen = end - start; // End is already one index ahead
        if (tempStringLen > longest) {
            longest = tempStringLen;
            longestStart = start;
            longestEnd = end - 1;
        }
        System.out.println("The longest substring is : " +x.substring(longestStart, longestEnd + 1) + " of length " + longest );
    }
}
