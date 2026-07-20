// Last updated: 7/21/2026, 12:51:44 AM
class Solution {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, zeros = 0, maxLen = 0;
        
        while (right < nums.length) {
            if (nums[right] == 0) zeros++;
            
            // Shrink if invalid
            while (zeros > k) {
                if (nums[left] == 0) zeros--;
                left++;
            }
            
            maxLen = Math.max(maxLen, right - left + 1);
            right++;
        }
        return maxLen;        
    }
}