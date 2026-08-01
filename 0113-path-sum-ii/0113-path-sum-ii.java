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
    void path(List<List<Integer>>ans,TreeNode root,int tar, ArrayList<Integer>res){
        if(root==null){
            return ;
        }
        res.add(root.val);
        if(root.left==null&&root.right==null){
            if(root.val==tar){
                ans.add(new ArrayList<>(res));
            }
        }
        path(ans,root.left,tar-root.val,res);
        path(ans,root.right,tar-root.val,res);
        res.remove(res.size()-1);
        return;

        

    }
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {  
        List<List<Integer>>ans=new ArrayList<>();
        path(ans,root,targetSum,new ArrayList<>());
        return ans;
    }
}