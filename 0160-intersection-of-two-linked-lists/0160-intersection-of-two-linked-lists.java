/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        int LengthA = 0;
        while(tempA!=null){
            LengthA++;
            tempA=tempA.next;
        }
        int LengthB = 0;
        while(tempB!=null){
            LengthB++;
            tempB=tempB.next;
        }
        tempA = headA;
        tempB = headB;
        if(LengthA>LengthB){
            int step = LengthA-LengthB;
            for(int i=1;i<=step;i++){
                tempA = tempA.next;
            }
        }
            else{
                int step = LengthB-LengthA;
            for(int i=1;i<=step;i++){
                tempB = tempB.next;
            } 
        }
        while(tempA!=tempB){
            tempA = tempA.next;
            tempB = tempB.next;
        }
        return tempA;
    }
}