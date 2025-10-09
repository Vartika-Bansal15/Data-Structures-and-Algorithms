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
    public ListNode oddEvenList(ListNode head) {
        ListNode temp = head;
        ListNode h1 = new ListNode(4);
        ListNode t1 = h1;
        ListNode h2 = new ListNode(5);
        ListNode t2 = h2; 
        int size = 0;
        while(temp != null){
            size++;
            temp = temp.next;
        }
        temp = head;
        while( temp != null){
            for(int i =1 ; i<=size ; i++){
            if(i % 2 != 0){
                ListNode a = new ListNode(temp.val);
                t1.next = a;
                t1 = a;
            }
            else{
                ListNode a = new ListNode(temp.val);
                t2.next = a;
                t2 = a;
            }
            temp = temp.next;
        }
        }
        t1.next = h2.next;
        return h1.next;
    }
}
