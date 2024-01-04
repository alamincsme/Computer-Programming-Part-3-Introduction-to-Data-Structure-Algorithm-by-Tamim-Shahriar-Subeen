public void insertionSort() {
    if (head == null || head.next == null) {
        return;
    }

    LL.Node sorted = null;
    LL.Node current = head;

    while (current != null) {
        LL.Node next = current.next;

        if (sorted == null || sorted.data >= current.data) {

            current.next = sorted;
            sorted = current;
        } else {
            // Search for the correct position in the sorted list
            LL.Node temp = sorted;
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
