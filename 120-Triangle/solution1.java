public class Solution {
	// bottom-up
    public int minimumTotal(List<List<Integer>> triangle) {
        if (triangle == null || triangle.size() == 0) {
        	return -1;
        }
        if (triangle.get(0) == null || triangle.get(0).size() == 0) {
        	return -1;
        }
        int n = triangle.size();
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
        	dp[n - 1][i] = triangle.get(n - 1).get(i);
        }
        for (int i = n - 2; i >= 0; i--) {
        	for (int j = 0; j <= i; j++) {
        		dp[i][j] = Math.min(dp[i + 1][j], dp[i + 1][j + 1]) + triangle.get(i).get(j);
        	}
        }
        return dp[0][0];
    }
}