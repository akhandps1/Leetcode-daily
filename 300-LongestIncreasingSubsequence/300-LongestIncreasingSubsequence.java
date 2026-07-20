// Last updated: 7/21/2026, 12:52:20 AM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] dp=new int[nums.length];
        Arrays.fill(dp,1);
        int maxLIS=1;

        for(int i=1;i<nums.length;i++){
            for(int j=0;j<i;j++){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[i],dp[j]+1);
                }
            }
            maxLIS=Math.max(maxLIS,dp[i]);
        }
        return maxLIS;
        
    }
}