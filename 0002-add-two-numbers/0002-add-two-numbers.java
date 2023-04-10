class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;

        ListNode d = new ListNode(-1);
        ListNode ls = d;
        int carry = 0;
        while(t1 != null && t2 != null){
            int sum =carry + (t1.val + t2.val);

            ListNode node = new ListNode(sum%10);
            carry = sum/10;

            ls.next = node;
            ls = node;

            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1 != null){
            int num = carry + t1.val%10;
            carry = num/10;

            ListNode node = new ListNode(num%10);

            ls.next = node;
            ls = node;

            t1 = t1.next;
        }
        while(t2 != null){
            int num = carry + t2.val%10;
            carry = num/10;

            ListNode node = new ListNode(num%10);

            ls.next = node;
            ls = node;

            t2 = t2.next;
        }
        // Edge Case:
        if(carry != 0){
            ListNode node = new ListNode(carry);
            ls.next = node;
        }

        return d.next;
    }
}