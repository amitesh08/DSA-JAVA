package com.amitesh;

public class InsertAtPos {
    static class Node{
        int data;
        Node next;
        Node prev;

        Node(int val){
            this.data = val;
            this.next = null;
            this.prev = null;
        }
        public static void printList(Node head){
            Node temp = head ;
            while (temp != null){
                System.out.print(temp.data+ " <-> ");
                temp = temp.next;
            }
            System.out.println("null");
        }

        public static Node insertAtPos(Node head, int data, int pos){
            Node temp = head;
            Node n = new Node(data);
            if(head == null){
                return head = n;
            }

            for(int i =0; i<pos; i++){
                temp = temp.next;
            }
            if(temp == null){
                return null;
            }
            Node temp1 = temp.next;
            temp.next = n;
            n.prev = temp;
            n.next = temp1;
            if(temp1!=null){
                temp1.prev = n;
            }

            return head;
        }
        public static void main(String[] args) {
            Node head = new Node(10);

            printList(head);
            insertAtPos(head,20,0);
            printList(head);
            insertAtPos(head,15,0);
            printList(head);
        }

    }
}
