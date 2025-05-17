package Tree;

class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
public class Linked_List_to_BST {
    public static TreeNode linkedListToBST(ListNode head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return new TreeNode(head.val);
        }
        ListNode slow = head;
        ListNode fast = head;
        ListNode mid = slow;
        while(fast != null && fast.next != null){
            mid = slow;
            fast = fast.next.next;
            slow = slow.next;
        }
        TreeNode node = new TreeNode(slow.val);
        mid.next = null;
        node.left = linkedListToBST(head);
        node.right = linkedListToBST(slow.next);
        return node;
    }
    public static void main(String[] args) {
        // Create linked list: [-10, -3, 0, 5, 9]
        ListNode head = new ListNode(-10,
                new ListNode(-3,
                        new ListNode(0,
                                new ListNode(5,
                                        new ListNode(9)))));

        TreeNode root = linkedListToBST(head);

        System.out.println(root); // Readable tree output
    }
}
