package Linked_List;

public class Find_middle {
    public static ListNode middleNode(ListNode head){
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
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
        ListNode middle = middleNode(head);
        System.out.println("Middle node value: " + middle.val);
    }
}
