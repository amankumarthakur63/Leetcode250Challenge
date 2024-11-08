import java.util.Arrays;

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

    public static void main(String[] args) {

    }
}
