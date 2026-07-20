// Last updated: 7/21/2026, 12:51:34 AM
class Solution {
    public int findKthPositive(int[] arr, int k) {
      for(int x:arr){
        if(x<=k) k++;
        else break;
      }
      return k;
    }
}