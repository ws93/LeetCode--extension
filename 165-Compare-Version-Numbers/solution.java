public class Solution {
    public int compareVersion(String version1, String version2) {
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int len = Math.max(v1.length, v2.length);
        for(int i = 0; i < len; i++) {
            String para1 = i >= v1.length ? "0" : v1[i];
            String para2 = i >= v2.length ? "0" : v2[i];
            int tmp = compare(para1, para2);
            if(tmp != 0) {
                return tmp;
            }
        }
        return 0;
    }
    
    private int compare(String s1, String s2) {
        if(s1 == null) {
            return -1;
        } else if(s2 == null) {
            return 1;
        }
        int v1 = Integer.parseInt(s1);
        int v2 = Integer.parseInt(s2);
        if(v1 > v2) {
            return 1;
        } else if(v1 < v2) {
            return -1;
        } else {
            return 0;
        }
    }
}