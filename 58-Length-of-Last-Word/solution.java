public class Solution {
    public int lengthOfLastWord(String s) {
        String[] res = s.split(" ");
        return res.length != 0 ? res[res.length - 1].length() : 0;
    }
}