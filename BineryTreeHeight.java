/*
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static int height(Node root) {
      	// Write your code here.
          if (root == null)
          return -1;

          int leftHeight = height(root.left) + 1;
          int rightHeight = height(root.right) + 1;

          if (leftHeight > rightHeight)
          return leftHeight;
          else
          return rightHeight;
    }
