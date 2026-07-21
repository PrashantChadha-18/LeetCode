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
        Stack<ListNode> stk=new Stack<>();
        Stack<ListNode> s=new Stack<>();
        while(l1!=null)
        {
            stk.push(l1);
            l1=l1.next;
        }
        while(l2!=null)
        {
            s.push(l2);
            l2=l2.next;
        }
        int carry=0;
        while(!stk.isEmpty() || !s.isEmpty() || carry!=0)
        {
            int sum=carry;
            if(!stk.isEmpty())
            {
                sum+=stk.pop().val;
            }
            if(!s.isEmpty())
            {
                sum+=s.pop().val;
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