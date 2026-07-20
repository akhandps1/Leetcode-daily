// Last updated: 7/21/2026, 12:51:37 AM
class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] result = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            result[2 * i] = nums[i];      // X part element
            result[2 * i + 1] = nums[i + n]; // Y part element (offset by n)
        }
        
        return result;        
    }
}