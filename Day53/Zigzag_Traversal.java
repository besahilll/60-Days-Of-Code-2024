class GFG
{
    //Function to store the zig zag order traversal of tree in a list.
	ArrayList<Integer> zigZagTraversal(Node root)
	{
	    ArrayList<Integer> result = new ArrayList<>();
        
        if (root == null) {
            return result;
        }
        
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        
        boolean leftToRight = true;
        
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            ArrayList<Integer> levelList = new ArrayList<>();
            
            for (int i = 0; i < levelSize; i++) {
                Node currentNode = queue.poll();
                levelList.add(currentNode.data);
                
                if (currentNode.left != null) {
                    queue.add(currentNode.left);
                }
                if (currentNode.right != null) {
                    queue.add(currentNode.right);
                }
            }
            
            if (!leftToRight) {
                Collections.reverse(levelList);
            }
            result.addAll(levelList);
            
            leftToRight = !leftToRight;
        }
        
        return result;
	}
}