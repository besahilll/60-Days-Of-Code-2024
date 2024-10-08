class Solution {
    public ListNode middleNode(ListNode head) {
        ListNode slow, fast, new_head;
        slow = head;
        fast = head;
        while(fast!=null && fast.next!=null){
            slow=slow.next;
            fast = fast.next.next;
        }
        new_head=slow;
        return new_head;
    }
}