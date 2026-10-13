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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head==null){
            return null;
        }
        ListNode second=head;
        ListNode first=head;
        ListNode previous=head;
        // ArrayList<Node>arr=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(first==null){
                return head;
            }
            first=first.next;
        }
        if(first==null){
            return head.next;
        }
        while(first!=null){
            first=first.next;
            previous=second;
            second=second.next;
        }
        previous.next=second.next;
        return head;

        
    }
}