public class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0, len = s.length() - 1;
        while(len >= 0 && s.charAt(len) == ' ') {
            len--;
        }
        while(len >= 0 && s.charAt(len) != ' ') {
            length++;
            len--;
        }
        
        return length;
    }
}