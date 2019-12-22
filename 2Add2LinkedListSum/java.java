/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode l = l1, r = l2, curr = dummy;
        int carry = 0;
        while (l != null || r != null){
            // find each List's current val;
            int x = (l != null)? l.val: 0;
            int y = (r != null)? r.val: 0;
            int sum = x + y + carry;
            carry = 0; // rest the carry bit
            if (sum >= 10){
                carry++;
                sum -= 10;
            }
            curr.val = sum;
            if (l != null) l = l.next;
            if (r != null) r = r.next;
            if (l != null || r != null){
                curr.next = new ListNode(0);
                curr = curr.next;   
            }
        }
        // check to have no carry
        if (carry != 0){
            curr.next = new ListNode(carry);
        }
        return dummy;
    }

    // in case the linked list isn't reversed
    public ListNode reverseList(ListNode head){
        if(head==null) return null;
        ListNode pre=null;
        ListNode next;
        while(head!=null){
            next=head.next;
            head.next=pre;
            pre=head;
            head=next;
        }
        return pre;
    }
}

