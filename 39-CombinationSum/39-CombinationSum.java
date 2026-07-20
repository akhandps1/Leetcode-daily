// Last updated: 7/21/2026, 12:54:11 AM
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, candidates, target, ans, new ArrayList<>());
        return ans;        
    }
    private void findCombinations(int ind, int[] arr, int target, List<List<Integer>> ans, List<Integer> ds) {
        // Base Case
        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }
        
        // Pick Strategy (Multiple times allowed)
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, arr, target - arr[ind], ans, ds); // Stay at 'ind'
            ds.remove(ds.size() - 1); // Backtrack
        }
        
        // Not Pick Strategy
        findCombinations(ind + 1, arr, target, ans, ds);
    }    
}