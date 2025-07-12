package com.amitesh;

public class DelAtPos {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node (int val){
            this.data = val ;
            this.next= null;
            this.prev = null;
        }
    }
    public static void printList(Node head){
        Node temp = head ;
        while (temp != null){
            System.out.print(temp.data+ " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static Node insertAtEnd(Node head, int data){
        Node temp = head ;
        Node n = new Node(data);

        if(head == null){
            return head = n;
        }

        while (temp.next != null){
            temp = temp.next;
        }
        temp.next = n;
        n.prev = temp;

        return head;
    }
    public static Node deleteAtPos(Node head, int pos){
        if(pos == 1){
            if (head.next != null) { //remove null pointerException
                head.next.prev = null;
            }
            return head.next;
        }
        Node temp = head;
        for (int i = 1; i < pos ; i++) {
            temp = temp.next;
        }
        if(temp == null){
            return head;
        }
        if(temp.next == null){
            temp.prev.next = null;
            return head;
        }

        Node temp1 = temp.next;
        temp.prev.next = temp1;
        temp1.prev = temp.prev;

        return head;
    }

    public static void main(String[] args) {
        Node head = new Node(10);

//        head = insertAtEnd(head, 20);
//        head = insertAtEnd(head, 30);
//        head = insertAtEnd(head, 40);
//        head = insertAtEnd(head, 50);
        printList(head);

        head = deleteAtPos(head, 1);
        printList(head);
    }
}
