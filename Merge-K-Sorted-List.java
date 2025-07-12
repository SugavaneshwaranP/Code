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
    public ListNode mergeKLists(ListNode[] lists) {
        List<Integer> list = new ArrayList<>();
        for(ListNode node : lists){
            while(node != null){
                list.add(node.val);
                node = node.next;
            }
        }
        Collections.sort(list);

        ListNode head = new ListNode(0);
        ListNode current = head;
        for(int num : list){
            current.next = new ListNode(num);
            current = current.next;
        }
        return head.next;
    }
}