/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode pointer1 = l1;
        ListNode pointer2 = l2;

        ListNode dummy = new ListNode(0);
        ListNode pointer3 = dummy;
        int carry = 0;

        while (pointer1 != null && pointer2 != null) {
            int a = pointer1.val;
            int b = pointer2.val;
            int c = a + b + carry;
            carry = c / 10;
            pointer3.next = new ListNode(c % 10);
            pointer3 = pointer3.next;

            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        while (pointer1 != null) {
            int val = pointer1.val;
            int c = val + carry;
            carry = c / 10;
            pointer3.next = new ListNode(c % 10);
            pointer3 = pointer3.next;
            pointer1 = pointer1.next;
        }

        while (pointer2 != null) {
            int val = pointer2.val;
            int c = val + carry;
            carry = c / 10;
            pointer3.next = new ListNode(c % 10);
            pointer3 = pointer3.next;
            pointer2 = pointer2.next;
        }

        if (carry > 0) {
            pointer3.next = new ListNode(carry);
        }

        return dummy.next;
    }
}