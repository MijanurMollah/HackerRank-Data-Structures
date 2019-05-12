// Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
                
        SinglyLinkedListNode node = new SinglyLinkedListNode(data);
        if (head == null) {
            head = node;
        }
        else {
        SinglyLinkedListNode ptr = head;
        while(ptr.next != null)
            ptr = ptr.next;

        ptr.next = node;
        }
        return head;
    }
