package SlidingWindow;

public class Day18LongestRepeatingCharacterReplacement {

    public int characterReplacement(String s, int k) {
        int ans = 0;
        int n = s.length();

        for (int c = 'A'; c <= 'Z'; c++) {
            int l = 0;
            int r = 0;
            int replaced = 0;

            while (r < n) {
                if (s.charAt(r) == c) {
                    r++;
                } else if (replaced < k) {
                    r++;
                    replaced++;
                } else if (s.charAt(l) == c) {
                    l++;
                } else {
                    l++;
                    replaced--;
                }
                ans = Math.max(ans, r - l);
            }
        }
        return ans;
    }

    public static void main(String[] args) {

    }
}
