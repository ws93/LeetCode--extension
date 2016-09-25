// brute-force
public class Solution {
    public List<List<Integer>> palindromePairs(String[] words) {
        List<List<Integer>> res = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words[i], i);
        }
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j <= words[i].length(); j++) {
                String tmp1 = words[i].substring(0, j);
                String tmp2 = words[i].substring(j);
                if (isPalin(tmp1)) {
                    String tmp2Rev = new StringBuilder(tmp2).reverse().toString();
                    if (map.containsKey(tmp2Rev) && map.get(tmp2Rev) != i) {
                        res.add(Arrays.asList(map.get(tmp2Rev), i));                        
                    }

                } 
                if (isPalin(tmp2)) {
                    String tmp1Rev = new StringBuilder(tmp1).reverse().toString();
                    if (map.containsKey(tmp1Rev) && map.get(tmp1Rev) != i && tmp2.length() != 0) {
                        res.add(Arrays.asList(i, map.get(tmp1Rev)));  
                    }
                }
            }
        }
        return res;
    }
    
    private boolean isPalin(String s) {
        int left = 0, right = s.length() - 1;
        while (left <= right) {
            if (s.charAt(left++) != s.charAt(right--)) {
                return false;
            }
        }
        return true;
    }
}