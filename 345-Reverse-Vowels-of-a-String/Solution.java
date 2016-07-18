// with stack
public class Solution {
    public String reverseVowels(String s) {
        String vowel = "aeiouAEIOU";
        Stack<Character> list = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(vowel.indexOf(s.charAt(i)) != -1) {
                list.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(vowel.indexOf(s.charAt(i)) == -1) {
                sb.append(s.charAt(i));
            } else {
                sb.append(list.pop());
            }
        }
        return sb.toString();
    }
}