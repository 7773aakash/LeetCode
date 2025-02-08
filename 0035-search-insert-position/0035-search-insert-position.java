class Solution {
    public int searchInsert(int[] nums, int target) {
        int st = 0;
        int end = nums.length - 1;
        int mid = (st + end) / 2;

        while (st <= end) {
            if (nums[mid] > target) {
                end = mid - 1;
            } else if (nums[mid] < target) {
                st = mid + 1;
            } else if (nums[mid] == target) {
                return mid;
            }
            mid = (st + end) / 2;
        }
        if (st == nums.length) {
            return nums.length;
        } else {
            return st;
        }
    }
}