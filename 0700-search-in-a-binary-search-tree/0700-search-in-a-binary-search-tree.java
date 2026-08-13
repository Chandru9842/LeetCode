class Solution {
    public void dfs(TreeNode root,int val,ArrayList<TreeNode>ans){
        if(root==null){
            return;
        }
        if(root.val==val){
            ans.add(root);
        }
        dfs(root.left,val,ans);
        dfs(root.right,val,ans);
    }
    public TreeNode searchBST(TreeNode root, int val) {
        ArrayList<TreeNode>ans=new ArrayList<>();
        dfs(root,val,ans);
        if(ans.size()==0){
            return null;
        }
        return ans.get(0);
        
    }
}