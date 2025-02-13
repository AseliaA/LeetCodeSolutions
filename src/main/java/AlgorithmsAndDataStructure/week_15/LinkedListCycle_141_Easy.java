package AlgorithmsAndDataStructure.week_15;

import java.util.HashSet;

public class LinkedListCycle_141_Easy {
    public static void main(String[] args) {

    }

    //Ver1 from Editorial on LeetCode, not the most optimal solution
    //Time Comp: O(n)
    //Memory Comp: O(n)
//    public static boolean hasCycle(ListNode head) {
//        Set<ListNode> visited = new HashSet<>();
//
//        while (head != null) {
//            if (visited.contains(head)) return true;
//            visited.add(head);
//            head = head.next;
//        }
//        return false;
//    }
}
