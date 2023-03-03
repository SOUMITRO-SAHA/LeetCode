/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @param {number} x
 * @return {ListNode}
 */
var partition = function(head, x) {
    let temp = head;
    let d1 = new ListNode(-1);
    let d2 = new ListNode(-1);
    let l1 = d1;
    let l2 = d2;
    while(temp){
        if(temp.val < x){
            l1.next = temp;
            l1 = temp;
        }
        else{
            l2.next = temp;
            l2 = temp;
        }
        temp = temp.next;
    }
    
    // Assigning the l1 and l2 to null:
    if(l1 && l2){
        l1.next = null;
        l2.next = null;
    }
    
    // Connecting 2 LL:
    l1.next = d2.next;
    
    // Return the head node:
    return d1.next;
};