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
    public boolean hasCycle(ListNode head) {
        ListNode h = head;
        ListNode t = head;

        while(h!=null && h.next!=null){
            h = h.next.next;
            t = t.next;
            if(h==t){
                return true;
            }
        }
        return false;
    }
}
