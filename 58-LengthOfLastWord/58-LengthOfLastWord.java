// Last updated: 7/21/2026, 12:54:01 AM
class Solution {
    public int lengthOfLastWord(String s) {
        // Trim and split
        String[] words = s.trim().split(" ");
        // Get last word length
        return words[words.length - 1].length();
    }
}