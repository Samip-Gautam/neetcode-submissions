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
        Deque<TreeNode> stack = new ArrayDeque<>();
        TreeNode current = root;
        List<Integer> numbers = new ArrayList<>();

        while (current != null || !(stack.isEmpty())) {
            while (current != null) {
                stack.push(current);
                numbers.add(current.val);
                current = current.left;
            }
            current = stack.pop();
            current = current.right;        }

        return numbers;
    }
}