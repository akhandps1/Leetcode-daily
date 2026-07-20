// Last updated: 7/21/2026, 12:51:27 AM
class Solution {
    public String reversePrefix(String word, char ch) {
        int idx = word.indexOf(ch);
        
        // Character not found, return original word
        if (idx == -1) return word;

        // Extract parts
        String prefix = word.substring(0, idx + 1);
        String suffix = word.substring(idx + 1);

        // Reverse prefix and concatenate
        return new StringBuilder(prefix).reverse().append(suffix).toString();        
    }
}