public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length() == 0) {
            return 0;
        }
        int it = 0;
        for (; it < str.length(); it++) {
            if(str.charAt(it) !=' ') {
                break;
            }
        }
        int sign = 1;
        if(str.charAt(it) == '-') {
            sign = -1;
        } else if (str.charAt(it) == '+') {
            sign = 1;
        }
        int res = 0;
        for (int i = (str.charAt(it) == '+' || str.charAt(it) == '-') == false ? it : it + 1; i < str.length(); i++) {
            int tmp = str.charAt(i) - '0';
            if(tmp > 9 || tmp < 0) {
                break;
            }
            if(Integer.MAX_VALUE/10 < res || Integer.MAX_VALUE/10 == res && Integer.MAX_VALUE %10 < tmp) {
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE; 
            }
            if (isNum(str.charAt(i))) { // this digit is a num
                res = res * 10 + tmp;
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