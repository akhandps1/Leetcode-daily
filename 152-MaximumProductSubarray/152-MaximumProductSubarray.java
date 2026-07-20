// Last updated: 7/21/2026, 12:53:03 AM
class Solution {
    public int maxProduct(int[] nums) {
        int maxProd=Integer.MIN_VALUE;
        int n=nums.length;

        int prefix=1;
        for(int i=0;i<n;i++){
            prefix*=nums[i];
            maxProd=Math.max(maxProd,prefix);
            if(prefix==0)
            prefix=1;
        }

        int suffix=1;
        for(int i=n-1;i>=0;i--){
            suffix*=nums[i];
            maxProd=Math.max(maxProd,suffix);
            if(suffix==0)
            suffix=1;
        }
        return maxProd;
        
    }
}