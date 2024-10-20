class Node {
    int data;
    Node left, right;
    public Node(int item) {
        data = item;
        left = right = null;
    }
}

public class BTreePostOrder {
    static void postorderTraversal(Node node) {
      
        // Base case: 
        if (node == null)
            return;
      
        // Recur on the left subtree
        postorderTraversal(node.left);
      
        // Recur on the right subtree
        postorderTraversal(node.right);
      
        // Visit the current node
        System.out.print(node.data + " ");
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        postorderTraversal(root);
    }
}
