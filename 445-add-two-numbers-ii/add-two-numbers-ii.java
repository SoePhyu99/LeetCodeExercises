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
    private void addFirst(int num){
        var node = new ListNode(num);
        if(first == null){
            first = node;
        }else{
            node.next = first;
            first = node;
        }
    }

    private ListNode current;
    private void addLast(int num){
        var node = new ListNode(num);
        if(current == null){
            current = node;
        }else{
            node.next = current;
            current = node;
        }
    }
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        var len1 = len(l1);
        var len2 = len(l2);
        ListNode start = len1 > len2 ? l1 : l2;
        ListNode end = len1 > len2 ? l2: l1;
        var lenStart = len(start);
        var lenEnd = len(end);
        var result = 0;
        var m = 1;
        while(start != null){
            if(lenStart == lenEnd){
                addLast(start.val + end.val);
                end = end.next;
                lenEnd--;
            }else{
                addLast(start.val);
            }
            lenStart--;
            start = start.next;
        }
        while(current != null){
            if(current.val > 9){
                addFirst(current.val % 10);
                if(current.next != null){
                    current.next.val += 1;
                }else{
                    addFirst(1);
                }
            }else{
                addFirst(current.val);
            }
            current = current.next;
        }
        return first;
    }
    private int len(ListNode l){
        int result = 0;
        while(l.next != null){
            result++;
            l = l.next;
        }
        return result;
    }
}