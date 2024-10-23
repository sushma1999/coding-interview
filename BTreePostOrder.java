class Node1 {
    int data;
    Node1 left, right;
    public Node1(int item) {
        data = item;
        left = right = null;
    }
}

public class BTreePostOrder {
    static void postorderTraversal(Node1 Node1) {
      
        // Base case: 
        if (Node1 == null)
            return;
      
        // Recur on the left subtree
        postorderTraversal(Node1.left);
      
        // Recur on the right subtree
        postorderTraversal(Node1.right);
      
        // Visit the current Node1
        System.out.print(Node1.data + " ");
    }

    public static void main(String[] args) {
        Node1 root = new Node1(1);
        root.left = new Node1(2);
        root.right = new Node1(3);
        root.left.left = new Node1(4);
        root.left.right = new Node1(5);
        postorderTraversal(root);
    }
}
