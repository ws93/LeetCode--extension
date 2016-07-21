public class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toLowerCase().toCharArray()) {
            if((ch >= 97 && ch <= 122) || (ch >= 48 && ch <= 57)) {
                sb.append(ch);
            }
        }
        return isPalin(sb.toString());
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