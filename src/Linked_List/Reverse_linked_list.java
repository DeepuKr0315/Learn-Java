package Linked_List;

public class Reverse_linked_list {
    public static ListNode reversedLinkedList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr.next != null){
            ListNode tempNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = tempNext;
        }
        return prev;
    }
    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        System.out.print("Original list: ");
        printList(head);

        int left = 2, right = 4;
        ListNode result = reversedLinkedList(head);
        System.out.print("After reversing linked list: ");
        printList(result);
    }
}
