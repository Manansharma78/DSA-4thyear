package day2;


public class AddTwoNumbers {
    
    static Node add(Node head, Node head1) {

        Node dummy = new Node(0);
        Node curr = dummy;

        int carry = 0;

        while (head != null || head1 != null || carry != 0) {

            int x = (head != null) ? head.data : 0;
            int y = (head1 != null) ? head1.data : 0;

            int sum = x + y + carry;

            carry = sum / 10;
            curr.next = new Node(sum % 10);
            curr = curr.next;

            if (head != null) head = head.next;
            if (head1 != null) head1 = head1.next;
        }

        return dummy.next;
    }
}