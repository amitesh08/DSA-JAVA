package com.amitesh;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //initialize the queue
        Queue<Integer> q = new LinkedList<>();

        //FIFO - First In First Out
        //operations
        q.add(12); //insert at end of the queue.

        q.remove(); //remove from the front

        q.peek(); //get the front element

        q.size(); //no. of elements
    }
}