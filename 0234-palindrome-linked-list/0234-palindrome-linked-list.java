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
    public ListNode reverse(ListNode head) {
       ListNode prev = null;
       ListNode curr = head;
       ListNode next = null;

       while(curr!=null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
       } 
       return prev;

    }
    public boolean isPalindrome(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        ListNode aftermid = reverse(slow.next);
        while(aftermid!=null){
            if(head.val!=aftermid.val)return false;
            head = head.next;
            aftermid = aftermid.next;
        }
        return true;
    }
}