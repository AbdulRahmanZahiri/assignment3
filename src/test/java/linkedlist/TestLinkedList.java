package linkedlist;

public class TestLinkedList {
    public static void main(String[] args) {
        SingleLinkedList list = new SingleLinkedList();

        list.createSingleLinkedList(10);
        list.insert(20, 1);
        list.insert(30, 2);
        list.insert(40, 3);
        list.insert(50, 4);

        System.out.println("Original Linked List:");
        list.printList();

        System.out.println("\nDeleting at beginning (position 0):");
        list.delete(0);
        list.printList();

        System.out.println("\nDeleting at middle (position 1):");
        list.delete(1);
        list.printList();

        System.out.println("\nDeleting at end (position 2):");
        list.delete(2);
        list.printList();

        System.out.println("\nTrying invalid delete at position 10:");
        list.delete(10);
    }
}