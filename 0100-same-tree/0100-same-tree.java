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
    public boolean isSameTree(TreeNode p, TreeNode q) {    
        Deque<TreeNode>st1=new ArrayDeque<>();
        Deque<TreeNode>st2=new ArrayDeque<>();
        TreeNode root1=p;
        TreeNode root2=q;
        while ((root1 != null || !st1.isEmpty()) &&
       (root2 != null || !st2.isEmpty())){
            if(root1!=null&&root2!=null){
                if(root1.val!=root2.val){
                    return false;
                }
                st1.push(root1);
                st2.push(root2);
                root1=root1.left;
                root2=root2.left;
            }
            else if(root1==null&&root2==null){
                 root1=st1.pop();
                 root2 =st2.pop();
               root1 = root1.right;
                root2 = root2.right;
               
            }
            else{
                return false;
            }
        }
        if((root1==null&&root2==null)&&(st1.isEmpty()&&st2.isEmpty())){
            return true;
        }
        return false;

        
    }
}