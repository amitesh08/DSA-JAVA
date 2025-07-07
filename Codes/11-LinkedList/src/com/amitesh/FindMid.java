package com.amitesh;

public class FindMid {
    static class Node{
        int val;
        Node next;

        Node (int value){
            val = value;
        }
    }
    public static void printLL (Node head){
        Node temp = head;

        while(temp.next != null){
            System.out.print(temp.val+" -> ");
            temp = temp.next;
        }
        System.out.println(temp.val+" -> "+"Null");

    }
    public static Node findMidUsingHead(Node head){
        //bruteforce
        Node temp = head;
        int count = 1;

        while(temp.next != null){
            count++;
            temp = temp.next;
        }
        int midIndex = count/2;
        Node mid = head;
        for (int i = 1; i <= midIndex; i++) {
            mid = mid.next;
        }
        return mid;
    }
    public static Node optimisedGetMid(Node head){
        //optimised approach to get the middle og the Linked list.
        Node slow = head;
        Node fast = head;

        //fro odd --> fast.next != null
        //for evn 1st mid --> fast.next.next != null
        //for evn 2nd mid --> fast != null or just take 1st mid code and return slow.next;
        while (fast != null && fast.next != null){ //always check fast != null bbefore fast.next!=null
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
//        head.next.next.next.next = new Node(50);

        printLL(head);
        System.out.println(findMidUsingHead(head).val);
        System.out.println(optimisedGetMid(head).val);
    }
}
