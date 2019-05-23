 // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
        DoublyLinkedListNode rev_list;
        if (head.next != null)
         rev_list = reverse(head.next);
        else
         return head;

        DoublyLinkedListNode head2 = rev_list;
        while (head2.next != null) {
            head2 = head2.next;
        }
        
        head.next = null;
        head2.next = head;
        head.prev = rev_list;

        
        return rev_list;
    }
