package AlgorithmsAndDataStructure.week_21;

public class RemoveNthNodeFromEndofList_19_Medium {
    public static void main(String[] args) {

    }

    public static ListNode removeNthFromEnd2(ListNode head, int n) {
        if (head == null) {
            return null;
        }

        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode fastPointer = dummy;
        ListNode slowPointer = dummy;
        for (int i = 0; i <= n; i++) {
            fastPointer = fastPointer.next;
        }

        while (fastPointer != null) {
            fastPointer = fastPointer.next;
            slowPointer = slowPointer.next;
        }

        ListNode target = slowPointer.next;
        slowPointer.next = target.next;
        return dummy.next;
    }

    //Time complexity: O(2n) -> O(n)
    //Space complexity: O(1)
    // Two cycle solution
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) {
            return null;
        } else if (head.next == null && n == 1) {
            return null;
        }


        ListNode dummy = new ListNode(0);
        dummy.next = head;

        int nodes = 0;
        while (head != null) {
            nodes++;
            head = head.next;
        }

        ListNode prev = dummy;
        for (int i = nodes; i > n; i--) {
            prev = prev.next;
        }

        ListNode currentNeedsRemoval = prev.next;
        ListNode newNext = currentNeedsRemoval.next;

        prev.next = newNext;
        return dummy.next;
    }
}
