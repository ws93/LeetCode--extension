public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new LinkedList<>();
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                if(isPalin(words[i].concat(words[j]))) {
                    res.add(Arrays.asList(i, j));
                }
                if(isPalin(words[j].concat(words[i]))) {
                    res.add(Arrays.asList(j, i));
                }                
            }
        }
        return res;
    }
    
    private boolean isPalin(String s) {
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if(s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}