// Last updated: 7/21/2026, 12:52:37 AM
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer>result=new ArrayList<>();
        int n=nums.length;

        for(int i=0;i<n;i++){
            if(result.contains(nums[i])) continue;
            int count=0;
            for(int j=0;j<n;j++){
                if(nums[j]==nums[i])
                count++;
            }
            if(count>n/3){
                result.add(nums[i]);
            }
        }
        return result;

        
    }
}