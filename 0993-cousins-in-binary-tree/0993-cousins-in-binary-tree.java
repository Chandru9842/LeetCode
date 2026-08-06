class Solution {
    int xlevel=-1;
    int ylevel=-1;
    TreeNode xparent=null;
    TreeNode yparent=null;
    public  void dfs(TreeNode root,TreeNode parent,int level,int x,int y){
        if(root==null){
            return ; 
        }
        if(root.val==x){
            xlevel=level;
            xparent=parent;
        }
        if(root.val==y){
            ylevel=level;
            yparent=parent;
        }
        dfs(root.left,root,level+1,x,y);
        dfs(root.right,root,level+1,x,y);

    }
    public boolean isCousins(TreeNode root, int x, int y) {
        dfs(root,null,0,x,y);
        return xlevel==ylevel&&xparent!=yparent;
        
    }
}