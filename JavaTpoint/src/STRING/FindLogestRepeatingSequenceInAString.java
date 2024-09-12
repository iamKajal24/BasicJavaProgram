package STRING;

import java.util.HashSet;
import java.util.Set;

public class FindLogestRepeatingSequenceInAString {

    public static void main(String[] args) {
        String str = "acbdfghybdf";
        int left = 0, right = 0;
        Set<Character> seen = new HashSet();
        int max = 0;
        while (right < str.length()) {
            char c = str.charAt(right);
            if (seen.add(c)) {
                max = Math.max(max, right - left + 1);
                right++;
            } else {
                while (str.charAt(left) != c) {
                    seen.remove(str.charAt(left));
                    left++;
                }
                seen.remove(c);
                left++; // remove error
            }
        }
        System.out.println("maximum of the length of the longest repeating sequence : " + max);
    }
}
