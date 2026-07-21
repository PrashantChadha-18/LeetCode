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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;
        Stack<ListNode> s1=new Stack<>();
        Stack<ListNode> s2=new Stack<>();
        while(l1!=null)
        {
            s1.push(l1);
            l1=l1.next;
        }
        while(l2!=null)
        {
            s2.push(l2);
            l2=l2.next;
        }
        int carry=0;
        while(!s1.isEmpty() || !s2.isEmpty() || carry!=0)
        {
            int sum=carry;
            if(!s1.isEmpty())
            {
                sum+=s1.pop().val;
            }
            if(!s2.isEmpty())
            {
                sum+=s2.pop().val;
            }
            carry=sum/10;
            curr.next=new ListNode(sum%10);
            curr=curr.next;
        }
        ListNode arr=dummy.next;
        ListNode prev=null;
        while(arr!=null)
        {
            ListNode next=arr.next;
            arr.next=prev;
            prev=arr;
            arr=next;
        }
        return prev;
    }
}