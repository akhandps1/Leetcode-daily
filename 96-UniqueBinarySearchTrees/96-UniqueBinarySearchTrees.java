// Last updated: 7/21/2026, 12:53:42 AM
class Solution {
  public int numTrees(int n) {
    // Step 1: DP array banakr base cases set karo
    int[] dp = new int[n + 1];
    dp[0] = 1; // Empty tree ka 1 way
    if (n == 0)
      return 1;
    dp[1] = 1; // Single node tree ka 1 way

    // Step 2: DP state calculate karo (Catalan formula)
    // i = total number of nodes (2 se n tak)
    for (int i = 2; i <= n; i++) {
      // j = current root node (1 se i tak)
      for (int j = 1; j <= i; j++) {
        int leftNodes = j - 1;
        int rightNodes = i - j;

        // left subtree ways * right subtree ways
        dp[i] += dp[leftNodes] * dp[rightNodes];
      }
    }

    // Step 3: Final result return karo
    return dp[n];

  }
}