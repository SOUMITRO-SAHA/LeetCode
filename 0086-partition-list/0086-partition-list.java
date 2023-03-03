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
        ListNode d1 = new ListNode(-1);
        ListNode d2 = new ListNode(-1);
        ListNode l1 = d1;
        ListNode l2 = d2;
        ListNode temp = head;
        
        while(temp != null){
            if(temp.val < x){
                l1.next = temp;
                l1 = temp;
            }else{
                l2.next = temp;
                l2 = temp;
            }
            temp = temp.next;
        }
        
        // Assigning the l1 and l2 to null
        if(l1 != null && l2 != null){
            l1.next = null;
            l2.next = null;
        }
        
        // Assigning the l1 to l2:
        l1.next = d2.next;
        
        // Returning the head:
        return d1.next;
    }
}