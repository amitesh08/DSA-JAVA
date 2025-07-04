package com.amitesh;

public class InsertAtIndex {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {
        // Create list: 10 -> 20 -> 30
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);

        // Sample: print list
        System.out.println("before insertion");
        printList(head);

        insertAtIndex(3,25,head);

        System.out.println("after insertion");
        printList(head);

        delNode(25,head);
        System.out.println("after deletion");
        printList(head);
    }

    // Example utility function: Print list
    public static void printList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public static void insertAtIndex(int index, int value, Node head){
        Node n = new Node(value);
        Node temp = head;
        int count = 1;

        if(index == 1){
            n.next = head;
        }

        while(temp != null){
            if(count == index - 1){
                n.next = temp.next;
                temp.next = n;
            }
            temp = temp.next;
            count++;
        }
    }

//     public static void delNode(int value, Node head){
//        //10->20->25->30->null
//        //del 25  10->20->30->null
//
//        // Case 1: If list is empty
//        if (head == null) return null ;
//        Node temp = head;
//
//        if(value == 1 ){
//            return head.next;
//        }
//        while(temp != null){
//            if(temp.next.data == value){
//                temp.next = temp.next.next;
//            }
//            if(temp.data == value){
//                temp.next = null;
//            }
//            temp = temp.next;
//        }
    }
}
