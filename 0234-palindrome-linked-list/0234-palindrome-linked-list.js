/**
 * Definition for singly-linked list.
 * function ListNode(val, next) {
 *     this.val = (val===undefined ? 0 : val)
 *     this.next = (next===undefined ? null : next)
 * }
 */
/**
 * @param {ListNode} head
 * @return {boolean}
 */
var isPalindrome = function(head) {
    if (head == null || head.next == null) {
        return true;
    }
    
    // Finding the Middle using two Pointers:
    let fast = head;
    let slow = head;
    
    while(fast && fast.next){
        fast = fast.next.next;
        slow = slow.next;
    }
    
    // Dividing the LL into Two Parts:
    let firstHalf = head;
    let secondHalf = reverseLL(slow);
    
    while(secondHalf){
        if(firstHalf.val != secondHalf.val)
            return false;
        
        // Next node:
        firstHalf = firstHalf.next;
        secondHalf = secondHalf.next;
    }
    return true;
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
}