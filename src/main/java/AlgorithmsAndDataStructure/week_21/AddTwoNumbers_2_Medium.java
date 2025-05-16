package AlgorithmsAndDataStructure.week_21;

import java.math.BigInteger;

public class AddTwoNumbers_2_Medium {
    public static void main(String[] args) {
        //own (not good) implementation
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        ListNode head = addTwoNumbers1(l1, l2);
        while (head != null) {
            System.out.println(head.val);
            head = head.next;
        }

        //optimized solution
        ListNode head1 = addTwoNumbers(l1, l2);
        while (head1 != null) {
            System.out.println(head1.val);
            head1 = head1.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carryOver = 0;

        while (l1 != null || l2 != null || carryOver == 1) {
            int sum = 0;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            sum += carryOver;
            carryOver = sum / 10;

            tail.next = new ListNode(sum % 10);
            tail = tail.next;
        }

        return dummy.next;
    }

    public static ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
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
