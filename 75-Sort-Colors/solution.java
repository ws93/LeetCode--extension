public class Solution {
    public void sortColors(int[] nums) {
        int i = 0, left = 0, right = nums.length - 1;
        while(i <= right) {
            if(nums[i] == 0) {
                swap(nums, i, left);
                i++;
                left++;
            } else if(nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, right);
                right--;
            }
        }
        return;
    }
    
    private void swap(int[] nums, int left, int right) {
        int tmp = nums[left];
        nums[left] = nums[right];
        nums[right] = tmp;
        return;
    }
}