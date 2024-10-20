class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BTreePreOrder {

    // Function to perform preorder traversal
    static void preorderTraversal(Node node) {
      
        // Base case
        if (node == null)
            return;
      
        // Visit the current node
        System.out.print(node.data + " ");
      
        // Recur on the left subtree
        preorderTraversal(node.left);
      
        // Recur on the right subtree
        preorderTraversal(node.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        preorderTraversal(root);
    }
}
