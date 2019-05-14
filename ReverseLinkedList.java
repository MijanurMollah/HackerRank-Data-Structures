  // Complete the reverse function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {
        SinglyLinkedListNode prev = new SinglyLinkedListNode(head.data);
        if(head.next != null){
            prev = reverse(head.next); 
        }
        else {
            return prev;
        }
        head.next = null;        
        SinglyLinkedListNode other_prev = prev;
        while(other_prev.next != null) {
            other_prev = other_prev.next;
        }
        other_prev.next = head;
        return prev;
    }
