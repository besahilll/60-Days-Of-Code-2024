class Solution
{
   public static Node findIntersection(Node head1, Node head2)
    {
        Node ptr1 = head1;
        Node ptr2 = head2;
        Node dummyHead = new Node(0); 
        Node current = dummyHead;
        

        while (ptr1 != null && ptr2 != null) {
            if (ptr1.data == ptr2.data) {
                current.next = new Node(ptr1.data);
                current = current.next;
                ptr1 = ptr1.next;
                ptr2 = ptr2.next;
            } else if (ptr1.data < ptr2.data) {
                ptr1 = ptr1.next;
            } else {
                ptr2 = ptr2.next;
            }
        }
        return dummyHead.next;
    }
}