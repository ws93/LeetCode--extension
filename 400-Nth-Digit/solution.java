public class Solution {
    public int findNthDigit(int n) {
        int len = 1, start = 1;
        long count = 9;
        while (n > len * count) {
            n -= len * count;
            len++;
            count *= 10;
            start *= 10;
        }
        start += (n - 1) / len;
        return Integer.toString(start).charAt((n - 1) % len) - 48;
    }
}