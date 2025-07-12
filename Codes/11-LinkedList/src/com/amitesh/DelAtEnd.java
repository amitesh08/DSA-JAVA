package com.amitesh;

public class DelAtEnd {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node(int val){
            this.data = val;
            this.next = null ;
            this.prev = null;
        }
    }

    public static void printList(Node head){
        Node temp = head;

        while (temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node deleteAtEnd(Node head){
        Node temp = head;

        if (head == null) return null;

        if(head.next == null){
            return null;
        }

        while (temp.next.next != null){
            temp = temp.next;
        }
        Node temp1 = temp.next;
        temp.next = null;
        temp1.prev = null;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;
        head.next.next.next = new Node(40);
        head.next.next.next.prev = head.next.next;

        printList(head);

        head = deleteAtEnd(head);
        printList(head);
    }
}
