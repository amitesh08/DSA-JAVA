package com.amitesh;

public class RemoveNthNode {
    static  class Node{
        int data;
        Node next;

        Node(int val){
            data = val;
        }
    }
    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+ " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node removeNthFromEnd(Node head, int n){
        Node temp = head;

        if(n == 1 && head.next == null){
            return null;
        }
        int count = 1;

        while(temp.next != null){
            temp = temp.next;
            count++;
        }
        count = count - n;

        if (count == 0) return head.next;

        temp = head;
        for (int i = 1; i < count; i++) {
            temp = temp.next;
        }
        if(temp.next.next != null){
            temp.next = temp.next.next;
        }else {
            temp.next = null;
        }

        return head;
    }
    public static Node removeNthFromEndOptimised(Node head, int n){
        Node dummy = new Node(0);
        dummy.next = head;

        Node fast = dummy;
        Node slow = dummy;

        for (int i = 0; i <= n; i++) {
            fast = fast.next;
        }

        while(fast != null){
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        printLL(head);

//        head = removeNthFromEnd(head,2);

        head = removeNthFromEndOptimised(head, 2);
        printLL(head);
    }
}
