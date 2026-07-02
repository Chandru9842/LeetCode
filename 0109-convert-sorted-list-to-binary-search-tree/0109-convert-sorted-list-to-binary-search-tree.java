/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
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
    public TreeNode bulid(ArrayList<Integer>ans,int left,int right){
        if(left>right){
            return null;
        }
        int mid=left+(right-left)/2;
        TreeNode root=new TreeNode(ans.get(mid));
        root.left=bulid(ans,left,mid-1);
        root.right=bulid(ans,mid+1,right);
        return root;

    }
    public TreeNode sortedListToBST(ListNode head) {
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            ans.add(temp.val);
            temp=temp.next;
        }
        int n=ans.size()-1;
        return bulid(ans,0,n);
        
    }
}