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
        List<Integer> array = new ArrayList<>();
        postorderTraversal(root, array);
        return array;
    }

    public void postorderTraversal(TreeNode root, List<Integer> array) {
        if (root == null) return;

        postorderTraversal(root.left, array);
        postorderTraversal(root.right, array);
        array.add(root.val);        
    }
}