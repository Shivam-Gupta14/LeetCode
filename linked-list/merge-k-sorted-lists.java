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
    public ListNode merge(ListNode a , ListNode b){
        if( a== null){
            return b;
        }
        if(b == null){
            return a;
        }

        ListNode result;
        if(a.val <= b.val){
            result = a;
            result.next = merge(a.next , b);
        }
        else{
            result = b;
            result.next = merge(a , b.next);
        }
        return result;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists == null || lists.length == 0){
            return null;
        }
        int last = lists.length-1;
        while(last !=0){
            int i = 0;
            int j = last;
            while(i < j){
                lists[i] = merge(lists[i] , lists[j]);
                i++;
                j--;
                if(i >= j){
                    last = j;
                }
            }
        }
            return lists[0];
        
    }
}