class Solution {
    void dfs(TreeNode root,List<Integer>lst,int level){
        if(root==null){
            return;
        }
        if(level==lst.size()){
            lst.add(root.val);
        }
        dfs(root.right,lst,level+1);
        dfs(root.left,lst,level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer>ans=new ArrayList<>();
        dfs(root,ans,0);
            return ans;
        
        
    }
}