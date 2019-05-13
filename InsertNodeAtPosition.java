// Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        SinglyLinkedListNode before = head;
        SinglyLinkedListNode after = head;
        int count = 0;
        while(count != position - 1) {
            count++;
            before = before.next;
            after = after.next;
        }
        after = after.next;
        node.next = after;
        before.next = node;
        return head;
    }
