// without memo
public class Solution {
    private Map<Integer, Integer> map = new HashMap<>();
    public int climbStairs(int n) {
        if(n <= 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        if(map.containsKey(n)) {
            return map.get(n);
        } else {
            int tmp = climbStairs(n - 1) + climbStairs(n - 2);
            map.put(n, tmp);
            return tmp;
        }
        
    }
}