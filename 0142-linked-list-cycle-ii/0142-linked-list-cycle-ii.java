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
        ListNode slow = head;
        ListNode fast = head;

        while(fast !=null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;

            if(slow == fast){ //we found the cycle;
                break;
            }
        }
        if(slow != fast){
            return null;
        } else if(head == null || head.next == null){
            return null;
        } else{
            slow = head;
            while(slow != fast){
                slow = slow.next;
                fast = fast.next;
            }
        }
        return slow;
    }
}