package SearchingAndSorting;

public class Day24FindFirstAndLast {

    public int[] searchRange(int[] nums, int target) {
        int result[] = {-1, -1};
        int start = binarySearch (nums, target, true);
        int end = binarySearch (nums, target, false);
        result[0] = start;
        result[1] = end;
        return result;

    }

    private int binarySearch(int[] nums,int target, boolean isSearchingLeft) {
        int start = 0;
        int end = nums.length - 1;
        int idx = -1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (nums[mid] >  target) {
                end = mid - 1;
            }
            else if (nums[mid] < target) {
                start = mid + 1;
            }
            else {
                idx = mid;
                if (isSearchingLeft) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return idx;
    }

    public static void main(String[] args) {

    }
}
