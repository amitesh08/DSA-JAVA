package com.amitesh;

import java.util.Stack;

public class PalindromeLL {
    static class Node{
        int data;
        Node next;

        Node(int value){
            data = value;
        }
    }

    public static void printLL(Node head){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static boolean isPalindrome(Node head){
        Node temp = head;
        Stack<Integer> st = new Stack<>();

        while (temp != null){
            st.push(temp.data);
            temp = temp.next;
        }
        temp = head;

        while (temp != null && !st.empty()){
            if(st.peek() == temp.data){
                st.pop();
                temp = temp.next;
            }else {
                return false;
            }
        }
        return true ;
    }
    public static Node reverse(Node head){
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
    public static boolean isPalindromeOptimised(Node head){
        Node slow = head;
        Node fast = head;

        while (fast.next != null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;

        }
        Node newHead = reverse(slow.next);

        Node first = head;
        Node second = newHead;

        while(second != null){
            if(first.data != second.data){
                return false;
            }
            first = first.next;
            second = second.next;
        }
        reverse(newHead);
        return true;
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(20);
        head.next.next.next = new Node(10);

        printLL(head);
        System.out.println(isPalindrome(head));
        System.out.println(isPalindromeOptimised(head));
    }
}
