// Last updated: 7/21/2026, 12:52:41 AM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer>seen=new HashSet<>();
        
        for(int num:nums){
            if(seen.contains(num)){
                return true;
            }
            seen.add(num);
        }
        return false;
    }
}