package slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class OptimizedLongestSubstringKDistinctChar {

    public static void main(String[] args) {
        String x = "aabacbebebedababdabdabdabdab";
        int k = 3;
        int len = x.length();
        int longest = Integer.MIN_VALUE;
        int longestStart = 0;
        int longestEnd = 0;
        Map<Character, Integer> currentCharMap = new HashMap<>();

        for (int start =0, end =0;start <= end & end < len; end++) {

            currentCharMap.put(x.charAt(end), currentCharMap.getOrDefault(x.charAt(end), 0) + 1);
            while(currentCharMap.size() > k && start <= end) {
                System.out.println("While loop");
                char leftChar = x.charAt(start);
                //currentCharMap = cleanUpHashMap(currentCharMap, x.charAt(start));
                currentCharMap.put(x.charAt(start), currentCharMap.get(leftChar) - 1);
                if (currentCharMap.get(leftChar) == 0) {
                    currentCharMap.remove(leftChar);
                }
                start++;
            }
            if (currentCharMap.size() == k) {
                if (longest < (end - start + 1)) {
                    longest = end -start + 1;
                    longestStart = start;
                    longestEnd = end;
                }
                //longest = Math.max(longest, end - start + 1);


            }
        }
        System.out.println("The longest substring is : " +x.substring(longestStart, longestEnd + 1) + " of length " + longest );
    }
}
