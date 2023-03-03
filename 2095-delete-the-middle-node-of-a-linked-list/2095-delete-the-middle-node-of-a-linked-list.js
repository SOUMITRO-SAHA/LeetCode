/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {ListNode}
 */
var deleteMiddle = function(head) {
    let fast = head;
    let slow = head;
    let prev = null;
    
    // Edge Case:
    if(head.next == null)return null;
    
    while(fast && fast.next){
        fast = fast.next.next;
        prev = slow;
        slow = slow.next;
    }
    
    // connect prev.next to slow.next as slow is the middle node:
    prev.next = slow.next;
    
    return head;
};