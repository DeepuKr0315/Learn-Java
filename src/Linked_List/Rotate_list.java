package Linked_List;

public class Rotate_list {

    /*
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    */

    public static ListNode rotateList(ListNode head, int k){
        ListNode temp = head;
        int length = 1;
        while(temp.next != null){
            temp = temp.next;
            length++;
        }
        temp.next = head;
        k = k % length;
        ListNode newTail = head;
        for(int i = 1; i < length - k; i++){
            newTail = newTail.next;
        }
        ListNode newHead = newTail.next;
        newTail.next = null;
        return newHead;
    }
}
