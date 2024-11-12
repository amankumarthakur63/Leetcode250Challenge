package Arrays;

public class Day9RotateArray {


    public void rotate(int[] nums, int k) {
        // k = k % nums.length;
        // int[] rotate = new int[nums.length];

        // for (int i = 0; i < nums.length; i++) {
        //     rotate[(i + k) % nums.length] = nums[i];
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     nums[i] = rotate[i];
        // }


// this is the best method to do reverse problem
        k = k % nums.length;
        if (k != 0) {
            int[] temp = new int[nums.length];
            System.arraycopy(nums, nums.length - k, temp, 0, k);
            System.arraycopy(nums, 0, temp, k, nums.length - k);
            System.arraycopy(temp, 0, nums, 0, nums.length);
        }

    }

    public void print (int[] nums, int n) {
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Day9RotateArray ra = new Day9RotateArray();
        int[] nums = {1,2,3,4,5,6,7};
        ra.rotate(nums, 3);
        ra.print(nums, nums.length);
    }
}
