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
        index=0;
        bulid(root,ans);

        
    }
}