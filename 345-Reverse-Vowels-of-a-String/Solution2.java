// with memo
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
        List<Character> list = new LinkedList<>();
        for(int i = 0; i < s.length(); i++) {
            if(vowel.contains(s.charAt(i))) {
                list.add(0, s.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < s.length(); i++) {
            if(!vowel.contains(s.charAt(i))) {
                sb.append(s.charAt(i));
            } else {
                sb.append(list.remove(0));
            }
        }
        return sb.toString();
    }
}