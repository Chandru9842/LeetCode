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
    public int rob(TreeNode root) {
        int[]options=travel(root);
        return Math.max(options[0],options[1]);
        
    }
    public int[]travel(TreeNode root){
        if(root==null){
            return new int[2];
        }
        int[]left_node=travel(root.left);
        int[]right_node=travel(root.right);
        int[]options=new int[2];
        options[0]=root.val+left_node[1]+right_node[1];
        options[1]=Math.max(left_node[0],left_node[1])+Math.max(right_node[0],right_node[1]);
        return options;
    }
}