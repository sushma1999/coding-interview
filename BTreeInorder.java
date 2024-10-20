class Node {
    int data;
    Node left, right;

    public Node(int item) {
        data = item;
        left = right = null;
    }
}

class BTreeInorder {

    // Function to perform inorder traversal
    static void inorderTraversal(Node node) {
      
        // Base case
        if (node == null)
            return;
      
        // Recur on the left subtree
        inorderTraversal(node.left);
      
        // Visit the current node
        System.out.print(node.data + " ");
      
        // Recur on the right subtree
        inorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        inorderTraversal(root);
    }
}
