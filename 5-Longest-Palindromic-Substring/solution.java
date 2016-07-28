public class Solution {
    int maxLen = 0, startPos = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len < 2) {
            return s;
        }
        for(int i = 0; i < len; i++) {
            extendPalin(s, i, i);
            extendPalin(s, i, i + 1);
        }
        return s.substring(startPos, startPos + maxLen);
    }
    
    private void extendPalin(String s, int left, int right) {
        while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        if(maxLen < right - left - 1) {
            maxLen = right - left - 1;
            startPos = left + 1;
        }
    }
}