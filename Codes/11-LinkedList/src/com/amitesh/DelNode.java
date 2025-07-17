package com.amitesh;

public class DelNode {
    static class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
        }
    }
    public static void printLL(Node head){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void deleteNode(Node n){
        Node prev = null;

        while(n!= null && n.next != null){
            n.data = n.next.data;

            prev = n;

            n = n.next;
        }
        prev.next = null;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(2);
        head.next.next.next = new Node(3);
        printLL(head);

        deleteNode(head.next);
        printLL(head);

    }
}
