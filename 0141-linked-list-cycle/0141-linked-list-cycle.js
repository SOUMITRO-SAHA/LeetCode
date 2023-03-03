/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} head
 * @return {boolean}
 */
var hasCycle = function(head) {
    let fast = head;
    let slow = head;
    
    // Edge Case:
    if(head == null || head.next == null)
        return false;
    
    // Iteration:
    while(fast && fast.next){
        fast = fast.next.next;
        slow = slow.next;
        
        // Checking the Condition:
        if(fast == slow){
            return true;
        }
    }
    return false;
};