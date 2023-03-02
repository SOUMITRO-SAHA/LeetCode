/**
 * Definition for singly-linked list.
 * function ListNode(val) {
 *     this.val = val;
 *     this.next = null;
 * }
 */

/**
 * @param {ListNode} headA
 * @param {ListNode} headB
 * @return {ListNode}
 */
var getIntersectionNode = function(headA, headB) {
    let t1 = headA;
    let t2 = headB;
    while(t1 != t2){
        t1 = (t1 == null)?headB : t1.next;
        t2 = (t2 == null) ? headA: t2.next;
    }
    
    return t1;
};