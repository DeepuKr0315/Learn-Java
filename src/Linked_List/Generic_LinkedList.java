package Linked_List;
import java.util.*;
public class Generic_LinkedList {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(15);
        list.addFirst(8);
        list.addLast(19);
        list.add(3, 17);        // adds at index 3
        System.out.println("Initial list: " + list);

        // Access elements
        System.out.println("First element: " + list.getFirst());
        System.out.println("Last element: " + list.getLast());
        System.out.println("Element at index 2: " + list.get(2));

        // Modify element
        list.set(2, 13);
        System.out.println("After setting index 2 to 13: " + list);

        //Remove elements
        list.removeFirst();
        list.removeLast();
        list.remove(1);
        System.out.println("After removals: " + list);

        // size and contains
        System.out.println("List size: " + list.size());
        System.out.println("List contains 99? " + list.contains(99));
        System.out.println("Is list empty? " + list.isEmpty());

        // clear list
        list.clear();
        System.out.println("After clearing: " + list);
    }
}