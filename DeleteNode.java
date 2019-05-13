  // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        SinglyLinkedListNode before_pos = head;
        SinglyLinkedListNode after_pos = head;
        int count = 0;
        while(count != position - 1) {
            count++;
            before_pos = before_pos.next;
            after_pos = after_pos.next;
        }
        after_pos = after_pos.next.next;
        before_pos.next = after_pos;
        return head;
    }
