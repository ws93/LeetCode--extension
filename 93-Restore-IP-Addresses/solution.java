public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> res = new ArrayList<>();
        int len = s.length();
        for(int i = 1; i < 4 && i < len - 2; i++) {
            for(int j = i + 1; j < i + 4 && j < len - 1; j++) {
                for(int k = j + 1; k < j + 4 && k < len; k++) {
                    String s1 = s.substring(0, i), s2 = s.substring(i, j), s3 = s.substring(j, k), s4 = s.substring(k);
                    if(isValid(s1) && isValid(s2) && isValid(s3) && isValid(s4)) {
                        res.add(s1 + "." + s2 + "." + s3 + "." + s4);
                    }
                }
            }
        }
        return res;
    }
    
    private boolean isValid(String s) {
        if((s.length() > 1 && s.charAt(0) == '0') || s.length() > 3 || Integer.parseInt(s) > 255) {
            return false;
        }
        return true;
    }
}