package com.amitesh;

import java.util.Stack;

public class Add1ToLL {
    static class Node {
        int data;
        Node next;

        Node (int val){
            data = val;
        }
    }
    public static void printList(Node head){
        Node temp = head;

        while(temp!= null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node addOne(Node head) {
        if (head == null) {
            return new Node(1);
        }

        // Step 1: Reverse the list
        head = reverseList(head);

        // Step 2: Add one to the reversed list
        Node temp = head;
        int carry = 1;

        while (temp != null) {
            int sum = temp.data + carry;
            temp.data = sum % 10;
            carry = sum / 10;

            // If carry becomes 0, no further change needed
            if (carry == 0) break;

            // If this is the last node and carry is still left
            if (temp.next == null && carry > 0) {
                temp.next = new Node(carry);
                carry = 0;
                break;
            }

            temp = temp.next;
        }

        // Step 3: Reverse again to restore original order
        return reverseList(head);
    }
    public static Node reverseList(Node head){
        Node previous = null;
        Node current = head;
        while(current != null){
            //reverse
            Node curr1 = current.next;
            current.next = previous;
            //prepare for next reverse
            previous = current;
            current = curr1;
        }
        head = previous;

        return head;
    }


    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(9);
        head.next.next = new Node(9);
        head.next.next.next = new Node(3);

        printList(head);

        head = addOne(head);
        printList(head);
    }
}
