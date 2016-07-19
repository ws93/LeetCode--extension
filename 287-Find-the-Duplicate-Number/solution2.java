public class Solution {
    public int findDuplicate(int[] nums) {
        int slow = 0, fast = 1;
        while(slow != fast) {
            slow = nums[slow];
            fast = nums[nums[fast]];
        }
        int find = 0;
        while(find != slow) {
            slow = nums[slow];
            find = nums[find];
        }
        return find;
    }
}