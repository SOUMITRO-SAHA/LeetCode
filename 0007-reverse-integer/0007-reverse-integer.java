class Solution {
    public int reverse(int n) {
        int x = n;
        int rev = 0;
        while(x != 0){
            // Last Digit
            int last = x % 10;
            
            // Codition for checking whether the rever excided the Max value of Integer,.
            if ((rev > 0 && rev > (Integer.MAX_VALUE - last)/10) 
                || (rev < 0 && rev < (Integer.MIN_VALUE - last)/10)) 
                return 0;
            
            // Reversing the Integer:
            rev = rev * 10 + last;
            
            // Dividing the no.
            x /= 10;
        }

        return rev;
    }
}