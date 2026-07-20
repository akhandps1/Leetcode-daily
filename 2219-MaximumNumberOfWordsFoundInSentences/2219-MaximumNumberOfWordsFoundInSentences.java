// Last updated: 7/21/2026, 12:51:24 AM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxCount = 0;
        for (String s : sentences) {
            // Split by space to get words array
            String[] words = s.split(" ");
            maxCount = Math.max(maxCount, words.length);
        }
        return maxCount;        
    }
}