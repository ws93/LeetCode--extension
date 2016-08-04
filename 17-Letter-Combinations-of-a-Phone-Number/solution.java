public class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> res = new ArrayList<>();
        if(digits == null || digits.length() == 0) {
            return res;
        }
        String[] map = {"0","1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i = 0; i < map[digits.charAt(0) - '0'].length(); i++) {
            res.add(Character.toString(map[digits.charAt(0) - '0'].charAt(i)));
        }
        for(int i = 1; i < digits.length(); i++) {
            List<String> tmp = new ArrayList<>(res);
            res.clear();
            char[] ch = map[digits.charAt(i) - '0'].toCharArray();
            for(int j = 0; j < ch.length; j++) {
                for(int k = 0; k < tmp.size(); k++) {
                    res.add(tmp.get(k) + Character.toString(ch[j]));
                }
            }
        }
        return res;
    }
}