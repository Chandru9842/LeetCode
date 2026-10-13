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
    public ListNode oddEvenList(ListNode head) {
        ArrayList<Integer>ans=new ArrayList<>();
        ListNode temp=head;
        if(head==null){
            return null;
        }
        while(temp!=null){
            ans.add(temp.val);
             if(temp.next==null){
                break;
            }
            temp=temp.next.next;
           


        }
        temp=head.next;
        int i=0;
        while(temp!=null){
            ans.add(temp.val);
              if(temp.next==null){
                break;
            }
            temp=temp.next.next;
       
        }
        
        temp=head;


        while(temp!=null){
            temp.val=ans.get(i);
            i++;
            temp=temp.next;
        }
        return head;
    }
}