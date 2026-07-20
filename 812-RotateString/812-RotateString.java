// Last updated: 7/21/2026, 12:51:50 AM
class Solution {
    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.equals(goal)) return true;

        StringBuilder sb = new StringBuilder(s);
        for (int i = 0; i < s.length(); i++) {
            // Rotate logic: delete first, append to end
            char first = sb.charAt(0);
            sb.deleteCharAt(0);
            sb.append(first);
            
            if (sb.toString().equals(goal)) return true;
        }
        return false;        
    }
}