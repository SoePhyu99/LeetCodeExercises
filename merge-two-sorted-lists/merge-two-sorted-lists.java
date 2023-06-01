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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        int[] arr = new int[size(list1) + size(list2)];
        System.out.println(arr.length);
        int index = 0;
        while(list1 != null){
            arr[index++] = list1.val;
            list1 = list1.next;
        }
        while(list2 != null){
            arr[index++] = list2.val;
            list2 = list2.next;
        }
        Arrays.sort(arr);
        for(int i : arr){
            insert(i);
        }
        return first;
    }
    private int size(ListNode list){
        int size = 0;
        while(list != null){
            size++;
            list = list.next;
        }
        return size;
    }

}