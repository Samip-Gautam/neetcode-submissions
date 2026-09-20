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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        TreeNode current = root;
        Deque<TreeNode> stack = new ArrayDeque<>();

        boolean state = false;

        while ((current != null || !(stack.isEmpty()))) {
            while (current != null) {
                stack.push(current);
                state = helper(current, subRoot);

                if (state) return state;
                current = current.left;
            }

            current = stack.pop();
            current = current.right;
        }

        return state;
    }

    public boolean helper(TreeNode alpha, TreeNode beta) {
        if (alpha == null && beta == null) return true;
        if (alpha == null || beta == null) return false;

        return (alpha.val == beta.val) 
        && helper(alpha.left, beta.left) 
        && helper(alpha.right, beta.right);
    }
}
