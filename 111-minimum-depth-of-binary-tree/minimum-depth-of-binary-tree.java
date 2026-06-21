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
    public int minDepth(TreeNode root) {
        int depth=1;
         if(root==null){
            return 0;
        }
        Deque<TreeNode>q=new ArrayDeque<>();
        q.offer(root);
       
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                 root=q.poll();
                if(root.left==null&&root.right==null){
                    return depth;

                }
                if(root.left!=null){
                    q.offer(root.left);
                }
                if(root.right!=null){
                    q.offer(root.right);
                }
            }
            depth++;
        }
        return depth;
        
    }
}