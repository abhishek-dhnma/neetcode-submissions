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
    public ListNode reverseList(ListNode head) {

        // Edge Cases: Empty list or single-node list don't need any reversal logic.
        if(head == null ) return null;
        if(head.next == null) return head;

        // The Three-Pointer Strategy:
        // pre: Tracks the already reversed portion of the list behind us.
        // cur: The node we are actively manipulating right now.
        // nxt: A placeholder to look ahead so we don't lose the rest of the original list.
        ListNode pre = null;
        ListNode cur = head;
        ListNode nxt = null;

        while(cur != null){

            // 1. BOOKMARK THE FUTURE
            // Before changing cur.next, save the rest of the list. 
            // If we don't do this now, breaking cur.next means losing access to everything downstream!
            nxt = cur.next;

            // 2. REVERSE THE LINK
            // Disconnect cur from its original next node and point it backward to 'pre'.
            // On the very first iteration, this gracefully points the old head to null (the new tail).
            cur.next = pre;

            // 3. SHIFT THE WINDOW FORWARD
            // Move 'pre' one step forward to capture the node we just reversed.
            pre = cur;

            // Move 'cur' one step forward to the bookmarked next node so we can process it in the next loop.
            cur = nxt;
        }

        // When cur becomes null, we have crawled off the end of the original list.
        // 'pre' is left pointing at the very last node processed, which is now our brand-new head!
        return pre;
        
    }
}