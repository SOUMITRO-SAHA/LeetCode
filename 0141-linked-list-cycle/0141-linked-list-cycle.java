/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        // Edge Case:
        if(head == null || head.next == null) return false;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
            // Checking for the same node:
            if(fast == slow){
                return true;
            }
        }
        
        return false;
    }
}