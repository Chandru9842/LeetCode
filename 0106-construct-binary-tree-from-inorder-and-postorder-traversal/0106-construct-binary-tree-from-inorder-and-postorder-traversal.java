class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length!=postorder.length){
            return null;
        }
        if(inorder==null||postorder==null){
            return null;
        }
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return bulid(inorder,0,inorder.length-1,postorder,0,postorder.length-1,map);
        
    }
    public TreeNode bulid(int[]inorder,int inst,int ined,int[]postorder,int prst,int pred,HashMap<Integer,Integer>map){
        if(inst>ined||prst>pred){
            return null;
        }
        TreeNode root=new TreeNode(postorder[pred]);
        int inroot=map.get(postorder[pred]);
        int numsleft=inroot-inst;
        root.left=bulid(inorder,inst,inroot-1,postorder,prst,prst+numsleft-1,map);
        root.right=bulid(inorder,inroot+1,ined,postorder,prst+numsleft,pred-1,map);
        return root;


    }
}