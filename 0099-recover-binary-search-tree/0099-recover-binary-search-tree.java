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
    int index=0;
    public void inorder(TreeNode root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        inorder(root.left,ans);
        ans.add(root.val);
        inorder(root.right,ans);

    }
    public void bulid(TreeNode root,ArrayList<Integer>ans){
        if(root==null){
            return;
        }
        bulid(root.left,ans);
        root.val=ans.get(index++);
        bulid(root.right,ans);
    }
    public void recoverTree(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        inorder(root,ans);
        Collections.sort(ans);
        bulid(root,ans);

        
    }
}