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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> array = new ArrayList<>();
        preOrder(root, array);
        return array;
    }

    public void preOrder(TreeNode node, List<Integer> array) {
        if (node == null) return;
        
        array.add(node.val);
        preOrder(node.left, array);
        preOrder(node.right, array);
    }
}