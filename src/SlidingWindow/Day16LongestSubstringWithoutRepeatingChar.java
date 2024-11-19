package SlidingWindow;

import java.util.HashSet;

public class Day16LongestSubstringWithoutRepeatingChar {

    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int l = 0; // which is the left pointer
        int maxLength = 0;  // that we have to return

        for (int r = 0; r < s.length(); r++) {
            while (set.contains (s.charAt (r))) {
                set.remove (s.charAt (l));
                l++;
            }
            set.add (s.charAt (r));
            maxLength = Math.max (maxLength, r - l + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {

    }
}
