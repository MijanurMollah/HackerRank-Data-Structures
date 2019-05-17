// Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode ptr = head;
        int length = 0;
        while (ptr.next != null) {
            ptr = ptr.next;
            length++;
        }
        int pos = length - positionFromTail;
        while (pos > 0) {
            pos--;
            head = head.next;
        }
        return head.data;
    }
