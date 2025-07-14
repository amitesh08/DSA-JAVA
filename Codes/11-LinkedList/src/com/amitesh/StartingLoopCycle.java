package com.amitesh;

public class StartingLoopCycle {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // ✅ 2. Return the node where the cycle begins (if exists), else null
    public static Node detectCycleStart(Node head) {
        Node slow = head;
        Node fast = head;

        // Step 1: Detect if a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            //slow and fast meets , means it has a loop cycle.
            if(slow == fast){
                //then move one pointer to head and now move both pointer
                //by one if they meet again that is your starting point.
                slow = head;
                while (slow != fast){
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        //if LL doesn't have a cycle.
            return null;
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

        // ✅ Test: detectCycleStart
        Node loopNode = detectCycleStart(head);
        System.out.println(loopNode != null ? "starting point: "+loopNode.data : "no starting point.");
    }
}

