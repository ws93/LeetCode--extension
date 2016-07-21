public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        for(int i = 0; i < words.length - 1; i++) {
            for(int j = i + 1; j < words.length; j++) {
                
                //i to j
                if(isPalin(words[i].concat(words[j]))) {
                    // List<Integer> tmp1 =  new ArrayList<>();
                    // tmp1.add(i);
                    // tmp1.add(j);
                    res.add(Arrays.asList(i, j));
                }
                if(isPalin(words[j].concat(words[i]))) {
                    // List<Integer> tmp2 =  new ArrayList<>();
                    // tmp2.add(j);
                    // tmp2.add(i);
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