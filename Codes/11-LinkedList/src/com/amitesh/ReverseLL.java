package com.amitesh;

public class ReverseLL {
    // Node class for singly linked list
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Print the list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Sample runner
    public static void main(String[] args) {
        // Creating the linked list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        System.out.println("Original list:");
        printList(head);

        // TODO: Call your reverse function here
         head = reverseList(head);

        System.out.println("Reversed list:");
        printList(head);
    }
    public static Node reverseList(Node head){
        Node previous = null;
        Node current = head;
        while(current != null){
            //reverse
            Node curr1 = current.next;
            current.next = previous;
            //prepare for next reverse
            previous = current;
            current = curr1;
        }
        head = previous;

        return head;
    }
}
