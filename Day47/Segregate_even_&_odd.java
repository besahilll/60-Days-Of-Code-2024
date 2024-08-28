class Solution {
    Node divide(Node head) {
        Node evenStart = null, evenEnd = null, oddStart = null, oddEnd = null;
        Node current = head;

        // Traverse the list and segregate nodes into even and odd lists
        while (current != null) {
            int value = current.data;

            if (value % 2 == 0) {
                if (evenStart == null) {
                    evenStart = current;
                    evenEnd = evenStart;
                } else {
                    evenEnd.next = current;
                    evenEnd = evenEnd.next;
                }
            } else { 
                if (oddStart == null) {

                    oddStart = current;
                    oddEnd = oddStart;
                } else {
                    oddEnd.next = current;
                    oddEnd = oddEnd.next;
                }
            }
            current = current.next;
        }

        if (evenStart == null) {
            return oddStart;
        }

        evenEnd.next = oddStart;

        if (oddEnd != null) {
            oddEnd.next = null;
        }

        return evenStart;
    }
}