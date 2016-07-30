public class Solution {
    public int maxProduct(int[] nums) {
        int maxSofar = nums[0], minSofar = nums[0], maxEnd = nums[0], minEnd = nums[0];
        for(int i = 1; i < nums.length; i++) {
            int tmp = maxEnd;
            maxEnd = Math.max(Math.max(maxEnd * nums[i], minEnd * nums[i]), nums[i]);
            minEnd = Math.min(Math.min(minEnd * nums[i], tmp * nums[i]), nums[i]);
            maxSofar = Math.max(maxSofar, maxEnd);
        }
        return maxSofar;
    }
}