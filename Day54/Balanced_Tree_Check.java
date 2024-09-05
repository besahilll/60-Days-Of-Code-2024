class Tree
{
   boolean isBalanced(Node root) {
        return checkHeightBalance(root) != -1;
    }

    private int checkHeightBalance(Node root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = checkHeightBalance(root.left);
        if (leftHeight == -1) {
            return -1;
        }

        int rightHeight = checkHeightBalance(root.right);
        if (rightHeight == -1) {
            return -1;
        }

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return -1;
        }

        return Math.max(leftHeight, rightHeight) + 1;
    }
}

