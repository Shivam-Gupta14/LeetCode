
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode temp = head;
        int len = 0;
        while(temp!= null){
            temp = temp.next;
            len++;
        }
        for(int i = 1; i < k; i++){
            first = first.next;
        }
        for(int i = 1;i < len-k+1;i++){
            second = second.next;
        }
        int tem = first.val;
        first.val = second.val;
        second.val = tem;
        
        return head;
    }
}