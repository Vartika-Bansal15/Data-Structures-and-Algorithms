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
       ListNode h = new ListNode(100);
       ListNode curr = head;
       ListNode prev = h;
       h.next = head;
       while( curr != null && curr.next != null && prev != null){
        if(curr.next == null){
            return head;
        }
        if(curr.next.val == curr.val){
            while(curr.next != null && curr.next.val == curr.val ){
               curr = curr.next;
            }
            prev.next = curr.next;
        }
        else{
            prev = prev.next;
        }
        curr = curr.next;
       }
       return h.next; 
    }
}
