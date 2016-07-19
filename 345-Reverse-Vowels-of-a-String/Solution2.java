// with memo
public class Solution {
    public String reverseVowels(String s) {
        String vowel = "aeiouAEIOU";       
        List<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            if(vowel.indexOf(s.charAt(i)) != -1) {
                list.add(0, s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(vowel.indexOf(s.charAt(i)) == -1) {
                sb.append(s.charAt(i));
            } else {
                sb.append(list.remove(0));
            }
        }
        return sb.toString();
    }
}