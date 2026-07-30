class Solution {
    void search(TreeNode root,int key,ArrayList<TreeNode>adj){
        if(root==null){
            return;
        }
       if(root.val==key){
        adj.add(root);
        return;
       }
       search(root.left,key,adj);
       search(root.right,key,adj);

    }
    public TreeNode searchBST(TreeNode root, int val) {
        ArrayList<TreeNode>adj=new ArrayList<>();
        search(root,val,adj);
        if(adj.size()==0){
            return null;
        }
       
        return adj.get(0);
        
    }
}