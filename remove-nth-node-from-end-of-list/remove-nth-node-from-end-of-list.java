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
    private ListNode first;
    private ListNode last;
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int x = size(head);
        for(int i = 0; i< x; i++ ){
            if(i != x - n){
                if(first == null){
                    first = last = new ListNode(head.val);
                }else{
                    last.next = new ListNode(head.val);
                    last = last.next;
                }
            }
            head = head.next;
        }
        return first;
    }
    private int size(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}