public class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] res = new int[2];
        if (numbers == null || numbers.length < 2) {
            return res;
        }
        int left = 0, right = numbers.length - 1;
        while (left < right) {
            int val = numbers[left] + numbers[right];
            if (val == target) {
                res[0] = left + 1;
                res[1] = right + 1;
                break;
            } else if (val > target) {
                right--;
            } else {
                left++;
            }
        }
        return res;
    }
}