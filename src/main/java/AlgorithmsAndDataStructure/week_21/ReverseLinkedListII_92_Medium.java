package AlgorithmsAndDataStructure.week_21;

public class ReverseLinkedListII_92_Medium {
    public static void main(String[] args) {
//        System.out.println(reverseBetween(head, 2, 4));
    }

    public static ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        for (int i = 0; i < left - 1; i++) {
            prev = prev.next;
        }

        ListNode currentHead = prev.next;
        for (int i = 0; i < right - left; i++) {
            ListNode forward = currentHead.next;
            currentHead.next = forward.next;
            forward.next = prev.next;
            prev.next = forward;
        }
        return dummy.next;
    }
}
