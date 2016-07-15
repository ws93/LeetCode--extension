import java.util.*;
public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        int N = citations.length;
        Arrays.sort(citations);
        for(int i = 0; i < citations.length; i++) {
            if(citations[i] >= N - i) {
                return N - i;
            }
        }
        return 0;
    }
}