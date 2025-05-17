package Linked_List;
class linkedList{
    private class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    private Node head;

    public void addAtHead(int data){
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        Node curr = head;
        while (curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }

    public Integer getNthNode(int position){
        Node curr = head;
        int count = 0;
        while(curr != null){
            if(count == position) return curr.data;
            curr = curr.next;
            count++;
        }
        return null;
    }

    public void deleteNthNode(int position){
        if(head == null) return;
        if(position == 0){
            head = head.next;
            return;
        }
        Node curr = head;
        for(int i = 0; curr != null && i < position - 1; i++){
            curr = curr.next;
        }
        if(curr == null || curr.next == null){
            return;
        }
        curr.next = curr.next.next;
    }

    public void printList() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

}
public class Linked_List {
    public static void main(String[] args) {
        linkedList list = new linkedList();

        list.addAtHead(3);
        list.addAtHead(2);
        list.addAtHead(1); // List: 1 -> 2 -> 3
        list.addAtEnd(4);
        list.addAtEnd(5); // List: 1 -> 2 -> 3 -> 4 -> 5
        System.out.print("Current List: ");
        list.printList();
        System.out.println("3rd Node (0-based): " + list.getNthNode(3)); // Should print 4
        list.deleteNthNode(2); // Remove the node at position 2 (value 3)
        System.out.print("After deleting 2nd node: ");
        list.printList();
    }
}
