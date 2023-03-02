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
var deleteDuplicates = function(head) {
    let curr = head, prev = head;
    
    // Edge Case:
    if(curr == null)
        return null;
    while(curr){
        if(curr.val == prev.val)
            curr = curr.next;
        else{
            prev.next = curr;
            prev = curr;
        }
    }
    
    // For the last Case:
    if(prev != null){
        prev.next = curr;
    }
    
    // Return the Answer
    return head;
};