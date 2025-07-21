package com.amitesh;

import java.util.HashMap;

public class IntersectionofTwoLL {
    static class Node {
        int data;
        Node next;

        Node(int val){
            data = val;

        }
    }
    public static void printLL(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public Node getIntersectionNode(Node headA, Node headB) {
        Node temp = headA;
        HashMap<Node,Integer> map = new HashMap<>();

        while (temp!= null){
            map.put(temp,1);
            temp = temp.next;
        }
        temp = headB;
        while (temp!= null){
            if( map.containsKey(temp)){
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    //better than brute force
    public static Node getIntersectionNodeGood(Node headA, Node headB) {
        Node t1 = headA;
        int n1 = 0;
        Node t2 = headB;
        int n2 = 0;

        while(t1!=null){
            n1++;
            t1 = t1.next;
        }
        while(t2!=null){
            n2++;
            t2 = t2.next;
        }

        if(n1 < n2){
            return collisionPoint(headA,headB,n2-n1);
        }else{
            return collisionPoint(headB,headA,n1-n2);
        }
    }

    public static Node collisionPoint(Node t1, Node t2, int d) {

        while(d!=0){
            d--;
            t2 = t2.next;
        }

        while(t1 != t2){// if they don't have a intersection point they will meet at null.
            t1 = t1.next;
            t2 = t2.next;
        }
        return t1;
    }

    public static void main(String[] args) {
        Node head = new Node(2);
        head.next = new Node(4);
        head.next.next = new Node(2);
        head.next.next.next = new Node(1);

        printLL(head);

        Node headB = new Node(5);
        headB.next = new Node(4);
        headB.next.next = new Node(7);

        printLL(headB);
    }
}
