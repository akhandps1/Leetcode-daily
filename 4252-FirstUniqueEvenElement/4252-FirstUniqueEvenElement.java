// Last updated: 7/21/2026, 12:51:20 AM
class Solution {
    public int firstUniqueEven(int[] nums) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        // Step 1: Count frequency
        for (int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }

        // Step 2: Find first unique even number
        for (int num : nums) {
            if (num % 2 == 0 && freq.get(num) == 1) {
                return num;
            }
        }

        // Step 3: If not found
        return -1;        
    }
}