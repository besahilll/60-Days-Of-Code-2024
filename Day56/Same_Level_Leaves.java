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

class Solution
{
   boolean checkUtil(Node node, int level, int[] leafLevel) {
        if (node == null) {
            return true;
        }
        
        if (node.left == null && node.right == null) {
            if (leafLevel[0] == -1) {
                leafLevel[0] = level;
                return true;
            }
            return level == leafLevel[0];
        }
        
        return checkUtil(node.left, level + 1, leafLevel) &&
               checkUtil(node.right, level + 1, leafLevel);
    }
    
    boolean check(Node root)
    {
        int[] leafLevel = new int[1];
        leafLevel[0] = -1;  
        
        return checkUtil(root, 0, leafLevel);
    }
}
