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
var mergeNodes = function(head) {
    let d = new ListNode(-1);
    let ls = d;
    
    let temp = head;
    let sum = 0;
    while(temp){
        if(temp.val == 0 && temp != head){
            let newNode = new ListNode(sum);
            ls.next = newNode;
            ls = newNode;
            sum = 0;
        }
        else if(temp.val != 0){
            sum += temp.val;
        }
        temp = temp.next;
    }
    
    return d.next;
};