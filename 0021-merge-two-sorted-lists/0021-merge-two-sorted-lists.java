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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode last,head;
        ListNode t1 = list1;
        ListNode t2 = list2;
        
        // Edge Case:
        if(t1 == null && t2 == null)
            return t1;
            
        if(t1 == null && t2 != null)
            return t2;
        if(t2 == null && t1 != null)
            return t1;
        
        // Getting the First Smallest Node:
        if(t1.val <= t2.val){
            head = t1;
            last = t1;
            t1 = t1.next;
        }
        else{
            head = t2;
            last = t2;
            t2 = t2.next;
        }
        
        // Checking the Nodes:
        while(t1 != null && t2 != null){
            if(t1.val <= t2.val){
                last.next = t1;
                last = t1;
                t1 = t1.next;
            }
            else{
                last.next = t2;
                last = t2;
                t2 = t2.next;
            }
        }
        
        // If any LL left:
        if(t1 != null){
            last.next = t1;
        }
        else if(t2 != null){
            last.next = t2;
        }
        
        return head;
    }
}