package com.amitesh;

public class LL {
    static class Node{
        int val;
        Node next;

        Node(int value){
            val = value;
        }
    }
    public static void printList(Node head){
        Node temp = head;

        while (temp.next != null){
            System.out.print(temp.val+ " -> ");
            temp = temp.next;
        }
            System.out.print("null");
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        System.out.println("linked list");
        printList(head);
    }
}
