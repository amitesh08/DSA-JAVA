package com.amitesh;

public class LinkedListCycle {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ✅ 1. Check if loop exists (returns true/false)
    public static boolean hasCycle(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                return true;
            }
        }

        return false;
    }

    // ✅ 2. Return the node where the cycle begins (if exists), else null
    public static Node detectCycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                break;
            }
        }

        // Step 2: If no cycle found
        if (fast == null || fast.next == null) {
            return null;
        }

        // Step 3: Move fast to head, both move one step
        fast = head;
        while (fast != slow) {
            fast = fast.next;
            slow = slow.next;
        }

        return slow; // starting node of the loop
    }

    // 🔁 Helper: Create a loop in the list at position `pos` (1-based)
    public static void createLoop(Node head, int pos) {
        if (pos == 0) return;

        Node loopStart = head;
        for (int i = 1; i < pos; i++) {
            loopStart = loopStart.next;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = loopStart;
    }

    public static void main(String[] args) {
        // Create list: 1 -> 2 -> 3 -> 4 -> 5
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);

        // Create a loop at position 2 (1-based index), i.e., 5 → 2
        createLoop(head, 2);

        // ✅ Test: hasCycle
        System.out.println("Loop exists? " + hasCycle(head)); // true

        // ✅ Test: detectCycleStart
        Node loopNode = detectCycleStart(head);
        if (loopNode != null) {
            System.out.println("Loop starts at node with value: " + loopNode.data); // 2
        } else {
            System.out.println("No loop detected.");
        }
    }
}
