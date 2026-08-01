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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>>ans=new ArrayList<>();
        Deque<TreeNode>q=new ArrayDeque<>();
        boolean lefttoright=true;
        if(root==null){
            return ans;
        }
        q.add(root);
        while(!q.isEmpty()){
            LinkedList<Integer>res=new LinkedList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
                TreeNode node=q.poll();
                if(lefttoright){
                     res.addLast(node.val);
                }
                else{
                     res.addFirst(node.val);
                   
                }
                if(node.left!=null){
                    q.offer(node.left);
                }
                if(node.right!=null){
                    q.offer(node.right);
                }
                
            }
            ans.add(res);
            // lefttoright=!lefttoright;  is is correct not not readable
            if(lefttoright==true){
                lefttoright=false;
            }
            else{
                lefttoright=true;
            }
        }

        return ans;

        
    }
}