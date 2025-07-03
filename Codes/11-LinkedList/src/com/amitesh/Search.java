package com.amitesh;

public class Search {
    // LinkedList class with inner Node class
    static class LinkedList {
        // Inner Node class
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }

        Node head;

        // Insert a new node at the end
        public void insert(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }

        // Print the list
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        // GFG-style searchKey function
        static boolean searchKey(Node head, int key) {
            Node temp = head;
            while (temp != null) {
                if (temp.data == key) {
                    return true;
                }
                temp = temp.next;
            }
            return false;
        }
    }

    // Main method to test
    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        list.printList(); // Output: 10 -> 20 -> 30 -> 40 -> null

        int key = 30;
        boolean found = LinkedList.searchKey(list.head, key);
        System.out.println("Is key " + key + " present? " + found); // true

        key = 50;
        found = LinkedList.searchKey(list.head, key);
        System.out.println("Is key " + key + " present? " + found); // false
    }
}
