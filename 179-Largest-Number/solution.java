public class Solution {
    public String largestNumber(int[] nums) {
        StringBuilder res = new StringBuilder();
        String[] words = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            words[i] = Integer.toString(nums[i]);
        }
        Comparator<String> comp = new Comparator<String>() {
            @Override
            public int compare(String str1, String str2) {
                String s1 = str1 + str2;
                String s2 = str2 + str1;
                return s1.compareTo(s2);
            }
        };
        Arrays.sort(words, comp);
        if (words[words.length - 1].equals("0")) {
            return "0";
        }
        for (int i = words.length - 1; i >= 0; i--) {
            res.append(words[i]);
        }
        return res.toString();
    }
}