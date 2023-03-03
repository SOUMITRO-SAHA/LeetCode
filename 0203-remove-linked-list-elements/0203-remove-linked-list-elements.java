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
    public ListNode removeElements(ListNode head, int val) {
        ListNode d = new ListNode(-1);
        ListNode ls = d;
        
        ListNode temp = head;
        while(temp != null){
            if(temp.val != val){
                ls.next = temp;
                ls = temp;
            }
            
            temp = temp.next;
        }
        
        // Assigning the last node to null
        if(ls != null){
            ls.next = null;
        }
        
        return d.next;
    }
}