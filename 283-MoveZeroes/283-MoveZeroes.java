// Last updated: 7/21/2026, 12:52:22 AM
class Solution {
    public void moveZeroes(int[] nums) {
        ArrayList<Integer>result=new ArrayList<>();
        for(int num:nums){
            if(num!=0)
            result.add(num);
        }

        for(int i=0;i<result.size();i++){
            nums[i]=result.get(i);
        }
        for(int i=result.size();i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}