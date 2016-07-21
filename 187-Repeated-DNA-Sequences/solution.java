public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> set = new HashSet<>();
        for(int i = 0; i <= s.length() - 10; i++) {
            if(s.indexOf(s.substring(i, i + 10), i + 1) != -1) {
                set.add(s.substring(i, i + 10));
            }
        }
        return new ArrayList(set);
    }
}