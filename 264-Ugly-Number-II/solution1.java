public class Solution {
    public int nthUglyNumber(int n) {
        int[] ugly = new int[n];
        ugly[0] = 1;
        int l1 = 2, l2 = 3, l3 = 5;
        int count1 = 0, count2 = 0, count3 = 0;
        for (int i = 1; i < n; i++) {
            ugly[i] = Math.min(l1, Math.min(l2, l3));
            if (ugly[i] == l1) {
                l1 = 2 * ugly[++count1];
            }
            if (ugly[i] == l2) {
                l2 = 3 * ugly[++count2];
            }
            if (ugly[i] == l3) {
                l3 = 5 * ugly[++count3];
            }
        }
        return ugly[n - 1];
    }
}