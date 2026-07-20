// Last updated: 7/21/2026, 12:51:53 AM
/*
// Definition for a Node.
class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;
};
*/

class Solution {
    public Node flatten(Node head) {
        if (head == null) return head;
        
        Node curr = head;
        while (curr != null) {
            // If there's no child, just move on
            if (curr.child == null) {
                curr = curr.next;
                continue;
            }
            
            // 1. Find the tail of the child list
            Node temp = curr.child;
            while (temp.next != null) {
                temp = temp.next;
            }
            
            // 2. Connect child tail to curr.next
            temp.next = curr.next;
            if (curr.next != null) {
                curr.next.prev = temp;
            }
            
            // 3. Connect curr to curr.child
            curr.next = curr.child;
            curr.child.prev = curr;
            
            // 4. Clean up the child pointer
            curr.child = null;
            
            // 5. Move to the next node
            curr = curr.next;
        }
        return head;
    }
}
