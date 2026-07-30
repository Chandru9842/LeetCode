class Solution {
    void tree(TreeNode root){
        if(root==null){
            return ;
        }
        TreeNode temp=root.left;
        root.left=root.right;
        root.right=temp;
        tree(root.left);
        tree(root.right);
    }
    public TreeNode invertTree(TreeNode root) {
        tree(root);
        return root;

        
    }
}