// Last updated: 7/21/2026, 12:52:24 AM
/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 1;
        int high = n;
        int ans = n; // Default to last
        
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (isBadVersion(mid)) {
                ans = mid;      // Found a bad one, mark it
                high = mid - 1; // Try to find an earlier bad one
            } else {
                low = mid + 1;  // Everything before mid is good
            }
        }
        return ans;        
    }
}