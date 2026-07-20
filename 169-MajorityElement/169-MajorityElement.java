// Last updated: 7/21/2026, 12:52:57 AM
class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
            
            if (count > n / 2) {
                return num;
            }
        }
        return -1;        
        
    }
}