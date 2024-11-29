package SearchingAndSorting;

public class Day25FindTheMinimumInRotateSortedArray {

    public int findMin(int[] nums) {
        // Arrays.sort (nums);
        // return nums[0];


        // initialize interval pointers
        int left = 0;
        int right = nums.length-1;

        while(nums[left] > nums[right]){
            int mid = left + (right - left)/2;

            // check if mid is before or after the rotation
            if(nums[mid+1] < nums[mid]){
                return nums[mid+1];
            }
            if(nums[mid-1] > nums[mid]){
                return nums[mid];
            }

            // reduce search into left or right side
            if(nums[mid] < nums[right]){
                // sorted array -> search in left
                right = mid - 1;
            }
            if(nums[mid] > nums[left]){
                // sorted array -> search in right
                left = mid + 1;
            }
        }

        // if already sorted, the min elem will be the first one
        return nums[left];
    }

    public static void main(String[] args) {

    }
}
