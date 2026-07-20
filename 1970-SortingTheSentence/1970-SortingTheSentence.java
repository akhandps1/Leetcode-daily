// Last updated: 7/21/2026, 12:51:28 AM
class Solution {
    public String sortSentence(String s) {
        String[] words = s.split(" ");
        String[] ans = new String[words.length];

        for (String word : words) {
            int len = word.length();
            // Extract position digit
            int index = word.charAt(len - 1) - '1'; 
            // Extract actual word
            ans[index] = word.substring(0, len - 1);
        }

        // Join array back to string
        return String.join(" ", ans);        
    }
}