public class Solution {
    public char findTheDifference(String s, String t) {
        int[] set = new int[26];
        for (int i = 0; i < s.length(); i++) {
            set[s.charAt(i) - 'a']++;
        }
        for (int i = 0; i < t.length(); i++) {
            if(--set[t.charAt(i) - 'a'] < 0) {
                return t.charAt(i);
            }
        }
        return '0';
    }
}