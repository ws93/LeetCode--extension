public class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if(numerator == 0) {
            return "0";
        }

        StringBuilder res = new StringBuilder();
        long num = Math.abs((long) numerator), den = Math.abs((long)denominator);
        res.append((numerator > 0) ^ (denominator > 0) ? "-" : "");
        res.append(num / den);
        num %= den;
        if(num == 0) {
            return res.toString();
        }
        res.append(".");
        HashMap<Long, Integer> map = new HashMap<>();
        map.put(num, res.length());
        while(num != 0) {
            num *= 10;
            res.append(num / den);
            num %= den;
            if(!map.containsKey(num)) {
                map.put(num, res.length());
            } else {
                res.insert(map.get(num), "(");
                res.append(")");
                break;
            }
        }
        return res.toString();
    }
}