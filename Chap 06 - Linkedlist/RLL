// Time complexity O(n)

public void reverseList() {
        Node next = null, prev = null, curr_node = head;
        while (curr_node != null) {
            next = curr_node.next;
            curr_node.next = prev;
            prev = curr_node;
            curr_node = next ;
        }
    }
