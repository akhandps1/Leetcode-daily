// Last updated: 7/21/2026, 12:52:10 AM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length(), m = t.length();
        if (n == 0) return true;
        
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        
        return i == n;
        
    }
}