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
    public boolean path(TreeNode root,int tar,int sum){
        if(root==null){
            return false;
        }
        sum+=root.val;
        if(root.left==null&&root.right==null&&tar==sum){
            return true;
        }
        boolean left=path(root.left,tar,sum);
        boolean right=path(root.right,tar,sum);
        return left||right;
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return path(root,targetSum,0);
        
    }

}