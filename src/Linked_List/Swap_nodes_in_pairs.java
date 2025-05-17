package Linked_List;

public class Swap_nodes_in_pairs {
    public static ListNode SwapNodes(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode curr = dummy;
        while(curr.next != null && curr.next.next != null){
            ListNode first = curr.next;
            ListNode second = curr.next.next;
            first.next = second.next;
            second.next = first;
            curr.next = second;
            curr = first;
        }
        return dummy.next;
    }
}
