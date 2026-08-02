
class Solution {
    public ListNode midfinder(ListNode head){
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    public ListNode merge(ListNode head1 , ListNode head2){
        ListNode merged = new ListNode(-1);
        ListNode temp = merged;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }
            else{
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }
        while(head1 != null){
            temp.next = head1;
            head1  = head1.next;
            temp = temp.next;
        }
        while(head2 != null){
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return merged.next;
}
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
        ListNode mid = midfinder(head);
        ListNode righthead = mid.next;
        mid.next = null;
        ListNode leftpart  = sortList(head);
        ListNode rightpart = sortList(righthead);
        return merge(leftpart , rightpart);
    }
}