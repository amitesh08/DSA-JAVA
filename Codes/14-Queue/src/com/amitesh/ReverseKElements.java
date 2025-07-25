package com.amitesh;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseKElements {
    public static void main(String[] args) {
        //given a queue ,reverse its first k elements;
        //3, 10, 2, 12, 19, 6, 8, 10 ,14 --> 12, 2, 10, 3, 19, 6, 8, 10, 14
        Queue<Integer> queue = new LinkedList<>();
        queue.add(3);
        queue.add(10);
        queue.add(2);
        queue.add(12);
        queue.add(19);
        queue.add(6);
        queue.add(8);
        queue.add(10);
        queue.add(14);

        int k = 4;

        System.out.println("Original Queue: " + queue);
        Queue<Integer> updatedQueue = reverseKElements(queue, k);
        System.out.println("Queue after reversing first " + k + " elements: " + updatedQueue);
    }

    private static Queue<Integer> reverseKElements(Queue<Integer> queue, int k) {
        if (queue == null || k > queue.size() || k < 0) return queue;

        Stack<Integer> st = new Stack<>();

        for(int i = 0; i < k; i++){
            st.push(queue.peek());
            queue.remove();
        }

        while (!st.isEmpty()){
            queue.add(st.peek());
            st.pop();
        }

        int n = queue.size() - k;

        for (int i = 0; i < n; i++) {
            queue.add(queue.peek());
            queue.remove();
        }

        return queue;
    }
}
