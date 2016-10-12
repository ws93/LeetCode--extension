public class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int len1 = num1.length() - 1;
        int len2 = num2.length() - 1;
        int sum = 0, carry = 0;
        while (len1 >= 0 || len2 >= 0) {
            int i1 = len1 < 0 ? 0 : num1.charAt(len1) - '0';
            int i2 = len2 < 0 ? 0 : num2.charAt(len2) - '0';
            sum = (i1 + i2 + carry) % 10;
            carry = (i1 + i2 + carry) / 10;
            sb.append(sum);
            len1--;
            len2--;
        }
        if (carry != 0) {
            sb.append(carry);
        }
        return sb.reverse().toString();
    }
}