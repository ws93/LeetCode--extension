public class Solution {
    public String reverseWords(String s) {
        // String[] words = s.trim().split(" +");
        // if(words.length == 0) {
        //     return "";
        // }
        // StringBuilder res = new StringBuilder();
        // res.append(words[0]);
        // for(int i = 1; i < words.length; i++) {
        //     res.append(" ");
        //     res.append(words[i]);
        // }
        // return res.toString();
        String[] words = s.trim().split(" +");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}