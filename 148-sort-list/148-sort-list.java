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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        ListNode dummy = new ListNode(0);
        ListNode temp = dummy;
        
        while(head!=null){
            pq.add(head.val);
            head=head.next;
        }
        
        while(!pq.isEmpty()){
            ListNode node = new ListNode(pq.poll());
            temp.next = node;
            temp=temp.next;
        }
        return dummy.next; 
    }
}