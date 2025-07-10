package com.amitesh;

public class DoublyLL {
    static class Node {
        int data;
        Node next;
        Node prev;

        Node (int val){
            this.data = val;
            this.next = null;
            this.prev = null;
        }
    }
    public static  void printForward(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        head.next = second;
        second.prev = head;

        second.next = third;
        third.prev = second;

        printForward(head);

    }

}
