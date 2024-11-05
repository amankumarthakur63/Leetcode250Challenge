import java.util.Arrays;

public class Day2MajorityElement {

    public int majorityElement(int[] nums) {
        int count = 0;
        int result = 0;

        for (int num : nums) {
            if (count == 0) {
                result = num;
            }
            count += (num == result) ? 1 : -1;
        }
        return result;
    }

    public int majorityElements (int[] nums) {
        Arrays.sort (nums);
        return nums[nums.length / 2];
    }


    public static void main(String[] args) {

    }
}
