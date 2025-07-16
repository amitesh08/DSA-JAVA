package com.amitesh;

public class DeleteMiddleNode {
    static class Node{
        int val;
        Node next;

        Node(int data){
            val = data;
        }
    }

    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.val+ " -> ");
            temp= temp.next;
        }
        System.out.println("null");
    }
    public static Node deleteMiddle(Node head){
        if(head == null || head.next == null){
            return null;
        }

        Node slow = head;
        Node fast = head;
        Node prev = null;

        while(fast != null && fast.next != null){
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = slow.next;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        head.next.next.next.next.next = new Node(6);

        printLL(head);

        head = deleteMiddle(head);
        printLL(head);
    }
}
