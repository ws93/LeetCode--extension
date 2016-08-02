public class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder res = new StringBuilder();
        if(strs == null || strs.length == 0) {
            return res.toString();
        }
        int minLen = Integer.MAX_VALUE;
        for(int i = 0; i < strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        for(int i = 0; i < minLen; i++) {
            if(!isSame(strs, i)) {
                break;
            } else {
                res.append(strs[0].charAt(i));
            }
        }
        return res.toString();
    }
    
    private boolean isSame(String strs[], int ind) {
        char ch = strs[0].charAt(ind);
        for(int i = 1; i < strs.length; i++) {
            if(ch != strs[i].charAt(ind)) {
                return false;
            }
        }
        return true;
    }
}