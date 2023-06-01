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
    public ListNode first;
    public ListNode last;
    public void insert(int val){
        ListNode node = new ListNode(val);
        if(first == null){
            first = last = node;
        }else{
            last.next = node;
            last = last.next;
        }
        System.out.println(last.val);
    }
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int result = (size(temp) / 2) + 1;
        while(temp != null){
            result--;
            if(result < 1){
                insert(temp.val);
            }
            temp = temp.next;
        }
        return first;
    }

    public int size(ListNode head){
        int size = 0;
        while(head != null){
            size++;
            head = head.next;
        }
        return size;
    }
}