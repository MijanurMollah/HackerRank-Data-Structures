// Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
       DoublyLinkedListNode list2 = head;
       DoublyLinkedListNode node = new DoublyLinkedListNode(data);

       if (data < list2.data) {
           node.next = list2;
           return node;
       }

       while (list2 != null) {
           if (list2.next != null && data <= list2.next.data) {
               node.next = list2.next;
               list2.next = node;
               break;
           }
           else if (list2.next == null) {
           list2.next = node;
           break;
           }
           list2 = list2.next;
       }

       return head;
    }
