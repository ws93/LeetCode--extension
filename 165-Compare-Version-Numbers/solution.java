public class Solution {
    public int compareVersion(String version1, String version2) {
        double a = Double.parseDouble(version1), b = Double.parseDouble(version2);
        if(a == b) {
            return 0;
        } else if(a > b) {
            return 1;
        } else {
            return -1;
        }
    }
}