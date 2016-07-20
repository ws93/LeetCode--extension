public class Solution {
    public int strStr(String haystack, String needle) {
        if(needle == null || needle.length() == 0) {
            return 0;
        }
        for(int i = 0; i < haystack.length(); i++) {
            if(haystack.charAt(i) == needle.charAt(0) && i <= haystack.length() - needle.length()) {
                int count = 1;
                for(int j = 1; j < needle.length(); j++) {
                    if(haystack.charAt(i + j) != needle.charAt(j)) {
                        break;
                    } else {
                        count++;
                    }
                }
                if(count == needle.length()) {
                    return i;
                }
            }
        }
        return -1;
    }
}