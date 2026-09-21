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

        int carry = 0;

        ListNode a = l1;
        ListNode b = l2;
        ListNode dummy = new ListNode();
        ListNode head = dummy;

        while(a != null || b != null || carry != 0){
            dummy.next = new ListNode();
            dummy = dummy.next;
            int sum = 0;
            if(a != null){
                sum += a.val;
                a = a.next;
            }
            if(b != null){
                sum += b.val;
                b = b.next;
            }

            sum += carry;
            carry = sum/10;
            sum %= 10;

            dummy.val = sum;
        }

        return head.next;
        
    }
}