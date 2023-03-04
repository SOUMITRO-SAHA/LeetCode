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
    public ListNode mergeNodes(ListNode head) {
        ListNode temp = head;
        int sum = 0;
        
        // Creating a dummy node:
        ListNode d = new ListNode(-1);
        ListNode ls = d;
        
        while(temp != null){
            if(temp.val == 0 && temp != head){
                ListNode node = new ListNode(sum);
                ls.next = node;
                ls = node;
                sum = 0;
            }
            else{
                sum += temp.val;
            }
            temp = temp.next;
        }
        
        // Returning the ans
        return d.next;
    }
}