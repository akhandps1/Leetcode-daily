// Last updated: 7/21/2026, 12:53:14 AM
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> visited = new HashSet<>();
        ListNode temp = head;

        while (temp != null) {
            if (visited.contains(temp)) {
                return temp; // First repeated node
            }
            visited.add(temp);
            temp = temp.next;
        }
        return null; // No cycle
    }
}