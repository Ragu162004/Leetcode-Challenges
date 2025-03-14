class Solution {
    public void reorderList(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode prev = null;
        ListNode curr = slow;
        ListNode next = null;
        while(curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        ListNode temp = head;
        while(prev.next != null) {
            ListNode temp1 = temp.next;
            ListNode temp2 = prev.next;
            temp.next = prev;
            prev.next = temp1;
            temp = temp1;
            prev = temp2;
        }
    }
}