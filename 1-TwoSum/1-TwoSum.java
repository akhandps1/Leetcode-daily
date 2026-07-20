// Last updated: 7/21/2026, 12:54:49 AM
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int moreNeeded=target-num;
            if(map.containsKey(moreNeeded)){
                return new int[]{map.get(moreNeeded),i};
            }
            map.put(num,i);
        }
        return new int[]{};
    }
}

// HashMap<Integer,Integer>map=new HashMap<>();
// for(int i=0;i<nums.length;i++){
//     int complement=target-nums[i];
//     if(map.containsKey(complement)){
//         return new int[]{map.get(complement),i};
//     }
//     map.put(nums[i],i);
// }
// return new int[]{};