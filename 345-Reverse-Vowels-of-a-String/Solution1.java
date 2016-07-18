public class Solution {
    public String reverseVowels(String s) {
        String vowel = "aeiouAEIOU";
        char[] res = s.toCharArray();
        for(int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while(i < j && vowel.indexOf(res[i]) == -1) i++;
            while(i < j && vowel.indexOf(res[j]) == -1) j--;
            if(i < j) swap(res, i, j);
        }
        return String.valueOf(res);
    }
    private void swap(char[] arr, int i, int j) {
        char tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}