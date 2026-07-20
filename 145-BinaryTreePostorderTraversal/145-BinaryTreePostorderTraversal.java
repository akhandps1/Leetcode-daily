// Last updated: 7/21/2026, 12:53:10 AM
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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Stack<TreeNode> s1 = new Stack<>();
        Stack<TreeNode> s2 = new Stack<>();

        s1.push(root);

        while (!s1.isEmpty()) {
            TreeNode node = s1.pop();
            s2.push(node); // Result me store karo

            // Pehle Left fir Right push karo s1 me
            if (node.left != null) s1.push(node.left);
            if (node.right != null) s1.push(node.right);
        }

        // Stack2 me ab nodes (Root -> Right -> Left) order me hai
        // Pop karne par (Left -> Right -> Root) milega
        while (!s2.isEmpty()) {
            ans.add(s2.pop().val);
        }
        return ans;
    }
}