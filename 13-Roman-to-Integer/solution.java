public class Solution {
    public int romanToInt(String s) {
        int res = toInt(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            int prev = toInt(s.charAt(i - 1));
            int curt = toInt(s.charAt(i));
            if(prev >= curt) {
                res += curt;
            } else {
                res = res - 2 * prev + curt;
            }
        }
        return res;
    }
    
    private int toInt(char ch) {
        int res = 0;
        switch(ch) {
            case 'I':
                res = 1;
                break;
            case 'V':
                res = 5;
                break;
            case 'X':
                res = 10;
                break;
            case 'L':
                res = 50;
                break;
            case 'C':
                res = 100;
                break;
            case 'D':
                res = 500;
                break;
            case 'M':
                res = 1000;
                break;
        }
        return res;
    }
}