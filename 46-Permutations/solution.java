public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            return res;
        }
        backTracking(res, new ArrayList<Integer>(), nums);
        return res;
    }
    
    private void backTracking(List<List<Integer>> res, List<Integer> tmp, int[] nums) {
        if (tmp.size() == nums.length) {
            res.add(new ArrayList(tmp));
        } else {
            for (int num : nums) {
                if (tmp.contains(num)) {
                    continue;
                } else {
                    tmp.add(num);
                    backTracking(res, tmp, nums);
                    tmp.remove(tmp.size() - 1);
                }
            }
        }
    }
}