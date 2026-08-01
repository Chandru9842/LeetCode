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
        // int depth=1;
        //  if(root==null){
        //     return 0;
        // }
        // Deque<TreeNode>q=new ArrayDeque<>();
        // q.offer(root);
       
        // while(!q.isEmpty()){
        //     int size=q.size();
        //     for(int i=0;i<size;i++){
        //          root=q.poll();
        //         if(root.left==null&&root.right==null){
        //             return depth;

        //         }
        //         if(root.left!=null){
        //             q.offer(root.left);
        //         }
        //         if(root.right!=null){
        //             q.offer(root.right);
        //         }
        //     }
        //     depth++;
        // }
        // return depth;
        if(root==null){
            return 0;
        }
        int left=minDepth(root.left);
        int right=minDepth(root.right);
        if(left==0){
            return 1+right;
        }
        if(right==0){
            return 1+left;
        }
        int max=1+Math.min(left,right);
        return max;
    }
}