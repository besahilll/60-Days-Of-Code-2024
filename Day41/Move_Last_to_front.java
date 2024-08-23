class Solution {
    public static Node moveToFront(Node head) {
         // If the list is empty or has only one element, return the head as is.
        if (head == null || head.next == null) {
            return head;
        }

        Node secondLast = null;
        Node last = head;

        while (last.next != null) {
            secondLast = last;
            last = last.next;
        }
        
        secondLast.next = null; // Remove the last node from its current position
        last.next = head;       // Point the last node to the previous head
        head = last;            // Update the head to the last node

        return head;
    }
}