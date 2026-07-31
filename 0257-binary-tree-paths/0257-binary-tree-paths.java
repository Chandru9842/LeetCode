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
    void dfs(TreeNode root ,String path, ArrayList<String>ans){

        if(root==null){
            return;
        }
        String newpath;
        if(path.isEmpty()){
           newpath=String.valueOf(root.val);
        }
        else{
            newpath=path+"->"+root.val;
        }
        if(root.left==null&&root.right==null){
            ans.add(newpath);
            return;
        }
        dfs(root.left, newpath, ans);

         dfs(root.right, newpath, ans);
    }
    public List<String> binaryTreePaths(TreeNode root) {
        
        
        ArrayList<String>ans=new ArrayList<>();
        dfs(root,"",ans);    
        return ans;
        
    }
}