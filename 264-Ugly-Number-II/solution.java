public class Solution {
    public int nthUglyNumber(int n) {
        int count = 1;
        for (int i = 0; i < n;) {
            if (isUgly(count)) {
                i++;
            }
            count++;
        }
        return count - 1;
    }
    
    private boolean isUgly(int num) {
        if(num == 0){
            return false;
        }
        while(num != 1){
            if(num % 2 == 0){
                num = num / 2;
            }else if(num % 3 == 0){
                num = num / 3;
            }else if(num % 5 == 0){
                num = num / 5;
            }else{
                return false;
            }
        }
        return true;
    }
}