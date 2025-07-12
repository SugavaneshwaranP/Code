class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || k < 2) {
            return head;
        }
        ListNode last = null; // end of current modified list

        //first iteration outside while-loop for keeping the new head of the list
        ListNode output = reverseNextK(head, k);
        if (output == head) {
            return head;
        }
        last = head;
        
        while (true) {
            head = last.next;
            if (head == null) {
                return output;
            } else {
                last.next = reverseNextK(head, k);
                //there are x < k nodes lefted so it didnt succeed to reverse
                if (last.next == head) {
                    return output;
                }
                last = head;
            }
        }
    }

    //generally it reverses the next k node 
    public ListNode reverseNextK(ListNode head, int k) {
        ListNode currHead = head;
        for (int i = 0; i < k - 1; i++) {
            if (head.next != null) {
                ListNode temp = head.next;
                head.next = temp.next;
                temp.next = currHead;
                currHead = temp;
            } else {
                return reverseNextK(currHead, i + 1); //Reverses to its original state
            }
        }
        return currHead;
    }

}