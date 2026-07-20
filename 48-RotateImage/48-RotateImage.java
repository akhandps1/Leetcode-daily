// Last updated: 7/21/2026, 12:54:07 AM
class Solution {
    public void rotate(int[][] matrix) {
        int n=matrix.length;
        int[][] dummy=new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                dummy[j][n-1-i]=matrix[i][j];
            }
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=dummy[i][j];
            }
        }
        
    }
}