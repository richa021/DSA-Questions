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
        ListNode fast = head;
        ListNode slow = head;
        while(n>0 && fast!=null){
            fast=fast.next;
            n--;
        }
        if(fast == null)
            return head.next;
        while(fast.next!=null){
            fast=fast.next;
            slow = slow.next;
        }
        if(slow!=null && slow.next!=null){
            slow.next=slow.next.next;
        }
        return head;

    }
}