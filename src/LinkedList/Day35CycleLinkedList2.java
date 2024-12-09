package LinkedList;

public class Day35CycleLinkedList2 {

    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
    }

    public ListNode detectCycle(ListNode head) {
        ListNode slowPtr = head;
        ListNode fastPtr = head;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
            if (slowPtr == fastPtr) {
                break;
            }
        }
        if (fastPtr == null || fastPtr.next == null)
            return null;

        ListNode slowPtr2 = head;
        while (slowPtr2 != slowPtr) {
            slowPtr2 = slowPtr2.next;
            slowPtr = slowPtr.next;
        }
        return slowPtr;
    }

    public static void main(String[] args) {

    }
}
