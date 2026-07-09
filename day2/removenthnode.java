package day2;

public class removenthnode {

    static Node removeNthFromEnd(Node head, int n) {

        int length = 0;
        Node temp = head;

        while (temp != null) {
            length++;
            temp = temp.next;
        }

        Node dummy = new Node(0);
        dummy.next = head;
        Node curr = dummy;

        for (int i = 0; i < length - n; i++) {
            curr = curr.next;
        }

        curr.next = curr.next.next;

        return dummy.next;
    }
}