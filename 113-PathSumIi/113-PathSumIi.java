// Last updated: 7/21/2026, 12:53:28 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentPath = new ArrayList<>();
        solve(root, targetSum, currentPath, result);
        return result;        
    }
    
    private void solve(TreeNode root, int target, List<Integer> path, List<List<Integer>> res) {
        if (root == null) return;
        
        // Step 1: Add current node to path
        path.add(root.val);
        
        // Step 2: Check if it's a valid leaf path
        if (root.left == null && root.right == null && target == root.val) {
            res.add(new ArrayList<>(path)); // Make a deep copy
        } else {
            // Step 3: Explore children
            solve(root.left, target - root.val, path, res);
            solve(root.right, target - root.val, path, res);
        }
        
        // Step 4: Backtrack (Remove node while going up)
        path.remove(path.size() - 1);    
}
}