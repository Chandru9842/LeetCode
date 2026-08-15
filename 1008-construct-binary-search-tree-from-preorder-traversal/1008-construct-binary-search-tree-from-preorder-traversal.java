class Solution {
    static int i=0;
    public static TreeNode dfs(int[]arr,int bound){
        if(i>=arr.length||arr[i]>bound){
            return null;
        }
        TreeNode root=new TreeNode(arr[i]);
        i++;
        root.left=dfs(arr,root.val);
        root.right=dfs(arr,bound);
        return root;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        i=0;
        return dfs(preorder,Integer.MAX_VALUE);
        
    }
}