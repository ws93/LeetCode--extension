public class Solution {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
        	return 0;
        }
        int[] dp = new int[nums.length];
        dp[0] = 0;
        for (int i = 1; i < nums.length; i++) {
        	dp[i] = Integer.MAX_VALUE;
        	for (int j = 0; j < i; j++) {
        		if (dp[j] != Integer.MAX_VALUE && nums[j] + j >= i) {
        			dp[i] = dp[j] + 1;
        			break;
        		}
        	}
        }
        return dp[nums.length - 1];
    }
}