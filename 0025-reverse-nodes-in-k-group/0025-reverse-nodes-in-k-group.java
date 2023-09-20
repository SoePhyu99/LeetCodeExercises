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
    private ListNode first, last;
    private ListNode reverseList;

    // length of ListNodes
    private int len(ListNode List){
        int i = 0;
        while(List != null){
            i++;
            List = List.next;
        }
        return i;
    }

    // reverseList
    private void addFirst(int node){
        ListNode newNode = new ListNode(node);
        if(reverseList == null){
            reverseList = newNode;
        }else{
            newNode.next = reverseList;
            reverseList = newNode;
        } 
    }

    // add to first and last nodes
    private void addLast(int node){
        ListNode newNode = new ListNode(node);
        if(first == null){
            first = last = newNode;
        }else{
            last.next = newNode;
            last = newNode;
        }
    }

    // add reverseList to nodes
    private void addToList(){
        while(reverseList != null){
            addLast(reverseList.val);
            reverseList = reverseList.next;
        }
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        int i = 0;
        int count = len(head) / k;
        while(head != null){
            i++;
            if(count > 0){
                addFirst(head.val); // reverted nodes
            }else{
                addLast(head.val); // left nodes
            }
            if(i == k){
                i = 0;
                addToList();
                count--;
            }
            head = head.next;
        }
        return first;
    }
}