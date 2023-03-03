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
        // Edge Case:
        if(head == null || head.next == null){
            return null;
        }
        
        int len = countLL(head);
        ListNode temp = head;
        
        if(len - n == 0){
            // Head should be remove:
            return temp.next;
        }
        
        for(int i = 0; i <  (len-n-1); i++){
            temp = temp.next;
        }
        
        // Connecting the next node:
        if(temp != null && temp.next != null){
            temp.next = temp.next.next;
        }
        
        return head;
    }
    public int countLL(ListNode head){
        int count = 0;
        ListNode temp = head;
        
        while(temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }
}