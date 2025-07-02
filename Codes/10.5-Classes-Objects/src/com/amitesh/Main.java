package com.amitesh;



public class Main {
//   public static class Pair{
//        int x;
//        int y;
//

        //constructor --> makes your life easy, written to be in class, same as class name bt function.
//        Pair(int v1, int v2){
//            x=v1;
//            y=v2;
//        }
//        Pair(int x1){ // we can create many constructor but should be of different input.
//            x=x1;
//        }
//        Pair(){ // we can create many constructor but should be of different input.
//
//        }
//    }
//    public static class House{
//        int roomCount;
//        int floor;
//        int area;
//        String color;
//        boolean pool;
//    }

//nested class is nothing but linkedList
public static class Node{
    int val;
    Node next;

    Node(int v1){
        val = v1;
    }

}

    public static void main(String[] args) {
//        Pair p1 = new Pair();
//        p1.x = 10;
//        System.out.println(p1.x);

//        House alina = new House();
//        alina.roomCount = 4;
//        alina.floor = 2;
//        alina.area = 200;
//        alina.color = "blue";
//        alina.pool = true;

        //similarly you can create many objects with one class
        //rahul, ram - we can create multiple objects.
        //rahul = new House()

    //constructor
//        Pair p1 = new Pair(10,20);
//        System.out.println(p1.x+" "+p1.y);
//
//        Pair p2 = new Pair(20);//second constructor will run
//        System.out.println(p2.x);
//

        //
        Node n1 = new Node(10);


        Node n2 = new Node(20);

        n1.next = n2; //linking the node
        System.out.println(n1.next.val);
    }

}