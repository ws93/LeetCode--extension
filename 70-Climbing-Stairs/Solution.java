// loop way
public class Solution {
    public int climbStairs(int n) {
        if(n <= 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        int[] memo = new int[n];
        for(int i = 2; i < n; i++) {
            memo[i] = memo[i - 1] + memo[i - 2];
        }
        return memo[n];
    }
}