// Last updated: 7/21/2026, 12:52:07 AM
class Solution {
    public String addStrings(String num1, String num2) {
        String res = "";
        int i = num1.length() - 1;
        int j = num2.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0 || carry != 0) {
            int d1 = (i >= 0) ? num1.charAt(i--) - '0' : 0;
            int d2 = (j >= 0) ? num2.charAt(j--) - '0' : 0;

            int sum = d1 + d2 + carry;
            res = (sum % 10) + res; // Heavy Operation
            carry = sum / 10;
        }
        return res;        
    }
}