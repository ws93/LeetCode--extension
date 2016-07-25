public class Solution {
    public String intToRoman(int num) {
        int[] value = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] string = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder res = new StringBuilder();
        int i = 0;
        while(num > 0 ) {
            if(num >= value[i]) {
                res.append(string[i]);
                num -= value[i];
            } else {
                i++;
            }
        }
        return res.toString();
    }
}