package com.amitesh;

public class InsertEndDLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int value){
            this.data = value;
            this.next = null;
            this.prev = null;
        }
    }
    public static void printList(Node head){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data+ " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node insertAtEnd(Node head, int data){
        Node temp = head ;
        Node n = new Node(data);

        if(head == null){
            return head = n;
        }

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);

        printList(head);

        head = insertAtEnd(head, 20);
        head = insertAtEnd(head, 30);
        printList(head);
    }
}
