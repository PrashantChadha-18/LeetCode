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
    public ListNode partition(ListNode head, int x) {
        ListNode dummy1=new ListNode(0);
        ListNode dummy2=new ListNode(0);
        ListNode larger=dummy1;
        ListNode smaller=dummy2;
        ListNode curr=head;
        while(curr!=null)
        {
            if(curr.val<x)
            {
                smaller.next=curr;
                smaller=smaller.next;
            }
            else
            {
                larger.next=curr;
                larger=larger.next;
            }
            curr=curr.next;
        }
        larger.next=null;
        smaller.next=dummy1.next;
        return dummy2.next;
    }
}