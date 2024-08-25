class Solution {
    // Function to sort a linked list of 0s, 1s and 2s.
    static Node segregate(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        int count0 = 0, count1 = 0, count2 = 0;
        Node current = head;

        while (current != null) {
            if (current.data == 0) {
                count0++;
            } else if (current.data == 1) {
                count1++;
            } else if (current.data == 2) {
                count2++;
            }
            current = current.next;
        }

        current = head;
        while (current != null) {
            if (count0 > 0) {
                current.data = 0;
                count0--;
            } else if (count1 > 0) {
                current.data = 1;
                count1--;
            } else {
                current.data = 2;
                count2--;
            }
            current = current.next;
        }

        return head;
    }
}
