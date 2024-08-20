class Solution {
    boolean isPalindrome(Node head) {
        if(head == null || head.next == null)   
            return true;
        
        Node curr = head;
        Queue<Integer> l = new LinkedList<>();
        while(curr != null){
            l.add(curr.data);
            curr = curr.next;
        }
        Node reverseNode = reverse(head);
        while(reverseNode != null){
            if(reverseNode.data != l.poll()){
                return false;
            }
            reverseNode = reverseNode.next;
        }
        return true;
    }
    
    static Node reverse(Node head){
         Node next = null;
         Node curr  =head;
         Node prev = null;
        while(curr != null){
           next = curr.next;
           curr.next = prev;
           prev = curr;
           curr = next;
        }
      
        return prev;
    }
}
