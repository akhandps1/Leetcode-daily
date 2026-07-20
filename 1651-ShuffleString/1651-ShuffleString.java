// Last updated: 7/21/2026, 12:51:33 AM
class Solution {
    public String restoreString(String s, int[] indices) {
        char[] res = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            // Place character at its target index directly
            res[indices[i]] = s.charAt(i);
        }
        return new String(res);        
    }
}