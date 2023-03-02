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
        ListNode curr, prev;
        curr = head;
        prev = head;
        // Edge Case:
        if(curr == null)
            return null;
        while(curr != null){
            if(prev.val == curr.val){
                curr = curr.next;
            }
            else{
                prev.next = curr;
                prev = curr;
            }
        }
        
        // Lastly Assigining the Prev to curr
        if(prev != null)
            prev.next = curr;
        
        return head;
    }
}