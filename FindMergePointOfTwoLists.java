 // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        int answer = 0;
        
        while(head1.next != null) {
        SinglyLinkedListNode ptr = head2;
        while(ptr.next != null) {
            if(ptr == head1) {
            answer = head1.data;
            ptr.next = null;
            }
            else
            ptr = ptr.next;
        }
        if (answer > 0)
        break;

        head1 = head1.next;
        }
        return head1.data;
    }
