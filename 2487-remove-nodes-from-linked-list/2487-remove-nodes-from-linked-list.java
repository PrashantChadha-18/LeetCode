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
    public ListNode removeNodes(ListNode head) {
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        ListNode y=head;
        int max=y.val;
        while(y!=null && y.next!=null)
        {
            if(y.next.val<max)
            {
                y.next=y.next.next;
            }
            else
            {
                y=y.next;
                max=y.val;
            }
        }
        ListNode reverse=head;
        ListNode p=null;
        while(reverse!=null)
        {
            ListNode next=reverse.next;
            reverse.next=p;
            p=reverse;
            reverse=next;
        }
        return p;
    }
}