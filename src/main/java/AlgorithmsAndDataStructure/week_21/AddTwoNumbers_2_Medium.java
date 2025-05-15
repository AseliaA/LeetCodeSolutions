package AlgorithmsAndDataStructure.week_21;

import java.math.BigInteger;

public class AddTwoNumbers_2_Medium {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode head = addTwoNumbers(l1, l2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null || l1.val == 0) {
            return l2;
        } else if (l2 == null || l2.val == 0) {
            return l1;
        }

        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        BigInteger l1Int = new BigInteger(readReversedLinkedList(l1, ""));
        BigInteger l2Int = new BigInteger(readReversedLinkedList(l2, ""));
        BigInteger resultInt = l1Int.add(l2Int);

        String resultStr = String.valueOf(resultInt);
        for (int i = resultStr.length() - 1; i >= 0; i--) {
            int digit = resultStr.charAt(i) - '0';
            tail.next = new ListNode(digit);
            tail = tail.next;
        }

        return dummy.next;
    }

    private static String readReversedLinkedList(ListNode list, String strResult) {
        if (list == null) {
            String reversedStr = new StringBuilder(strResult).reverse().toString();
            return reversedStr;
        }
        strResult = strResult + list.val;
        list = list.next;
        return readReversedLinkedList(list, strResult);
    }
}
