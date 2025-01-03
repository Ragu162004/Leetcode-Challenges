class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp1 = l1,temp2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int sum = 0,c = 0;
        while(temp1 != null || temp2 != null || c > 0) {
            int d1 =0 ,d2 = 0;
            if(temp1!=null) {
                d1 = temp1.val;
                temp1 = temp1.next;
            }else {
                d1 = 0;
            }
            if(temp2 != null) {
                d2 = temp2.val;
                temp2 = temp2.next; 
            }else {
                d2 = 0;
            }
            sum = d1 + d2 + c;
            current.next = new ListNode(sum % 10);
            current = current.next;
            c = sum /10; 
        } 
        return dummy.next;
    }
}