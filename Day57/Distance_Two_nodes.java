/* A Binary Tree node
class Node
{
    int data;
    Node left, right;
   Node(int item)    {
        data = item;
        left = right = null;
    }
} */

/* Should return minimum distance between a and b
   in a tree with given root*/
class GfG {
    Node findLCA(Node root, int n1, int n2) {
        if (root == null) return null;
        
        if (root.data == n1 || root.data == n2) return root;
        
        Node leftLCA = findLCA(root.left, n1, n2);
        Node rightLCA = findLCA(root.right, n1, n2);
        
        if (leftLCA != null && rightLCA != null) return root;
        
        return (leftLCA != null) ? leftLCA : rightLCA;
    }
    
    int findLevel(Node root, int value, int level) {
        if (root == null) return -1;
        
        if (root.data == value) return level;
        
        int left = findLevel(root.left, value, level + 1);
        if (left == -1) {
            return findLevel(root.right, value, level + 1);
        }
        
        return left;
    }
    
    int findDist(Node root, int a, int b) {
        Node lca = findLCA(root, a, b);
        int d1 = findLevel(lca, a, 0);
        int d2 = findLevel(lca, b, 0);
        
        return d1 + d2;
    }
}
