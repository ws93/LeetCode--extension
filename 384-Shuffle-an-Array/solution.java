public class Solution {
    int[] original;
    java.util.Random rand;
    public Solution(int[] nums) {
        original = nums;
        rand = new java.util.Random();
    }
    
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
        return original;
    }
    
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
        int[] shuffle = original.clone();
        for (int i = shuffle.length - 1; i >= 0; i--) {
            int p = rand.nextInt(i + 1);
            swap(p, i, shuffle);
        }
        return shuffle;
    }
    
    private void swap(int i, int j, int[] nums) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */