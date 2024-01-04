public class LL {

   private Node head;

    public class Node {
        private int data;
        private Node next;


        public   Node (int item) {
            this.data = item;
            this.next = null;
        }
    }

    public void prepend(int item) {
        Node node = new Node(item) ;

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node;
        }
    }
    public void append(int item) {
        Node node = new Node(item);
        if (head == null) {
            head = node;
        } else {
            Node current_node = head;
            while (current_node.next != null) {
                current_node = current_node.next;
            }

            current_node.next = node;
        }
    }

    public void printLL() {
        if (head == null) {
            System.out.println("No item in the list");
        } else {
            Node curr_node = head;
            while (curr_node != null) {
                System.out.println(curr_node.data + " ");
                curr_node = curr_node.next;
            }
        }
    }


    public void insertionSort() {
        if (head == null || head.next == null) {
            return;
        }

        Node sorted = null;
        Node current = head;

        while (current != null) {
            Node next = current.next;

            if (sorted == null || sorted.data >= current.data) {

                current.next = sorted;
                sorted = current;
            } else {

                Node temp = sorted;
                while (temp.next != null && current.data > temp.next.data) {
                    temp = temp.next;
                }

                current.next = temp.next;
                temp.next = current;
            }

            current = next;

        }


        head = sorted;
    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.append(3);
        ll.append(1);
        ll.append(4);
        ll.append(2);
        ll.append(5);
        ll.insertionSort();
        ll.printLL();

    }
}
