/*
node class of binary tree
class Node {
    int data;
    Node left, right;
    
    public Node(int data){
        this.data = data;
    }
}
*/
class Solution{
   class Result {
        int maxSum = Integer.MIN_VALUE;  // Variable to store the maximum sum
        int maxLen = 0;                  // Variable to store the maximum length
    }

    public int sumOfLongRootToLeafPath(Node root) {
        Result res = new Result();
        findLongestPath(root, 0, 0, res);
        return res.maxSum;
    }

    private void findLongestPath(Node node, int currentLen, int currentSum, Result res) {
        // Base case: If the node is null, just return
        if (node == null) {
            return;
        }

        currentSum += node.data;
        currentLen++;


        if (node.left == null && node.right == null) {
           
            if (currentLen > res.maxLen) {
                res.maxLen = currentLen;
                res.maxSum = currentSum;
            }

            else if (currentLen == res.maxLen && currentSum > res.maxSum) {
                res.maxSum = currentSum;
            }
        }

        findLongestPath(node.left, currentLen, currentSum, res);
        findLongestPath(node.right, currentLen, currentSum, res);
    }
}