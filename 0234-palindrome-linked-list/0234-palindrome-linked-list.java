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
    public boolean isPalindrome(ListNode head) {
        // Two Cases:
        // Odd Length Case:
        // Even Length Case:
        
        // Edge Case:
        if(head.next == null){
            return true;
        }
        
        // Getting the Length of the LL:
        int len = getLength(head);
        
        if(len == 2){
            if(head.val != head.next.val)
                return false;
            return true;
        }
        
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = null;
        
        // Finding the middle node:
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            prev = slow;
            slow = slow.next;
        }
        
        if(len % 2 == 0){
            // Even Case:
            if(prev != null){
                prev.next = null;
            }
            
            ListNode firstLL = head;
            ListNode secondLL = reverseLL(slow);
            
            // Check for palindrome:
            return isPalindrome(firstLL, secondLL);
        }
        // Odd Case:
        if(prev != null){
            prev.next = null;
        }
        ListNode firstLL = head;
        ListNode middleNode = slow;
        ListNode secondLL = reverseLL(slow.next);

        // Check for palindrome:
        return isPalindrome(firstLL, secondLL);
    }
    public boolean isPalindrome(ListNode h1, ListNode h2){
        ListNode t1 = h1;
        ListNode t2 = h2;
        while(t1 != null && t2 != null){
            if(t1.val != t2.val){
                return false;
            }
            t1 = t1.next;
            t2 = t2.next;
        }
        return true;
    }
    public int getLength(ListNode head){
        int c = 0;
        ListNode temp = head;
        while(temp != null){
            c++;
            temp = temp.next;
        }
        return c;
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