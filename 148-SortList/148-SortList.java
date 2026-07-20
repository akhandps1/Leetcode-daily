// Last updated: 7/21/2026, 12:53:06 AM
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
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
        return head;
        ListNode mid=getMiddle(head);
        ListNode left=head;
        ListNode right=mid.next;
        mid.next=null;

        left=sortList(left);
        right=sortList(right);

        return merge(left,right);
    }

    private ListNode getMiddle(ListNode head){
        ListNode slow=head;
        ListNode fast=head.next;
        
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }

    private ListNode merge(ListNode l1,ListNode l2){
        ListNode dummy=new ListNode(0);
        ListNode curr=dummy;

        while(l1!=null && l2!=null){
            if(l1.val<l2.val){
                curr.next=l1;
                l1=l1.next;
            }else{
                curr.next=l2;
                l2=l2.next;
            }
            curr=curr.next;
        }
        if(l1!=null) curr.next=l1;
        if(l2!=null) curr.next=l2;
        return dummy.next;
    }
}