/* The guess API is defined in the parent class GuessGame.
   @param num, your guess
   @return -1 if my number is lower, 1 if my number is higher, otherwise return 0
      int guess(int num); */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int low = 1, high = n, mid = 1;
        while(low < high) {
            mid = low + (high - low) / 2;
            if(guess(mid) == 0) {
                return mid;
            } else if(guess(mid) == -1) {
                high = mid;
            } else {
                low = mid;
            }
        }
        return mid;
    }
}