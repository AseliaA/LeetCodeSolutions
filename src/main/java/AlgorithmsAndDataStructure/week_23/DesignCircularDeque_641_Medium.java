package AlgorithmsAndDataStructure.week_23;

//2
public class DesignCircularDeque_641_Medium {
    public static void MyCircularDeque() {}
}

class MyCircularDeque {
    private int maxItems = -1;
    private int currentAmount = 0;
    private Node head;
    private Node tail;

    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public MyCircularDeque(int k) {
        maxItems = k;
    }

    public boolean insertFront(int value) {
        if (currentAmount < maxItems) {
            if (head == null) {
                head = new Node(value, null, null);
                tail = head;
                currentAmount++;
                return true;
            } else {
                Node oldHead = head;
                head = new Node(value, head, null);
                oldHead.prev = head;
                currentAmount++;
                return true;
            }
        }
        return false;
    }

    public boolean insertLast(int value) {
        if (currentAmount < maxItems) {
            if (tail == null) {
                tail = new Node(value, null, null);
                head = tail;
                currentAmount++;
                return true;
            } else {
                Node oldTail = tail;
                tail = new Node(value, null, tail);
                oldTail.next = tail;
                currentAmount++;
                return true;
            }
        }
        return false;
    }

    public boolean deleteFront() {
        if (currentAmount == 0) return false;

        if (currentAmount == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        currentAmount--;
        return true;
    }

    public boolean deleteLast() {
        if (currentAmount == 0) return false;

        if (currentAmount == 1) {
            tail = null;
            head = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        currentAmount--;
        return true;
    }

    public int getFront() {
        if (currentAmount > 0) {
            return head.val;
        } else {
            return -1;
        }
    }

    public int getRear() {
        if (currentAmount > 0) {
            return tail.val;
        } else {
            return -1;
        }
    }

    public boolean isEmpty() {
        return currentAmount == 0;
    }

    public boolean isFull() {
        return currentAmount == maxItems;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */