package Linked_List;

public class Merge_Sort {
    private static ListNode merge(ListNode l1, ListNode l2){
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;
        while (l1 != null & l2 != null){
            if (l1.val < l2.val){
                cur.next = l1;
                l1 = l1.next;
            }else {
                cur.next = l2;
                l2 = l2.next;
            }
        }
        if (l1 != null){
            cur.next = l1;
        }
        if (l2 != null){
            cur.next = l2;
        }
        return dummy.next;
    }
    private static ListNode mergeSort(ListNode head){
        if (head == null || head.next == null){
            return head;
        }
        ListNode fast = head;
        ListNode slow = head;
        ListNode prev = new ListNode();
        while (fast != null & fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        ListNode left = mergeSort(head);
        ListNode right = mergeSort(slow);
        return merge(left, right);
    }
    public static void main(String[] args) {

    }
}
