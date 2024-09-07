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
    
    String serialize(Node node, HashMap<String, Integer> map) {
        if (node == null) {
            return "$"; 
        }
        
        String left = serialize(node.left, map);
        String right = serialize(node.right, map);
        String subtree = left + "," + right + "," + node.data;
        
        if (left.length() > 1 || right.length() > 1) {
            map.put(subtree, map.getOrDefault(subtree, 0) + 1);
        }
        
        return subtree;
    }
    
    int dupSub(Node root) {
        HashMap<String, Integer> map = new HashMap<>();
        serialize(root, map);
        
        for (String key : map.keySet()) {
            if (map.get(key) > 1) {
                return 1; 
            }
        }
        
        return 0; 
    }
}