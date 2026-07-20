// Last updated: 7/21/2026, 12:54:44 AM
class Solution {
    public int reverse(int x) {
       int rev = 0;

        while (x != 0) {
            int digit = x % 10; // Last digit nikala
            x = x / 10;         // Number chhota kiya
            if (rev > Integer.MAX_VALUE / 10 || rev < Integer.MIN_VALUE / 10) {
                return 0;
            }

            rev = rev * 10 + digit; // Reverse build kiya
        }
        return rev; 
    }
}
