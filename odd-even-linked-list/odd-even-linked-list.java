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
    private void insert(int val){
        ListNode node = new ListNode(val);
        if(first == null){
            first = last = node;
        }else{
            last.next = node;
            last = last.next;
        }
    }
    public ListNode oddEvenList(ListNode head) {
        int size = 1;
        ListNode current = head;
        while(current!= null){
            if(size % 2 != 0){
                insert(current.val);
            }
            size++;
            current = current.next;
        }
        current = head;
        size = 1;
        while(current!= null){
            if(size % 2 == 0){
                insert(current.val);
            }
            size++;
            current = current.next;
        }
        return first;
    }
}