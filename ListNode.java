public class ListNode {
public int val ;
public ListNode next ;
public ListNode ( int x ) { val = x ; }

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

public static ListNode insert(ListNode head, int val, int position) {
    ListNode newNode = new ListNode(val);

    if (head == null || position == 1) {
        newNode.next = head;
        return newNode;
    }

    ListNode current = head;
    int currentPosition = 1;

    while (current.next != null && currentPosition < position - 1) {
        current = current.next;
        currentPosition++;
    }

    newNode.next = current.next;
    current.next = newNode;

    return head;
}
}