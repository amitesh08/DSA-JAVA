package com.amitesh;

public class AddTwoNumbers {
    static class Node {
        int data;
        Node next;

        Node (int val){
            data = val;
        }
    }
    public static void printLL(Node head){
        Node temp = head;

        while (temp!= null){
            System.out.print(temp.data+(" -> "));
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node addTwoNumbers(Node headA, Node headB){
        Node t1 = headA;
        Node t2 = headB;

        Node dummyNode = new Node(-1);

        Node curr = dummyNode;
        int carry = 0;

        while(t1!= null || t2!=null){
            int sum = carry;
            if (t1 != null) {
                sum += t1.data;
                t1 = t1.next;
            }

            if (t2 != null) {
                sum += t2.data;
                t2 = t2.next;
            }

            Node newNode =new Node(sum % 10);
            carry = sum/10;

            curr.next = newNode;
            curr = curr.next;
        }
        if(carry > 0){
            Node newNode = new Node(carry);
            curr.next = newNode;
        }
        return dummyNode.next;
    }
    public static void main(String[] args) {
        Node headA = new Node(3);
        headA.next = new Node(5);

        Node headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = new Node(9);
        headB.next.next.next = new Node(9);

        printLL(headA);
        printLL(headB);

        Node head = addTwoNumbers(headA, headB);
        printLL(head);
    }
}
