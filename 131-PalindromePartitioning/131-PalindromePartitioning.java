// Last updated: 7/21/2026, 12:53:19 AM
class Solution {
public static List<List<String>> partition(String s) {
List<List<String>> result = new ArrayList<>();
        List<String> currentPartition = new ArrayList<>();
        int n = s.length();
        
        // DP table to store palindrome information
        // dp[i][j] = true agar s[i...j] palindrome hai
        boolean[][] dp = new boolean[n][n];

        // Step 1: DP table ko pre-calculate karo
        for (int len = 1; len <= n; len++) { // len = length of substring
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1; // End index
                if (len == 1) {
                    dp[i][j] = true; // Single char is always palindrome
                } else if (len == 2) {
                    dp[i][j] = (s.charAt(i) == s.charAt(j));
                } else {
                    // Check first/last char and inner substring
                    dp[i][j] = (s.charAt(i) == s.charAt(j)) && dp[i + 1][j - 1];
                }
            }
        }

        // Step 2: Ab same backtracking logic run karo
        backtrack(s, 0, currentPartition, result, dp);
        return result;
    }

    private static void backtrack(String s, int start, List<String> currentPartition, List<List<String>> result, boolean[][] dp) {
        if (start == s.length()) {
            result.add(new ArrayList<>(currentPartition));
            return;
        }

        for (int i = start; i < s.length(); i++) {
            // Optimized Check: Ab 'isPalindrome' function call nahi karna
            // Sirf DP table mein O(1) lookup karna hai
            if (dp[start][i]) {
                currentPartition.add(s.substring(start, i + 1));
                backtrack(s, i + 1, currentPartition, result, dp);
                currentPartition.remove(currentPartition.size() - 1);
            }
        }
    }
}