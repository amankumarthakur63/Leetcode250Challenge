package Arrays;

import java.util.Arrays;

public class Day4HIndex {

    public int hIndex(int[] citations) {
        int n = citations.length;
        Arrays.sort (citations);

        for (int i = 0; i < n; i++) {
            if (citations[i] >=  n - i) {
                return n - i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {

    }
}
