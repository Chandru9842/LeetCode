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
        ArrayList<List<Integer>>ans=new ArrayList<>();
        Deque<TreeNode>q=new ArrayDeque<>();
        if(root==null){
            return ans;
        }
        boolean lefttoRight=true;
        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            // ArrayLinkedList<>
            LinkedList<Integer>row=new LinkedList<>();

            // LinkedList<Integer> level = new LinkedList<>();
            for(int i=0;i<size;i++){
                 root=q.poll();
                 if(lefttoRight){
                    row.addLast(root.val);
                 }
                 if(!lefttoRight){
                    row.addFirst(root.val);
                 }
                 if(root.left!=null){
                    q.offer(root.left);
                 }
                 if(root.right!=null){
                    q.offer(root.right);
                 }

            }
            ans.add(row);
            lefttoRight=!lefttoRight;
           


        }
        return ans;

 
    }
}