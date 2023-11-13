package practice;


class Node {
    int data;
    Node left , right;

    public Node (int item) {
        this.data = item;
        this.left = this.right = null;
    }
}

public class BinarySearchTree {
     Node root ;

     public BinarySearchTree() {
         root = null;
     }

     public void insert(int item) {
         root = insertRec(root , item);

     }

    private Node insertRec(Node root, int item) {
         if (root == null) {
             return new Node(item);
         }

         Node parent_node, current_node;
         parent_node = null;
         current_node = root;

         while (current_node != null) {
             parent_node = current_node;

             if (item < current_node.data) {
                 current_node = current_node.left;
             } else {
                 current_node = current_node.right;
             }
         }

         if (item < parent_node.data) {
             parent_node.left = new Node(item);
         } else {
             parent_node.right = new Node(item);
         }

         return root ;
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
        BinarySearchTree BST = new BinarySearchTree();

        int [] in = { 2, 7 , 1};

        for (int item : in) {
            BST.insert(item);
        }

        System.out.println("inorder traversal :");
        BST.inOrder();
    }


}
