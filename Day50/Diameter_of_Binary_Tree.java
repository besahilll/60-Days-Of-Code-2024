class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

     class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }
    
    int diameter(Node root) {
         return diameterHelper(root).diameter;
    }
    
    TreeInfo diameterHelper(Node node) {
        if (node == null) {
            return new TreeInfo(0, 0);
        }

        TreeInfo leftInfo = diameterHelper(node.left);
        TreeInfo rightInfo = diameterHelper(node.right);

        int height = Math.max(leftInfo.height, rightInfo.height) + 1;

        int diameter = Math.max(leftInfo.height + rightInfo.height + 1, 
        Math.max(leftInfo.diameter, rightInfo.diameter));

        return new TreeInfo(height, diameter);
    }
}
