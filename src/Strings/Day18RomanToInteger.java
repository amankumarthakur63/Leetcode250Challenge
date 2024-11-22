package Strings;

import java.util.HashMap;

public class Day18RomanToInteger {

    public int romanToInt(String s) {
        int ans = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        map.put ('I', 1);
        map.put ('V', 5);
        map.put ('X', 10);
        map.put ('L', 50);
        map.put ('C', 100);
        map.put ('D', 500);
        map.put ('M', 1000);

        for (int i = 0; i < s.length() - 1; i++) {
            if (map.get (s.charAt (i)) < map.get (s.charAt (i + 1))) {
                ans = ans - map.get (s.charAt (i));
            } else {
                ans = ans + map.get (s.charAt (i));
            }
        }
        return ans + map.get (s.charAt (s.length () - 1));
    }

    public static void main(String[] args) {

    }
}
