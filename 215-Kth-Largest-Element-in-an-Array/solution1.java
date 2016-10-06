public class Solution {
    public int findKthLargest(int[] nums, int k) {
        return quickSelect(nums, k - 1, 0, nums.length - 1);
    }
    
    private int quickSelect(int[] nums, int k, int left, int right) {
        int pivot = nums[left + (right - left) / 2];
        int i = left, j = right;
        while (i <= j) {
            while (nums[i] > pivot) {
                i++;
            }
            while (nums[j] < pivot) {
                j--;
            }
            if (i <= j) {
                swap(nums, i++, j--);
            }
        }
        if (i < right && k >= i) return quickSelect(nums, k, i, right);
        if (j > left && k <= j) return quickSelect(nums, k, left, j);
        return nums[k];
    }
    
    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
    }
}