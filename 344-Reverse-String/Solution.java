// import java.util.*;
public class Solution {
    public String reverseString(String s) {
        char[] word = new char[s.length()];
        for(int i = 0; i < word.length; i++) {
            word[i] = s.charAt(word.length - i - 1);
        }
        return String.valueOf(word);
    }
}