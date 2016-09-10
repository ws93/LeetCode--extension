public class Solution {
    public int jump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int start = 0, end = 0, jump = 0;
        while (end < nums.length - 1) {
            int far = end;
            for (int i = start; i <= end; i++) {
                far = far > nums[i] + i ? far : nums[i] + i;
            }
            start = end + 1;
            end = far;
            jump++;
        }
        return jump;
    }
}