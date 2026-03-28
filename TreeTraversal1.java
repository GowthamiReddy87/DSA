class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class TreeTraversal1 {

    public static void inorder(Node root) {
        if(root == null) return;

        inorder(root.left);   
        System.out.print(root.data + " ");  
        inorder(root.right);   
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        inorder(root);
    }
}