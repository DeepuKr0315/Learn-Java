// Problem link = https://leetcode.com/problems/reverse-linked-list-ii/description/

package Linked_List;

class ListNode{
    int val;
    ListNode next;
    ListNode(){};
    ListNode(int val){ this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }

}

public class Reverse_Linked_List_II {
    public static ListNode reverseBetween(ListNode head, int left, int right){
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        ListNode prevLeft = dummy;
        for(int i = 0; i < left - 1; i++){
            prevLeft = curr;
            curr = curr.next;
        }
        ListNode prev = null;
        for(int i = 0; i < right - left + 1; i++){
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        prevLeft.next.next = curr;
        prevLeft.next = prev;
        return dummy.next;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static  void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.print("Original list: ");
        printList(head);

        int left = 2, right = 4;
        ListNode result = reverseBetween(head, left, right);
        System.out.print("After reverse between(" + left + ", " + right + "): ");
        printList(result);
    }
}
