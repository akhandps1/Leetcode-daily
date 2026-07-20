// Last updated: 7/21/2026, 12:51:21 AM
class Solution {
    public long gcdSum(int[] nums) {
        int n = nums.length;
        long[] prefixGcd = new long[n];

        int maxSoFar = 0;

        // Step 1: Build prefixGcd
        for (int i = 0; i < n; i++) {
            maxSoFar = Math.max(maxSoFar, nums[i]);
            prefixGcd[i] = gcd(nums[i], maxSoFar);
        }

        // Step 2: Sort
        Arrays.sort(prefixGcd);

        // Step 3: Pair smallest with largest
        int left = 0, right = n - 1;
        long sum = 0;

        while (left < right) {
            sum += gcd((int)prefixGcd[left], (int)prefixGcd[right]);
            left++;
            right--;
        }

        return sum;        
    }
    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }    
}