public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int count = 0;
        List<List<String>> res = new ArrayList<>();
        HashMap<HashMap<Character, Integer>, Integer> map = new HashMap<>();
        for(String str : strs) {
            HashMap<Character, Integer> tmp = new HashMap<>();
            for(int i = 0; i < str.length(); i++) {
                if(!tmp.containsKey(str.charAt(i))) {
                    tmp.put(str.charAt(i), 1);
                } else {
                    tmp.replace(str.charAt(i), tmp.get(str.charAt(i)) + 1);
                }
            }
            if(!map.containsKey(tmp)) { // no such an anagram
                List<String> tmpList = new ArrayList<>();
                tmpList.add(str);
                map.put(tmp, count);
                res.add(count++, tmpList);
            } else { // yes we have this anagram
                res.get(map.get(tmp)).add(str);
            }
        }
        return res;
    }
}