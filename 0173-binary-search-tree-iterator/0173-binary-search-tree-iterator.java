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
class BSTIterator {
    Deque<TreeNode>st=new ArrayDeque<>();
    ArrayList<Integer>ans=new ArrayList<>();
    int count=0;

    public BSTIterator(TreeNode root) {
        // st.push(root);
        if(root==null){
            return;
        }
        while(!st.isEmpty()||root!=null){
            if(root!=null){
                st.push(root);
                root=root.left;
                
            }
            else{
                TreeNode top=st.pop();
                ans.add(top.val);
                root=top.right;
            }
        }
        System.out.print(ans);

        
    }
    
    public int next() {
        return ans.get(count++);
        
    }
    
    public boolean hasNext() {
        return count<=ans.size()-1;
        
    }
}

/**
 * Your BSTIterator object will be instantiated and called as such:
 * BSTIterator obj = new BSTIterator(root);
 * int param_1 = obj.next();
 * boolean param_2 = obj.hasNext();
 */