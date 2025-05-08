package AlgorithmsAndDataStructure.week_21;

public class ReverseLinkedList_206_Easy {
    public static void main(String[] args) {

    }

    public static ListNode reverseList(ListNode head) {
        return reverseListRecursive(head, null);
    }

    private static ListNode reverseListRecursive(ListNode currentNode, ListNode newNext) {
        if (currentNode == null) return newNext;
        ListNode oldNode = currentNode.next;
        currentNode.next = newNext;
        return reverseListRecursive(oldNode, newNext);
    }
}


