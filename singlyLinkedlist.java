// Node class representing each element in the linked list
class Node {
    int data;   // Data stored in the node
    Node next;  // Reference to the next node in the list

    // Constructor to initialize a node with given data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList class to manage the linked list operations
class LinkedList {
    Node head;  // Head of the linked list

    // Constructor to initialize an empty linked list
    LinkedList() {
        this.head = null;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(int data) {
        Node newNode = new Node(data);  // Create a new node
        newNode.next = head;            // Point new node to current head
        head = newNode;                 // Make new node the new head
    }

    // Method to display the linked list
    public void display() {
        Node current = head;  // Start at the head of the list
        System.out.print("LinkedList: ");
        while (current != null) {
            System.out.print(current.data + " ");  // Print current node's data
            current = current.next;                // Move to next node
        }
        System.out.println();
    }
}

// Main class to test the LinkedList implementation
public class Main {
    public static void main(String[] args) {
        LinkedList myList = new LinkedList();

        // Insert some nodes at the beginning
        myList.insertAtBeginning(5);
        myList.insertAtBeginning(10);
        myList.insertAtBeginning(15);

        // Display the linked list
        myList.display();
    }
}
