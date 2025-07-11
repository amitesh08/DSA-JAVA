package com.amitesh;

public class DelAtStartDLL {
    static class Node{
        int data;
        Node next ;
        Node prev;

        Node(int val){
            this.data = val;
            this.next = null;
            this.prev = null;
        }
    }
    public static void printList(Node head ){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.data+" <-> ");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static Node deleteAtStart(Node head){
        if(head ==null) return null;

        Node temp = head;
        head = temp.next;
        // Set prev of the new head
        if (head != null) {
            head.prev = null;
        }

        return head;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.prev = head;
        head.next.next = new Node(30);
        head.next.next.prev = head.next;

        printList(head);

        head = deleteAtStart(head);
        printList(head);
    }
}
