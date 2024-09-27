public class Problem2 {
    public static ListNode insert(ListNode head, int val, int position) {
        ListNode newNode = new ListNode(val);

        // If the list is empty or position is 1, insert at the beginning
        if (head == null || position == 1) {
            newNode.next = head;
            return newNode;
        }

        ListNode current = head;
        int currentPosition = 1;

        // Traverse the list until we reach the position or the end
        while (current.next != null && currentPosition < position - 1) {
            current = current.next;
            currentPosition++;
        }

        // Insert the new node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }
}
