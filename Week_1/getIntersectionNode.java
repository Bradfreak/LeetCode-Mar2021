//Intersection of Two Linked Lists
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
        HashSet<ListNode> st = new HashSet<ListNode>();
        while(headA != null){
            st.add(headA);
            headA = headA.next;
        }
        while(headB != null){
            if(st.contains(headB)){
                return headB;
            }
            headB = headB.next;
        }
        return headB;
    }
}
