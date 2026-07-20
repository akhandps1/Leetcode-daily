// Last updated: 7/21/2026, 12:54:08 AM
class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        recurPermute(nums, new ArrayList<>(), ans, freq);
        return ans; 
    }
    private void recurPermute(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;   // Mark
                ds.add(nums[i]);  // Pick
                recurPermute(nums, ds, ans, freq);
                ds.remove(ds.size() - 1); // Backtrack
                freq[i] = false;  // Unmark
            }
        }
    }    
}