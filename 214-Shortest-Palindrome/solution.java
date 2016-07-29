public class Solution {
    public String shortestPalindrome(String s) {
        if(s == null | s.length() < 2) {
            return s;
        }
        int pos = 0;
        //StringBuilder res = new StringBuilder();
        for(int i = s.length() - 1; i >= 0; i--) {
            if(isPalin(s, i)) {
                pos = i;
                if(i == s.length() - 1) {
                    return s;
                }
                // res.append(new StringBuilder(s.substring(i + 1)).reverse().toString());
                // res.append(s);
                // return res.toString();
                break;
            }
        }
        return new StringBuilder(s.substring(pos + 1)).reverse().toString() + s;
        // return res.toString();
    }
    
    private boolean isPalin(String s, int right) { // determine if the substring from 0 to right is a palin
        int left = 0;
        while(left <= right) {
            if(s.charAt(left) == s.charAt(right)) {
                left++;
                right--;
            } else {
                return false;
            }
        }
        return true;
    }
}