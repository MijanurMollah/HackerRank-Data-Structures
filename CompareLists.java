 // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode h1_ptr = head1;
        SinglyLinkedListNode h2_ptr = head2;
        int h1_length = 0;
        int h2_length = 0;
        
        while(h1_ptr != null){
            h1_ptr = h1_ptr.next;
            h1_length++;
        } 

        while(h2_ptr != null) {
            h2_ptr = h2_ptr.next;
            h2_length++;
        }

        if (h1_length != h2_length)
        return false;
        else {
            while (head1 != null) {
                if(head1.data != head2.data)
                return false;

                head1 = head1.next;
                head2 = head2.next;
            }
            return true;
        }

    }
