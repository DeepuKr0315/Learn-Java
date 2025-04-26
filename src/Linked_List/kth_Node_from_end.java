/*
Given the head of a linked list and the number k, Your task is to find the kth node from the end.
If k is more than the number of nodes, then the output should be -1.
*/

package Linked_List;

public class kth_Node_from_end {
    int getKthFromLast(ListNode head, int k){
        ListNode left = new ListNode(-1);
        left.next = head;
        ListNode right = head;
        while(k > 0 && right != null){
            right = right.next;
            k--;
        }
        if(k > 0){
            return -1;
        }
        while(right != null){
            right = right.next;
            left = left.next;
        }
        return left.next.val;
    }
}
