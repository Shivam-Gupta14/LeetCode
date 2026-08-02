
class Solution {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0,head);
        ListNode curr = head;
        ListNode prev = dummy;
        dummy.next = head;
        while(curr != null){
            if(curr.val == val){
                prev.next = curr.next;
            }
            else{
                prev = curr;
            }
            curr = curr.next;
            
        }
        return dummy.next;
    }
}