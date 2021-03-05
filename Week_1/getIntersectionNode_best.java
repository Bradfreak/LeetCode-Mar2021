//Intersection of Two Linked Lists
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if(headA == null || headB == null){
            return null;
        }
        int lenA = 0, lenB = 0;
        ListNode pt1 = headA, pt2 = headB;
        while(pt1.next != null){
            pt1 = pt1.next;
            lenA++;
        }
        while(pt2.next != null){
            pt2 = pt2.next;
            lenB++;
        }
        int diff;
        if(lenA > lenB){
            diff = lenA - lenB;
            while(diff > 0){
                headA = headA.next;
                diff--;
            }
        }
        else if(lenB > lenA){
            diff = lenB - lenA;
            while(diff > 0){
                headB = headB.next;
                diff--;
            }
        }
        while(headA != headB){
            headA = headA.next;
            headB = headB.next;
        }
        return headA;
    }
}
