// Last updated: 7/21/2026, 12:52:54 AM
class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==0)
        return 0;
        if(n==1)
        return nums[0];

        int prev2=0;
        int prev1=nums[0];
        for(int i=1;i<n;i++){
            int pick=nums[i];
            if(i>1)
            pick+=prev2;
            else pick+=0;

            int notPick=prev1;
            int curr=Math.max(pick,notPick);
            prev2=prev1;
            prev1=curr;
        }
        return prev1;
    }
}