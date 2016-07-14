public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        // int sum, r;
        while(set.add(n)) {
            int sum = 0, r = 0;
            while(n > 0) {
                r = n % 10;
                sum += r * r;
                n /= 10;
            }
            if(sum == 1) {
                return true;
            }
            n = sum;
        }
        return false;
    }
}