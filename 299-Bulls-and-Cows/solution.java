public class Solution {
    public String getHint(String secret, String guess) {
        HashMap<Character, Integer> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();
        int bull = 0, cow = 0;
        for(int i = 0; i < secret.length(); i++) {
            if(!map.containsKey(secret.charAt(i))) {
                map.put(secret.charAt(i), 1);
            } else {
                map.replace(secret.charAt(i), map.get(secret.charAt(i)) + 1);
            }
        }
        for(int i = 0; i < guess.length(); i++) {
            if(secret.charAt(i) == guess.charAt(i)) {
                map.replace(secret.charAt(i), map.get(secret.charAt(i)) - 1);
                bull++;
                set.add(i);
            }
        }
        for(int i = 0; i < guess.length(); i++) {
            if(!map.containsKey(guess.charAt(i))) {
                continue;
            }
            if(!set.contains(i) && map.get(guess.charAt(i)) > 0) {
                map.replace(guess.charAt(i), map.get(guess.charAt(i)) - 1);
                cow++;
            }
        }
        String res = bull + "A" + cow + "B";
        return res;
    }
}