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
    private int getSize(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = getSize(root.left);
        int right = getSize(root.right);

        return left + right + 1;
    }
    private int getSum(TreeNode root){
                if(root == null){
            return 0;
        }
        int leftS = getSum(root.left);
        int rightS = getSum(root.right);

        return leftS + rightS + root.val;

    }
    public int averageOfSubtree(TreeNode root) {
        if(root == null){
            return 0;
        }
        int lC = averageOfSubtree(root.left); 
        int rC = averageOfSubtree(root.right); 
        int size = getSize(root);

        int sum = getSum(root);

        int avg = sum / size;
        int count = lC + rC;
        if(root.val == avg){
            count++;
        }
        return count;
    }
}