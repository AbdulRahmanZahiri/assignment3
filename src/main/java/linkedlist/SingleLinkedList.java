package linkedlist;

// Class representing a singly linked list
public class SingleLinkedList {

    // Head and tail of the list, and a size counter
    private Node head;
    private Node tail;
    private int size;

    // Node class representing each element of the list
    private static class Node {
        int value;
        Node next;
    }

    // Creates a new single linked list with the first node
    public void createSingleLinkedList(int nodeValue) {
        Node node = new Node();
        node.value = nodeValue;
        node.next = null;
        head = node;
        tail = node;
        size = 1;
    }

    // Inserts a new node with the given value at the specified location
    public void insert(int value, int location) {
        Node node = new Node();
        node.value = value;

        // If the list doesn't exist, create it
        if (head == null) {
            createSingleLinkedList(value);
            return;
        }

        // Insert at the beginning
        if (location == 0) {
            node.next = head;
            head = node;

            // Insert at the end
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;

            // Insert in the middle
        } else {
            Node tempNode = head;
            int index = 0;

            // Traverse to the node before the desired position
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }

            // Insert the new node
            node.next = tempNode.next;
            tempNode.next = node;
        }

        size++;  // Increase the size of the list
    }

    // Deletes a node at the specified position
    public void delete(int position) {
        if (head == null) {
            System.out.println("List does not exist.");
            return;
        }

        if (position < 0 || position >= size) {
            System.out.println("Invalid position: " + position);
            return;
        }

        // Delete the head
        if (position == 0) {
            head = head.next;
            size--;

            // If list becomes empty, reset tail
            if (size == 0) {
                tail = null;
            }
        } else {
            Node tempNode = head;
            int index = 0;

            // Traverse to the node before the one to be deleted
            while (index < position - 1) {
                tempNode = tempNode.next;
                index++;
            }

            // Remove the node
            tempNode.next = tempNode.next.next;

            // Update tail if last node is removed
            if (position == size - 1) {
                tail = tempNode;
            }

            size--;
        }
    }

    // Prints the current elements of the list
    public void printList() {
        if (head == null) {
            System.out.println("List is empty.");
            return;
        }

        Node tempNode = head;

        // Traverse the list and print each node
        while (tempNode != null) {
            System.out.print(tempNode.value + " -> ");
            tempNode = tempNode.next;
        }

        System.out.println("null");
    }
}
