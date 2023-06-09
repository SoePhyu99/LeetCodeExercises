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
    private ListNode temp;
    private ListNode tempEnd;
    private void insert(int val){
        ListNode node = new ListNode(val);
        if(first == null){
            first = last = node;
        }else{
            last.next = node;
            last = last.next;
        }
    }
    public ListNode rotateRight(ListNode head, int k) {
        
        int size = size(head);
        if(size <= 1 || k == 0){
            return head;
        }
        if(k > size){
            k = k - size;
            while(k > size){
                k = k - size;
            }
        }
        int index = size(head) - k;
        while(head != null){
            insert(head.val);
            head = head.next;
        }
        last.next = first;
        while(index > 0){
            first = first.next;
            index--;
        }
        while(index < size){
            if(temp == null){
                temp = tempEnd = new ListNode(first.val);
            }else{
                tempEnd.next = new ListNode(first.val);
                tempEnd = tempEnd.next;
            }
            first = first.next;
            index++;
        }
        return temp;
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