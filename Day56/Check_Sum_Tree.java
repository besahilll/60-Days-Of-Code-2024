/* A Binary Tree node
class Node
{
    int data;
    Node left, right;

    Node(int item)
    {
        data = item;
        left = right = null;
    }
}
*/
class Solution {
     private int sumTreeUtil(Node node) {
        if (node == null) {
            return 0;
        }

        if (node.left == null && node.right == null) {
            return node.data;
        }

        int leftSum = sumTreeUtil(node.left);
        int rightSum = sumTreeUtil(node.right);

        if (leftSum == -1 || rightSum == -1 || node.data != leftSum + rightSum) {
            return -1; 
        }

        return node.data + leftSum + rightSum;
    }
    boolean isSumTree(Node root) {
        return sumTreeUtil(root) != -1;
    }
}