class Solution {
    static Node ReverseList(Node head)
    {
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
    public Node addOne(Node head) {
		head = ReverseList(head);
		
		Node temp = head;
		int carry = 1;
		int div = 0;
		while (temp != null) {
			int sum = temp.data+carry;
			if (sum > 9) {
				carry = sum/10;
				temp.data = sum%10;
				
			}
			else {
				carry = 0;
				temp.data = sum;
			}
			temp = temp.next;
		}

		head = ReverseList(head);

		if (carry != 0) {
			Node newNode = new Node(carry);
			newNode.next = head;
			head = newNode;
		}
		return head;
	}
}