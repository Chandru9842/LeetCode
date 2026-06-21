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

 static int height(Node root){
    if(root == null) return 0;

    return 1 + Math.max(height(root.left), height(root.right));
}

static boolean isBalanced(Node root){
    if(root == null) return true;

    int lh = height(root.left);
    int rh = height(root.right);

    if(Math.abs(lh - rh) > 1)
        return false;

    return isBalanced(root.left) && isBalanced(root.right);
}
 */
class Solution {
    public int height(TreeNode root){
        if(root==null){
            return 0;
        }
        int lf=height(root.left);
        int rh=height(root.right);
        return 1+Math.max(lf,rh);

    }
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int hf=height(root.left);
        int lf=height(root.right);
        if(Math.abs(lf-hf)>1){
            return false;
        }
       return isBalanced(root.left)
    && isBalanced(root.right);

        
    }
}