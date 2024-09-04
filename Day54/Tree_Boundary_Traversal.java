// class Node  
// { 
//     int data; 
//     Node left, right; 
   
//     public Node(int d)  
//     { 
//         data = d; 
//         left = right = null; 
//     } 
// }

class Solution {
    
    // Function to perform the boundary traversal
    ArrayList<Integer> boundary(Node node) {
        ArrayList<Integer> result = new ArrayList<>();
        if (node == null) return result;

        if (!isLeaf(node)) result.add(node.data);

        addLeftBoundary(node.left, result);

        addLeaves(node, result);

        addRightBoundary(node.right, result);

        return result;
    }

    // Function to check if a node is a leaf node
    private boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private void addLeftBoundary(Node node, ArrayList<Integer> result) {
        while (node != null) {
            if (!isLeaf(node)) result.add(node.data);
            if (node.left != null) node = node.left;
            else node = node.right;
        }
    }
    
    private void addLeaves(Node node, ArrayList<Integer> result) {
        if (isLeaf(node)) {
            result.add(node.data);
            return;
        }
        if (node.left != null) addLeaves(node.left, result);
        if (node.right != null) addLeaves(node.right, result);
    }

    private void addRightBoundary(Node node, ArrayList<Integer> result) {
        Stack<Integer> temp = new Stack<>();
        while (node != null) {
            if (!isLeaf(node)) temp.push(node.data);
            if (node.right != null) node = node.right;
            else node = node.left;
        }
        while (!temp.isEmpty()) {
            result.add(temp.pop());
        }
    }
}