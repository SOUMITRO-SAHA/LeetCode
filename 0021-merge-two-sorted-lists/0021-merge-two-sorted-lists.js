/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} list1
 * @param {ListNode} list2
 * @return {ListNode}
 */
var mergeTwoLists = function(list1, list2) {
    let head, last, t1, t2;
    t1 = list1;
    t2 = list2;
    
    // Edge Case:
    if(t1 == null && t2 == null)
        return t1;
    if(t1 == null && t2 != null)return t2;
    if(t2 == null && t1 != null)return t1;
    
    // Checking for the smallest Node:
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
    
    // Merging the LL:
    while(t1 && t2){
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
    
    // Checking if any LL is left:
    if(t1) last.next = t1;
    else if(t2) last.next = t2;
    
    return head;
};