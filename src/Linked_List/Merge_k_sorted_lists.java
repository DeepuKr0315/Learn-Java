package Linked_List;

import java.util.List;

public class Merge_k_sorted_lists {
    public static ListNode mergeKLists(ListNode[] lists){
        if(lists == null || lists.length == 0) return null;
        int interval = 1;
        for(int i = 0; i + interval < lists.length; i = i + interval * 2){
            lists[i] = mergeTwoList(lists[i] , lists[i + interval]);
            interval = interval * 2;
        }
        return lists[0];
    }

    public static ListNode mergeTwoList(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(head1 != null && head2 != null){
            if(head1.val <= head2.val){
                curr.next = head1;
                head1 = head1.next;
            }else{
                curr.next = head2;
                head2 = head2.next;
            }
            curr = curr.next;
        }
        if(head1 != null){
            curr.next = head1;
        }
        if(head2 != null){
            curr.next = head2;
        }
        return dummy.next;
    }
}
