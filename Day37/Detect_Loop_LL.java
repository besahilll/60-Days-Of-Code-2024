class Solution {
    // Function to check if the linked list has a loop
    public static boolean detectLoop(Node head) {
        if (head == null) {
            return false;
        }
        
        Node slow = head;
        Node fast = head;
        
        while (fast != null && fast.next != null) {
            slow = slow.next;           // Move slow pointer by 1
            fast = fast.next.next;     // Move fast pointer by 2
            
            if (slow == fast) {         // Cycle detected
                return true;
            }
        }
        
        return false; 
    }
}