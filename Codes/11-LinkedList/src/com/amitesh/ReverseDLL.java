package com.amitesh;

public class ReverseDLL {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            this.data = val;
            this.next = null;
            this.prev = null;
        }

    }
    public static void printList(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node insertAtLast(Node head,int data){
        Node temp = head ;
        Node n = new Node(data);

        if(head == null){
            return n;
        }

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;

        return head;
    }
    public static Node reverseDLL(Node head){
        Node current = head;
        Node temp = null;

        while (current != null){
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;

            current = current.prev;
        }
        if(temp != null){
            head = temp.prev;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);

        head = insertAtLast(head,20);
        head = insertAtLast(head,30);
        head = insertAtLast(head,40);
        head = insertAtLast(head,50);

        printList(head);
        head = reverseDLL(head);
        printList(head);
    }
}
