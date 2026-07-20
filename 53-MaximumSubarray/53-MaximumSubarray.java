// Last updated: 7/21/2026, 12:54:04 AM
class Solution {
    public int maxSubArray(int[] nums) {
        int maxSum=Integer.MIN_VALUE;
        int currentSum=0;

        for(int num:nums){
            currentSum+=num;
            maxSum=Math.max(maxSum,currentSum);
            if(currentSum<0){
                currentSum=0;
            }
        }
        return maxSum;
    }
}