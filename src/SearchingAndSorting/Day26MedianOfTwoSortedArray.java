package SearchingAndSorting;

import java.util.Arrays;

public class Day26MedianOfTwoSortedArray {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;

        int[] merged = new int[m + n];

        int k = 0;
        for (int i = 0; i < m; i++){
            merged[k++] = nums1[i];
        }
        for (int j = 0; j < n; j++) {
            merged[k++] = nums2[j];
        }


        Arrays.sort (merged);

        int total = merged.length;

        if (total % 2 == 1) {
            return (double) merged[total / 2];
        } else {
            int middle1 = merged[total / 2 - 1];
            int middle2 = merged[total / 2];
            return ((double) middle1 + (double) middle2) / 2.0;
        }
    }

    public static void main(String[] args) {

    }
}
