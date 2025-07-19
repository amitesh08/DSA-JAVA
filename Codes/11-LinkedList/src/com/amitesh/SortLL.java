package com.amitesh;


public class SortLL {
    static class Node{
        int data;
        Node next;

        Node (int val){
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
    //selection sort -> not optimal for , taking o(n^2)
    public static Node sortList(Node head){
        if(head == null){
            return null;
        }
        if(head.next == null){
            return head;
        }

        Node current = head;


        while(current != null){
            Node index = current.next ;
            Node min = current;

            while(index != null){
                if(index.data < min.data){
                    min = index;
                }
                index = index.next;
            }
            int temp = current.data;
            current.data = min.data;
            min.data  = temp;

            current = current.next;
        }
        return head;
    }
    public static Node sortListOptimal(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        // Step 1: Split the list into two halves
        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;

        // Step 2: Recursively sort both halves
        Node left = sortListOptimal(head);
        Node right = sortListOptimal(rightHead);

        // Step 3: Merge the sorted halves
        return merge(left, right);
    }

    // Helper to find the middle node
    private static Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Helper to merge two sorted lists
    private static Node merge(Node list1, Node list2) {
        Node dummy = new Node(0);
        Node tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.data <= list2.data) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) tail.next = list1;
        else tail.next = list2;

        return dummy.next;
    }
    public static void main(String[] args) {
        Node head = new Node(4);
        head.next = new Node(2);
        head.next.next = new Node(1);
        head.next.next.next = new Node(3);

        printLL(head);

        head = sortListOptimal(head);
        printLL(head);
    }
}
