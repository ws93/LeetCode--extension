public class Solution {
    public String shortestPalindrome(String s) {
        int end = s.length() - 1;
        int j = 0;
        while (j <= end) {
            end = j == 0 ? end: j - 1;
            j = 0;
            for (int i = end; i >= 0; i--)
                if (s.charAt(i) == s.charAt(j)) j++;
        }
        return new StringBuilder(s.substring(j)).reverse().toString() + s;
    }
    
    // private boolean isPalin(String s, int right) { // determine if the substring from 0 to right is a palin
    //     int left = 0;
    //     while(left <= right) {
    //         if(s.charAt(left) == s.charAt(right)) {
    //             left++;
    //             right--;
    //         } else {
    //             return false;
    //         }
    //     }
    //     return true;
    // }
}