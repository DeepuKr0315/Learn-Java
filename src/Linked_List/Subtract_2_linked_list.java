
// problem link = https://www.geeksforgeeks.org/problems/subtraction-in-linked-list/1
package Linked_List;

import java.util.List;

public class Subtract_2_linked_list {
    private void printList(ListNode head){
        while(head != null){
            System.out.print(head.val + " -> ");
            head = head.next;
        }
        System.out.println("null");
    }
    private ListNode reverse(ListNode head){
        ListNode prev = null;
        while(head != null){
            ListNode temp = head.next;
            head.next = prev;
            prev = head;
            head = temp;
        }
        return prev;
    }

    public static boolean isSmaller(ListNode head1, ListNode head2){
        ListNode temp1 = head1;
        ListNode temp2 = head2;
        int len1 = 0, len2 = 0;
        while(temp1 != null){
            temp1 = temp1.next;
            len1++;
        }
        while(temp2 != null){
            temp2 = temp2.next;
            len2++;
        }
        if(len1 > len2) return false;
        if(len1 < len2) return true;

        while(temp1 != null){
            if(temp1.val > temp2.val) return false;
            if(temp1.val < temp2.val) return true;
            temp2 = temp2.next;
            temp1 = temp1.next;
        }
        return false;
    }

    private void removeLeadingZeros(ListNode head){
        while(head != null && head.val == 0){
            head = head.next;
        }
        if(head == null){
            printList(new ListNode(0));
        }
        printList(head);
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

    public void subtractList(ListNode l1, ListNode l2){
        if(isSmaller(l1, l2)){
            ListNode temp = l1;
            l1 = l2;
            l2 = temp;
        }
        l1 = reverse(l1);
        l2 = reverse(l2);
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;
        int borrow = 0;
        while(l1 != null){
            int val1 = l1.val - borrow;
            int val2 = (l2 != null) ? l2.val : 0;
            if(val1 < val2){
                val1 += 10;
                borrow = 1;
            }else{
                borrow = 0;
            }
            curr.next = new ListNode(val1 - val2);
            curr = curr.next;
            l1 = l1.next;
            if(l2 != null) l2 = l2.next;
        }
        ListNode result = reverse(dummy.next);
        removeLeadingZeros(result);
    }

    public static void main(String[] args) {
        Subtract_2_linked_list obj = new Subtract_2_linked_list();

        // Let's say we want to compute: 987 - 789 = 198
        // Represented as: [9 -> 8 -> 7] - [1 -> 7 -> 8 -> 9]
        ListNode l1 = createList(new int[]{9, 8, 7});
        obj.printList(l1);
        ListNode l2 = createList(new int[]{1, 7, 8, 9});
        obj.printList(l2);
        System.out.print("Result: ");
        obj.subtractList(l1, l2);  // Output should be: 1 -> 9 -> 8 -> null
    }

}
