package Linked_List;

public class Add_numbers {
    private static void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    static ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    static ListNode removeLeadingZeros(ListNode head){
        while(head != null && head.val == 0){
            head = head.next;
        }
        if(head == null) return new ListNode(0);
        return head;
    }

    public static void addNumber(ListNode head1, ListNode head2){
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        head1 = reverse(head1);
        head2 = reverse(head2);
        int carry = 0;
        while(head1 != null || head2 != null){
            int val1 = (head1 != null) ? head1.val : 0;
            int val2 = (head2 != null) ? head2.val : 0;

            int sum = val1 + val2 + carry;
            curr.next = new ListNode(sum % 10);
            carry = sum / 10;

            curr = curr.next;
            if(head1 != null) head1 = head1.next;
            if(head2 != null) head2 = head2.next;
        }
        if(carry > 0){
            curr.next = new ListNode(carry);
        }
        ListNode result = reverse(dummy.next);
        printList(removeLeadingZeros(result));
    }

    private static ListNode createList(int[] digits) {
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        for (int digit : digits) {
            curr.next = new ListNode(digit);
            curr = curr.next;
        }
        return dummy.next;
    }
    public static void main(String[] args) {
        Add_numbers obj = new Add_numbers();

        // Let's say we want to compute: 987 - 789 = 198
        // Represented as: [9 -> 8 -> 7] - [1 -> 7 -> 8 -> 9]
        ListNode l1 = createList(new int[]{9, 8, 7});
        obj.printList(l1);
        ListNode l2 = createList(new int[]{1, 7, 8, 9});
        obj.printList(l2);
        System.out.print("Result: ");
        obj.addNumber(l1, l2);  // Output should be: 1 -> 9 -> 8 -> null
    }
}
