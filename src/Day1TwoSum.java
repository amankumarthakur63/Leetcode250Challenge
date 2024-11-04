
public class Day1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length - 1; i++) {     // i is pointing to first index of the array
            for (int j = i + 1; j < nums.length; j++) { // j is pointing to the second index of the array
                if (nums[i] + nums[j] == target) {      // if i and j sum is equal to target then
                    return new int[] {i, j};            // return i and j
                }
            }
        }
        return new int[] {};                            // No solution found
    }

    public static void main(String[] args) {

    }
}