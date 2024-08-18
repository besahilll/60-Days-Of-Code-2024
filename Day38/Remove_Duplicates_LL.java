class Solution {
    // Function to remove duplicates from unsorted linked list.
    public Node removeDuplicates(Node head) {
        if (head == null) {
            return null;
        }

        HashSet<Integer> seen = new HashSet<>();
        Node current = head;
        Node previous = null;
        
        while (current != null) {
            if (seen.contains(current.data)) {
                previous.next = current.next;
            } else {
                seen.add(current.data);
                previous = current;
            }
            current = current.next;
        }
        
        return head;
    }
}
