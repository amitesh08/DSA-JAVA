package com.amitesh;

import java.util.ArrayList;

public class OddEvenLL {
    static class Node{
        int val;
        Node next;

        Node(int value){
            val = value;
        }
    }

    public static void printLL(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static Node oddEvenLLOptimised(Node head){

        if(head == null || head.next == null){
            return head;
        }

        Node odd = head;
        Node evenHead = head.next;
        Node even = head.next;

        while(even != null && even.next != null){
            odd.next = odd.next.next;
            even.next = even.next.next;

            odd = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
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

        head = oddEvenLLOptimised(head);
        printLL(head);
    }
}
