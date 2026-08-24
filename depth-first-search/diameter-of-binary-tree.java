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
    int diameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
       
        height(root);
        return diameter;
    }
    private int height(TreeNode root){
        if(root == null){
            return 0;

        }
        int lH = height(root.left );
        int rH = height(root.right );
        diameter = Math.max(diameter , lH + rH);

        return 1+ Math.max(lH ,rH);
    }
}