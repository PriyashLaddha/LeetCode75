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
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return head;

        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even; // Keep the start of even list

        while (even != null && even.next != null) {
            // Re-link odd nodes
            odd.next = even.next;
            odd = odd.next;

            // Re-link even nodes
            even.next = odd.next;
            even = even.next;
        }

        // Attach the even list to the end of the odd list
        odd.next = evenHead;

        return head;
    }
}
