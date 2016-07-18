// with stack
public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        vowel.add('A');
        vowel.add('E');
        vowel.add('I');
        vowel.add('O');
        vowel.add('U');        
        Stack<Character> list = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            if(vowel.contains(s.charAt(i))) {
                list.push(s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(!vowel.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                sb.append(list.pop());
            }
        }
        return sb.toString();
    }
}