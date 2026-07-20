// Last updated: 7/21/2026, 12:52:02 AM
class Solution {
    int solve(int ind,int currentSum,int[] nums,int target){
        if(ind==nums.length){
        return (currentSum==target)?1:0;
       } 
       
       int positive=solve(ind+1,currentSum+nums[ind],nums,target);
       int negative=solve(ind+1,currentSum-nums[ind],nums,target);

       return positive+negative;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return solve(0,0,nums,target);
        
    }
}