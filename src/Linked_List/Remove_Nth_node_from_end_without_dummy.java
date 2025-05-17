package Linked_List;

public class Remove_Nth_node_from_end_without_dummy {
    public static ListNode removeNthFromEnd(ListNode head, int n){
        ListNode left = head;
        ListNode curr = head;
        while(n > 0){
            curr = curr.next;
            n--;
        }
        if(curr == null){
            return head.next;
        }
        while(curr.next != null){
            curr = curr.next;
            left = left.next;
        }
        left.next = left.next.next;
        return head;
    }
    public static void printList(ListNode head){
        System.out.println("Linked list: ");
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

        //printing linked list
        printList(head);

        // Find and print the middle node
        ListNode node = removeNthFromEnd(head, 3);
        System.out.println("Linked list  after removing 3rd node from end: ");
        printList(node);
    }
}
