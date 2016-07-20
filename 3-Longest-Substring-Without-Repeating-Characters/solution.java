public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int res = 0;
        Set<Character> set = new HashSet<>();
        for(int i = 0; i < s.length(); i++) {
            int tmp = 0;
            for(int j = i; j < s.length(); j++) {
                if(!set.contains(s.charAt(j))) {
                    set.add(s.charAt(j));
                    tmp++;
                } else {
                    set.clear();
                    break;
                }                
            }
            res = Math.max(res, tmp);
        }
        return res;
    }
}