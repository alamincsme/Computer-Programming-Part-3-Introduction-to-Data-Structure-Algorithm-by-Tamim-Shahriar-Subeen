public class DLL {
    private Node head;

    public class Node {
        private int data;
        private Node next;
        private Node prev;


        public Node (int item) {
            this.data = item;
            this.next = null;
            this.prev = null;
        }
    }

    public void prepend(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else  {
            node.next = head;
            head.prev = node;
            head = node;
        }
    }


    public void append (int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            Node curr_node = head;
            while (curr_node.next != null) {
                curr_node = curr_node.next;
            }
            curr_node.next = node;
            node.prev  = curr_node ;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("No item in the list.");
        } else {
            Node curr_node = head ;
            while (curr_node != null) {
                System.out.println(curr_node.data + " ");
                curr_node = curr_node.next;
            }
        }
    }

    public static void main(String[] args) {
        DLL ll = new DLL();
        ll.append(20);
        ll.append(30);
        ll.append(40);
        ll.prepend(10);
        ll.printLL();
    }
}
