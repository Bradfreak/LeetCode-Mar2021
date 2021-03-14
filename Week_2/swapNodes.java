//Swapping Nodes in a Linked List
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
    public ListNode swapNodes(ListNode head, int k) {
        int count = 0;
        ListNode temp = head, temp1 = head;
        while(temp != null){
            count++;
            temp = temp.next;
            if(count < k){
                temp1 = temp1.next;
            }
        }
        temp = head;
        for(int i = 0; i < count-k; i++){
            temp = temp.next;
        }
        int t = temp.val;
        temp.val = temp1.val;
        temp1.val = t;
        return head;
    }
}
