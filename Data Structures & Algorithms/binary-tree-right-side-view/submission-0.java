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
    public List<Integer> rightSideView(TreeNode root) {
        return rightSideView(root, 0, new ArrayList<Integer>());
        
    }

    public List<Integer> rightSideView(TreeNode root, int level, List<Integer> list) {
        if (root == null) return list;
        if (level == list.size()) list.add(root.val);

        rightSideView(root.right, level+1, list);
        rightSideView(root.left, level+1, list);        
        return list;
    }
}
