public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        Set<String> seen = new HashSet<>(), rep = new HashSet<>();
        for(int i = 0; i <= s.length() - 10; i++) {
            String tmp = s.substring(i, i + 10);
            if(!seen.contains(tmp)) {
                seen.add(tmp);
            } else {
                rep.add(tmp);
            }
        }
        return new ArrayList(rep);
    }
}