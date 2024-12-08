package Arrays;

import java.util.HashMap;

public class Day7SubarraySumEqualsK {



    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> preSum = new HashMap<>();

        int sum = 0;
        int result = 0;

        preSum.put (0, 1);

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];

            if (preSum.containsKey (sum - k)) {
                result += preSum.get(sum - k);
            }
            preSum.put(sum, preSum.getOrDefault(sum, 0) + 1);
        }
        return result;
    }

    public static void main(String[] args) {

    }
}
