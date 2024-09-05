/*class Node{
    int data;
    Node left,right;
    Node(int d){
    	data=d;
    	left=null;
    	right=null;
    }
}*/

class Solution{
    public void toSumTree(Node root) {
        convertToSumTree(root);
    }

    private int convertToSumTree(Node root) {
        if (root == null) {
            return 0;
        }

        int leftSum = convertToSumTree(root.left);
        int rightSum = convertToSumTree(root.right);

        int oldValue = root.data;
        root.data = leftSum + rightSum;

        return oldValue + root.data;
    }
}