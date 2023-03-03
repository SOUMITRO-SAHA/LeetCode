/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {void} Do not return anything, modify head in-place instead.
 */
var reorderList = function(head) {
    let fast = head;
    let slow = head;
    
    // Finding the middle Node:
    while(fast && fast.next){
        fast = fast.next.next;
        slow = slow.next;
    }
    
    // Assigning two new LL:
    let t1 = head;
    let t2 = slow.next;
    
    // Making slow.next -> null.
    slow.next = null;
    
    t2 = reverseLL(t2);
    
    let d1 = new ListNode(-1);
    let l1 = d1;
    
    // Forming the LL:
    while(t1 && t2){
        l1.next = t1;
        l1 = t1;
        t1 = t1.next;
        
        l1.next = t2;
        l1 = t2;
        t2 = t2.next;
    }
    
    // If any LL left:
    if(t1){
        l1.next = t1;
    }
    if(t2){
        l1.next = t2;
    }
    
    return d1.next;
};

let reverseLL = (head) => {
    let curr = head;
    let prev = null;
    while(curr){
        let nextNode = curr.next;
        curr.next = prev;
        prev = curr;
        
        curr = nextNode;
    }
    
    return prev;
};