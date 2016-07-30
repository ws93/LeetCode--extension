public class Solution {
    public int maxSubArray(int[] nums) {
        int maxSoFar = nums[0], maxEndHere = nums[0];
        for(int i = 1; i < nums.length; i++) {
            maxEndHere = Math.max(maxEndHere + nums[i], nums[i]);
            maxSoFar = Math.max(maxSoFar, maxEndHere);
        }
        return maxSoFar;
    }
}