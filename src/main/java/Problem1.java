// Problem1.java
public class Problem1 {
    public static ListNode concatenate(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return copyList(l2);
        }

        ListNode current = l1;
        while (current.next != null) {
            current = current.next;
        }

        current.next = copyList(l2);
        return l1;
    }

    // Helper method to copy a list
    private static ListNode copyList(ListNode list) {
        if (list == null) {
            return null;
        }
        ListNode newHead = new ListNode(list.val);
        ListNode current = newHead;
        list = list.next;

        while (list != null) {
            current.next = new ListNode(list.val);
            current = current.next;
            list = list.next;
        }

        return newHead;
    }
}