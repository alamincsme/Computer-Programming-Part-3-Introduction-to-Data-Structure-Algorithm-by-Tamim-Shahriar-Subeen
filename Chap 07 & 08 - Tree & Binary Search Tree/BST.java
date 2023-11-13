package practice;


class Node {
    int data;
    Node left , right;

    public Node (int item) {
        this.data = item;
        this.left = this.right = null;
    }
}

public class BST {
     Node root ;

     public BST() {
         root = null;
     }

     public void insert(int item) {
         root = insertRec(root , item);

     }

    private Node insertRec(Node root, int data) {
        if (root == null) {
            return new Node(data);
        }

        if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else if (data > root.data) {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    public void inOrder() {
         inOrderRec(root);
    }

    private void inOrderRec(Node root) {
         if (root != null) {
             inOrderRec(root.left);
             System.out.println(root.data + " ");
             inOrderRec(root.right);
         }
    }

    public static void main(String[] args) {
        BST bst = new BST();

        int [] in = { 2, 7 , 1};

        for (int item : in) {
            bst.insert(item);
        }

        System.out.println("inorder traversal :");
        bst.inOrder();
    }


}
