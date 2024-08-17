class Solution {
    public static void removeLoop(Node head) {
        Set<Node> h1=new HashSet<>();
        Node curr=head;
        Node prev=head;
        while(!h1.contains(curr) && curr!=null){
            h1.add(curr);
            prev=curr;
            curr=curr.next;
        }
        if(h1.contains(curr)){
            prev.next=null;
        }
    }
}