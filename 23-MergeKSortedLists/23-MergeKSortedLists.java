// Last updated: 7/21/2026, 12:54:25 AM
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
      PriorityQueue<ListNode> minHeap = new PriorityQueue<>((a, b) -> a.val - b.val);

        // Step 2: Saari lists ke head nodes ko heap mein daalo (agar null nahi hain)
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.add(head);
            }
        }

        // Step 3: Dummy head aur current pointer banai final list ke liye
        ListNode dummyHead = new ListNode(-1);
        ListNode current = dummyHead;

        // Step 4: Jab tak heap empty na ho jaaye
        while (!minHeap.isEmpty()) {
            // Step 5: Sabse chhota node heap se nikalo
            ListNode smallestNode = minHeap.poll();

            // Step 6: Usko final list mein jodo
            current.next = smallestNode;
            current = current.next; // Current ko aage badhao

            // Step 7: Agar us node ka next element hai, toh use wapas heap mein daalo
            if (smallestNode.next != null) {
                minHeap.add(smallestNode.next);
            }
        }

        // Step 8: Dummy ke next (actual head) ko return karo
        return dummyHead.next;
        
    }
}