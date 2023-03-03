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
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        
        ListNode t1 = head;
        ListNode t2 = slow.next;
        // Assigining the slow.next -> null
        slow.next = null;
        
        t2 = reverseLL(t2);
        
        ListNode dummy = new ListNode(-1);
        ListNode ls = dummy;
        while(t1 != null && t2 != null){
            ls.next = t1;
            ls = t1;
            t1 = t1.next;
            
            ls.next = t2;
            ls = t2;
            t2 = t2.next;
        }
        // If any LL left:
        if(t1 != null){
            ls.next = t1;
        }
        else if(t2 != null){
            ls.next = t2;
        }
        
    }
    public ListNode reverseLL(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr != null){
            ListNode nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }
        return prev;
    }
}