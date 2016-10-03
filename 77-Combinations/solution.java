public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<>();
        helper(list, new ArrayList<Integer>(), 1, n, k);
        return list;
    }
    
    private void helper(List<List<Integer>> list, List<Integer> tmp, int start, int n, int k) {
        if (k == 0) {
            list.add(new ArrayList<Integer>(tmp));
            return;
        }
        
        for (int i = start; i <= n; i++) {
            tmp.add(i);
            helper(list, tmp, i + 1, n, k - 1);
            tmp.remove(tmp.size() - 1);
        }
    }
}
