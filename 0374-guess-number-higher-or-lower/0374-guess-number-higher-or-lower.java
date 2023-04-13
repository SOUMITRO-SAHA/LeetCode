/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int si = 1;
        int ei = n;
        while(si < ei){
            int mid = si + (ei - si)/2;
            
            if(guess(mid) == 0) return mid;
            else if(guess(mid) == -1) ei = mid -1;
            else si = mid +1;
        }
        return si;
    }
}