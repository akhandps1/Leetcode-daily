// Last updated: 7/21/2026, 12:53:48 AM
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
    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;

    // Loop tab tak jab tak current aur next exist karte hain
        while (curr != null && curr.next != null) {
            if (curr.val == curr.next.val) {
                // Duplicate mila: Next node skip karo
                curr.next = curr.next.next;
            } else {
                // Different mila: Aage badho
                curr = curr.next;
            }
        }
        return head;
    }
}