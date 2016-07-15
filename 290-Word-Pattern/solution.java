public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character, String> map = new HashMap<>();
        String[] splitStr = str.split(" ");
        if(pattern.length() != splitStr.length) {
            return false;
        }
        for(int i = 0; i < pattern.length(); i++) {
            if(map.containsKey(pattern.charAt(i))) {
                if(!splitStr[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                if(map.containsValue(splitStr[i])) {
                    return false;
                }
                map.put(pattern.charAt(i), splitStr[i]);
            }
        }
        return true;
    }
}