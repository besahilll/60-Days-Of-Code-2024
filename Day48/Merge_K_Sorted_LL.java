class Solution {
    public static Node merge(Node head1, Node head2){
        int val;
        Node head , tail;
        head = tail =  null;
        while(head1 != null && head2 != null){
            if(head1.data < head2.data){
                val = head1.data;
                head1 = head1.next;
            }else{
                val = head2.data;
                head2 = head2.next;
            }
            Node temp = new Node(val);
            if(head == null){
                head = tail = temp;
            }else{
                tail.next = temp;
                tail  = temp;
            }
        }
        while(head1 != null){
            Node temp = new Node(head1.data);
            tail.next = temp;
            tail  = temp;
            head1 = head1.next;
        }
        while(head2 != null){
            Node temp = new Node(head2.data);
            tail.next = temp;
            tail  = temp;
            head2 = head2.next;
        }
        return head;
    }
    public static Node mergeSort(List<Node> arr , int si , int ei){
        if(si >= ei) {
            return arr.get(si);
        }
        int mid = (si + ei)/2;
        Node list1 = mergeSort(arr , si , mid);
        Node list2 = mergeSort(arr , mid + 1, ei);
        return merge(list1 , list2);
    }
    Node mergeKLists(List<Node> arr) {
        return mergeSort(arr , 0 , arr.size() - 1);
    }
}