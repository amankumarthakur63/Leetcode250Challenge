package Arrays;

import com.sun.source.doctree.SeeTree;

import java.util.HashSet;
import java.util.Set;

public class Day1RemoveDuplicateFromSortedArray {

    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int j = 1;  // j is initialize by 1
        for (int i = 1; i < nums.length; i++) { // i is iterate from index 1 to array length
            if (nums[i] != nums[i - 1]) {       // if i is not equal to the previous index then
                nums[j] = nums[i];              // j is assign to i
                j++;                            // increment j
            }
        }
        return j;            // return j
    }



    public static void main(String[] args) {

    }
}
