package data_structure_and_algorithm;

public class LL {
    private Node head ;

    public class Node {
        int data;
        Node next;

        public Node (int item) {
            this.data = item;
            this.next = null;
        }
    }


    public void prepend(int item) {
        Node node = new Node(item);

        if (head == null) {
            head = node;
        } else {
            node.next = head;
            head = node ;
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


    public void printLL () {
        if (head == null) {
            System.out.println("No item to list.");
        } else {

            Node current_node = head;

            while (current_node != null) {
                System.out.println(current_node.data + " ");
                current_node = current_node.next;
            }
        }
    }


    public int count_node () {
        int count = 0 ;

        if (head == null) {
            return count;
        } else {
            Node current_node = head;

            while (current_node != null) {
                count = count + 1;
                current_node = current_node.next;
            }
        }
        return count;
    }

    public Node search(int item) {
        if (head == null) {
            return  null;
        } else {
            Node current_node = head;

            while (current_node != null) {
                if (current_node.data == item) {
                    return current_node;
                }
                current_node = current_node.next;
            }
        }
        return null;
    }

    public boolean isEmpty() {
       return count_node() == 0 ;
    }

    public void insertAtPosition(int position, int item) {
        if (position == 0) {
            prepend(item);
        } else if (position == count_node()) {
            append(item);
        } else if (position > 0 && position < count_node()) {

            Node node = new Node(item);
            Node current_node = head;
            for (int i = 0; i < position - 1 ; i++) {
                current_node = current_node.next;
            }
            node.next = current_node.next;
            current_node.next = node;
        } else {
            System.out.println("invalid position.");
        }

    }


    public void removefirst() {
        if (head == null) {
            System.out.println("No item to remove.");
        } else {
            head = head.next;
        }
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("No item to remove.");
        } else if (count_node() == 1) {
            head = null ;
        } else {

            Node current_node = head;
            for (int i = 0; i < count_node() - 2 ; i++ ) {
                current_node  = current_node.next;
            }
            current_node.next = null ;
        }
    }

    public void removeAtPosition (int position) {
        if (position == 0) {
            removefirst();
        } else if (position == count_node()) {
            removeLast();
        } else if (position > 0 && position < count_node()) {
            Node current_node = head;

            for (int i = 0 ; i < position - 1; i++) {
                current_node = current_node.next ;
            }

            current_node.next = current_node.next.next;
        } else {
            System.out.println("invalid position.");
        }

    }
    public static void main(String[] args) {
        LL ll = new LL();
        ll.append(10);
        ll.append(20);
        ll.append(30);
        ll.prepend(0);
        ll.prepend(-10);
        ll.printLL();
        int cnt = ll.count_node();
        System.out.println(cnt);

        Node node = ll.search(12);
        if (node == null) {
            System.out.println("Note found.");
        } else {
            System.out.println(node.data + " is found in the list.");
        }

        System.out.println();
        ll.removeAtPosition(2);
        ll.printLL();
    }
}
