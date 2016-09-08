public class Solution {
	// top-down
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
        	return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
        	return -1;
        }
        int[][] dp = new int[triangle.size()][triangle.size()];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < triangle.size(); i++) {
        	dp[i][0] = dp[i - 1][0] + triangle.get(i).get(0);
        	dp[i][i] = dp[i - 1][i - 1] + triangle.get(i).get(i);
        }
        for (int i = 1; i < triangle.size(); i++) {
        	for (int j = 1; j < i; j++) {
        		dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
        	}
        }

        int res = dp[triangle.size() - 1][0];
        for (int i = 1; i < dp.length; i++) {
        	res = res < dp[triangle.size() - 1][i] ? res : dp[triangle.size() - 1][i];
        }
        return res;
    }
}