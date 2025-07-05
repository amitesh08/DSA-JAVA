package com.amitesh;

public class InsertAtIndex {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Sample: print list
        System.out.println("before insertion");
        printList(head);

        insertAtIndex(3,25,head);

        System.out.println("after insertion");
        printList(head);

        head = deleteHead(head);
        System.out.println("after deletion of head");
        printList(head);

        head = deleteLast(head);
        System.out.println("after deletion last");
        printList(head);

        insertAtLast(head, 40);
        insertAtLast(head, 50);
        insertAtLast(head, 60);

        System.out.println("before deletion At index");
        printList(head);
        head = deleteAtIndex(head,3);
        System.out.println("after deletion At index");
        printList(head);

    }

    // Example utility function: Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void insertAtIndex(int index, int value, Node head){
        Node n = new Node(value);
        Node temp = head;
        int count = 1;

        if(index == 1){
            n.next = head;
        }

        while(temp != null){
            if(count == index - 1){
                n.next = temp.next;
                temp.next = n;
            }
            temp = temp.next;
            count++;
        }
    }
    public static Node deleteHead(Node head){
        Node temp = head;
        head = head.next;
        return head;
    }
    public static Node deleteLast(Node head){
        Node temp = head;

        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        return head;
    }
    public static Node deleteAtIndex(Node head, int index){
        Node temp = head;

        if(index == 1) {
            if (head == null) return null;  // Empty list
            return head.next;  // Remove head
        }

        for (int i = 1; i < index-1; i++) {
            temp = temp.next;
        }

        // Check if next node exists
        if (temp.next == null) {
            return head; // Index out of bounds
        }

        temp.next = temp.next.next;
        return head;
    }
    public static void insertAtLast(Node head,int value){
        Node n = new Node(value);
        Node temp = head;

        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
        System.out.println("value inserted");
    }
}
