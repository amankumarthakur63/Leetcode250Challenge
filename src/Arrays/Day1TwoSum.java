package Arrays;

import java.util.HashMap;
import java.util.Map;

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

    public int[] twoSum2(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int ans = target - nums[i];
            if (map.containsKey(ans) && map.get(ans) != i) {
                return new int[]{i, map.get(ans)};
            }
        }
        return new int[]{};
    }



    public int[] twoSum3(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[]{numMap.get(complement), i};
            }
            numMap.put(nums[i], i);
        }

        return new int[]{}; // No solution found
    }
        public static void main (String[]args){

        }
    }