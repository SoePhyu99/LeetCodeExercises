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
    public void insert(int item){
        ListNode node = new ListNode(item);
        if(first == null){
            last = first = node;
        }else{
            last.next = node;
            last = last.next;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int v1 = 0;
        int v2 = 0;
        int v = 0;
        while(l1 != null || l2 != null || v >= 10){
            if(l1 == null && l2 !=null){
                v = 0 + l2.val;
                if(v >= 10){
                    insert(v % 10);
                    if(l2.next != null){
                        l2.next.val = l2.next.val + 1;
                    }else{
                        insert(1);
                        v = 0;
                    }
                }else{
                    insert(v);
                }
                l2 = l2.next;
            }else if(l2 == null && l1 != null){
                v = l1.val + 0;
                if(v >= 10){
                    insert(v % 10);
                    if(l1.next != null){
                        l1.next.val = l1.next.val + 1;
                    }else{
                        insert(1);
                        v = 0;
                    }
                }else{
                    insert(v);
                }
                l1 = l1.next;
            }else if(l1 == null && l2 == null && v >= 10){
                insert(1);
                v = 0;
            }
            else{
                v = l1.val + l2.val;
                if(v >= 10){
                    insert(v % 10);
                    if(l1.next != null){
                        l1.next.val = l1.next.val + 1;
                    }
                    else if(l2.next != null){
                        l2.next.val = l2.next.val + 1;
                    }
                }else{
                    insert(v);
                }
                l1 = l1.next;
                l2 = l2.next;
            }
        }
        return first;
    }
}