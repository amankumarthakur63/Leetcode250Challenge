package Arrays;

public class Day1MovesZeroes {

    public void moveZeroes(int[] nums) {
        int j = 0;  // j is assign to 0
        for (int i = 0; i < nums.length; i++) { // i is iterate from index 0 to array length
            if (nums[i] != 0 && nums[j] == 0) { // if i is not 0 and j is zero then swap the value
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
            if (nums[j] != 0) {  // if not then increment the j by 1.
                j++;
            }
        }
    }

    public static void main(String[] args) {

    }
}
