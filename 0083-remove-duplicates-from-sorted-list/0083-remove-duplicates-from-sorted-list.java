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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null){
            return head;
        }

        ListNode curr = head;
        ListNode nxt = head.next;

        while(nxt != null){
            if(nxt.val == curr.val){
                nxt = nxt.next;
                continue;
            }
            curr.next = nxt;
            curr = nxt;
            nxt = nxt.next;

        }
        curr.next =null;

        return head;
        
    }
}