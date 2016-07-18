public class Solution {
    public String reverseVowels(String s) {
        String vowel = "aeiou";
        StringBuilder sb = new StringBuilder();
        int j = s.length() - 1;
        for(int i = 0; i < s.length(); i++) {
            if(vowel.indexOf(Character.toLowerCase(s.charAt(i))) == -1) { // if this char is not a vowel, we append this char to sb
                sb.append(s.charAt(i)); 
            } else { // if this char is a vowel, we append 
                while(j >= 0 && vowel.indexOf(Character.toLowerCase(s.charAt(j))) == -1) {
                    j--;
                }
                sb.append(s.charAt(j--));
            }
        }
        return sb.toString();
    }
}