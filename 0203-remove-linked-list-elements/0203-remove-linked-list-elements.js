/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} val
 * @return {ListNode}
 */
var removeElements = function(head, val) {
    let d = new ListNode(-1);
    let ls = d;
    
    let temp = head;
    while(temp){
        if(temp.val != val){
            ls.next = temp;
            ls = temp;
        }
        temp = temp.next;
    }
    
    // Assigning the Last node to null
    if(ls != null)
        ls.next = null;
    
    // Return the Head:
    return d.next;
};