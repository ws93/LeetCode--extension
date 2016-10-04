public class Solution {
    public int findNthDigit(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(i);
            if (sb.length() >= n) {
                break;
            }
        }
        return sb.charAt(n - 1) - 48;
    }
}