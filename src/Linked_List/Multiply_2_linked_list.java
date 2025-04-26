package Linked_List;

public class Multiply_2_linked_list {
    public static long multiply(ListNode head1, ListNode head2){
        long num1 = 0;
        long num2 = 0;
        long mod = 1000000007;
        while(head1 != null){
            num1 = (num1 * 10 + head1.val) % mod;
            head1 = head1.next;
        }
        while(head2 != null){
            num2 = (num2 * 10 + head2.val) % mod;
            head2 = head2.next;
        }
        long ans = (num1 * num2) % mod;
        return ans;
    }
    public static void main(String[] args) {
        // First Linked List: 3 -> 4 -> 5
        ListNode head1 = new ListNode(3);
        head1.next = new ListNode(4);
        head1.next.next = new ListNode(5);

        // Second Linked List: 2 -> 1
        ListNode head2 = new ListNode(2);
        head2.next = new ListNode(1);

        // Print first linked list
        System.out.print("First Linked List: ");
        ListNode temp = head1;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        // Print second linked list
        System.out.print("Second Linked List: ");
        temp = head2;
        while(temp != null){
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");

        // Multiply and print the result
        long result = multiply(head1, head2);
        System.out.println("Multiplication Result: " + result);
    }

}
