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
    ListNode current;
    public ListNode reverseList(ListNode head) {
        while(head != null){
            ListNode node = new ListNode(head.val);
            if(current == null){
                current = node;
            }else{
                node.next = current;
                current = node;
            }
            head = head.next;
        }
        return current;
    }
}