package Practice;
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class Reverselist {
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }
}
