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
    }
    private ListNode leftNode;
    private ListNode rightNode;
    public void insertLeft(int val){
        ListNode node = new ListNode(val);
        if(leftNode == null){
            leftNode = rightNode = node;
        }else{
            node.next = leftNode;
            leftNode = node;
        }
    }
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(left == right){
            return head;
        }
        int i = 1;
        ListNode temp = head;
        while(temp != null){
            if(i >= left && i<=right){
                insertLeft(temp.val);
            }
            i++;
            temp = temp.next;
        }
        i = 1;
        while(head != null){
            if(i >= left && i<=right){
                insert(leftNode.val);
                leftNode = leftNode.next;
            }
            else{
                insert(head.val);
            }
            i++;
            head = head.next;
        }
        return first;
    }
}