public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        int count = 0;
        List<List<String>> res = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();
        for(String str : strs) {
            char[] ca = str.toCharArray();
            Arrays.sort(ca);
            String tmp = String.valueOf(ca);
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