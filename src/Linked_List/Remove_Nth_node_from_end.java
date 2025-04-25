package Linked_List;

public class Remove_Nth_node_from_end {
    public static ListNode removeNthNodeFromEnd(ListNode head, int n){
        ListNode dummy = new ListNode(0, head);
        ListNode left = dummy;
        ListNode right = head;
        while(n > 0 && right != null){
            right = right.next;
            n--;
        }
        while(right != null){
            right = right.next;
            left = left.next;
        }
        left.next = left.next.next;
        return dummy.next;
    }

    public static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        // Create individual nodes
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);

        // Link the nodes together: 1 -> 2 -> 3 -> 4 -> 5 -> 6
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;

        // Head of the linked list
        ListNode head = node1;

        // Find and print the middle node
        ListNode node = removeNthNodeFromEnd(head, 3);
        System.out.println("Linked list  after removing 3rd node from end: ");
        printList(node);
    }
}
