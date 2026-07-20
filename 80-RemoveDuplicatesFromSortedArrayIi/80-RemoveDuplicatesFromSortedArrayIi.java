// Last updated: 7/21/2026, 12:53:50 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0; // Pointer for the next position to place a valid element
        
        for (int num : nums) {
            // Allow the element if:
            // - We have less than 2 elements (k < 2), OR
            // - Current element is not the same as the element two positions back
            if (k < 2 || num != nums[k - 2]) {
                nums[k] = num;
                k++;
            }
        }
        return k;
    }
}