// brute-force
public class Solution {
    public int maxSubArray(int[] nums) {
        if(nums == null || nums.length == 0) {
            return Integer.MIN_VALUE;
        }
        int res = nums[0];
        for(int i = 0; i < nums.length; i++) {
            // if(nums[i] <= 0) {
            //     continue;
            // }
            for(int j = i; j < nums.length; j++) {
                // if(nums[j] <= 0) {
                //     continue;
                // }
                res = Math.max(res, countSum(nums, i, j));
            }
        }
        return res;
    }
    
    private int countSum(int[] nums, int left, int right) {
        int res = 0;
        for(int i = left; i <= right; i++) {
            res += nums[i];
        }
        return res;
    }
}