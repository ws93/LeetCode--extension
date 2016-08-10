public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new LinkedList<>();
        if (nums == null || nums.length == 0) {
            return list;
        }
        backTrack(list, new LinkedList<Integer>(), nums);
        return list;
    }
    
    private void backTrack(List<List<Integer>> list, List<Integer> temp, int[] nums) {
        if (temp.size() == nums.length) {
            list.add(new LinkedList(temp));
        } else {
            for (int i = 0; i < nums.length; i++) {
                if(temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                backTrack(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
        return;
    }
}