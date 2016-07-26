public class Solution {
    public int myAtoi(String str) {
        if(str == null) {
            return 0;
        }
        int sign = (str.charAt(0) == '-') ? -1 : 1;
        int res = 0, i = sign == -1 ? 1 : 0;
        for (; i < str.length(); i++) {
            if (isNum(str.charAt(i))) { // this digit is a num
                res *= 10;
                res += (str.charAt(i) - '0');
            } else {
                return sign * res;
            }
        }
        return sign * res;
    }
    
    private boolean isNum(char ch) {
        if(ch >= 48 && ch <= 57) {
            return true;
        }
        return false;
    }
}