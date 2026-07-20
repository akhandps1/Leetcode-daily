// Last updated: 7/21/2026, 12:51:23 AM
class Solution {
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        String res = "";

        for (String word : words) {
            // First make everything lowercase
            word = word.toLowerCase();
            
            // Apply rule for length >= 3
            if (word.length() >= 3) {
                word = Character.toUpperCase(word.charAt(0)) + word.substring(1);
            }
            res += word + " ";
        }
        return res.trim();        
    }
}