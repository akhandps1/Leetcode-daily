// Last updated: 7/21/2026, 12:51:54 AM
class Solution {
    public String toLowerCase(String s) {
        String result = ""; // Using String concatenation (inefficient but simple)
        for (char ch : s.toCharArray()) {
            if (ch >= 'A' && ch <= 'Z') {
                // ASCII conversion: 'A' + 32 = 'a'
                result += (char)(ch + 32);
            } else {
                result += ch;
            }
        }
        return result;        
    }
}