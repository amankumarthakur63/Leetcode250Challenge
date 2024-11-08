package Arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Day5FindDuplicateNumber {

    // Not efficient way to tackle
    // time Complexity = O(nlogn)
    public int findDuplicate(int[] nums) {
        Arrays.sort (nums);

        for (int i = 0; i < nums.length -1; i++) {
            if (nums[i] == nums[i + 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public int findDuplicate2(int[] nums) {
    int slow = nums[0];
    int fast = nums[0];
        do { // we are sure that at least one duplicate is there
        slow = nums[slow];
        fast = nums[nums[fast]];
    } while(slow != fast);
    // find the head of loop
    fast = nums[0];
        while(slow != fast) {
        slow = nums[slow];
        fast = nums[fast];
    }
        return fast;
}

// The best solution of this problem
// Time complexity = O(n)
// Space complexity = O(n)
    public int removeDuplicates3(int[] nums) {
        Set<Integer> set = new HashSet();
        for(int i=0;i<nums.length;i++) {
            if(set.contains(nums[i]))
                return nums[i];
            set.add(nums[i]);
        }
        return -1;
    }
    public static void main(String[] args) {

    }
}
