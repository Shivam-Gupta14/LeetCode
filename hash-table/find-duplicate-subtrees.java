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
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        List<TreeNode> res = new ArrayList<>();
        HashMap<String , Integer> map = new HashMap<>();
        helper(res , map , root);
        return res ; 

    }
    public String helper(List<TreeNode> res ,  HashMap<String , Integer> map , TreeNode root){
        if(root == null){
            return "";
        }
        String left = helper(res , map , root.left);
        String right = helper(res , map , root.right);

        int currval = root.val;

        String stringout = currval + "$" + left + "$" + right ;
        if(map.getOrDefault(stringout , 0) == 1){
            res.add(root);
        }
        map.put(stringout ,map.getOrDefault(stringout , 0) +1);
        return stringout;
    }
}