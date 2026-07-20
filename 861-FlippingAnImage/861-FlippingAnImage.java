// Last updated: 7/21/2026, 12:51:49 AM
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        int[][] ans = new int[n][n]; // Extra space
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Reverse index: n - 1 - j
                // Invert value: ^ 1
                ans[i][j] = image[i][n - 1 - j] ^ 1;
            }
        }
        return ans;        
    }
}