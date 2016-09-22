public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k == 0 || t < 0) {
            return false;
        }
        Map<Long, Long> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            long newNum = (long)nums[i] - Integer.MIN_VALUE;
            long bucket = newNum / ((long)t + 1);
            if (map.containsKey(bucket) 
                || (map.containsKey(bucket + 1) && map.get(bucket + 1) - newNum <= t)
                || (map.containsKey(bucket - 1) && newNum - map.get(bucket - 1) <= t)) {
                    return true;
            }
            if (map.entrySet().size() >= k) {
                map.remove(((long)nums[i - k] - Integer.MIN_VALUE) / ((long)t + 1));
            }
            map.put(bucket, newNum);
        }
        return false;
    }
}