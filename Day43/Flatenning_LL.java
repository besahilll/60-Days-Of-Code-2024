class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        // code here
        if(root == null) return root;
        ArrayList<Integer> values = new ArrayList<Integer>();
        Node head = null, downPtr = root, leftPtr = root, ptr = null;
        while(leftPtr != null){
            while(downPtr != null){
                values.add(downPtr.data);
                downPtr = downPtr.bottom;
            }
            leftPtr = leftPtr.next;
            downPtr = leftPtr;
        }
        Collections.sort(values);
        for(Integer val: values){
            Node newNode = new Node(val);
            if(head == null){ 
                head = newNode;
                ptr = newNode;
            }
            else{
                ptr.bottom = newNode;
                ptr = ptr.bottom;
            }
        }
        
        return head;
    }
}