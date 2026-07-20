// Last updated: 7/21/2026, 12:53:07 AM
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
    public ListNode insertionSortList(ListNode head) {
      ListNode dummy = new ListNode(Integer.MIN_VALUE);
        
        // Step 2: 'current' pointer original list ko traverse karega.
        ListNode current = head;
        
        // Step 3: Har node ko original list se process karo.
        while (current != null) {
            
            // Step 4: Agle node ko pehle hi save karlo.
            ListNode nextToProcess = current.next;
            
            // Step 5: 'prev' pointer sorted list (dummy se) mein insertion point dhoondhega.
            ListNode prev = dummy;
            
            // Step 6: Sahi jagah dhoondo.
            // Jab tak prev.next chhota hai current.val se, aage badho.
            while (prev.next != null && prev.next.val < current.val) {
                prev = prev.next;
            }
            
            // Step 7: 'current' node ko 'prev' aur 'prev.next' ke beech insert karo.
            current.next = prev.next;
            prev.next = current;
            
            // Step 8: Original list ke agle node par jaao.
            current = nextToProcess;
        }
        
        // Step 9: Dummy ke agle node (jo actual sorted head hai) ko return karo.
        return dummy.next;
        
    }
}