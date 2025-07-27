package com.amitesh;
import java.util.Stack;

public class MyQueue {
    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    // Constructor
    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    // Add element to the end of the queue
    public void push(int x) {
        inputStack.push(x);
    }

    // Remove the element from the front of the queue
    public int pop() {
        peek(); // ensure outputStack has the front element
        return outputStack.pop();
    }

    // Get the front element
    public int peek() {
        if (outputStack.isEmpty()) {
            while (!inputStack.isEmpty()) {
                outputStack.push(inputStack.pop());
            }
        }
        return outputStack.peek();
    }

    // Return whether the queue is empty
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }

    // Main method to test
    public static void main(String[] args) {
        MyQueue queue = new MyQueue();
        queue.push(10);
        queue.push(20);
        queue.push(30);

        System.out.println(queue.peek());  // Output: 10
        System.out.println(queue.pop());   // Output: 10
        System.out.println(queue.peek());  // Output: 20
        System.out.println(queue.empty()); // Output: false
    }
}
