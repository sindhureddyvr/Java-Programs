public class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
  }

//Floyd's Cycle Algorithm
public boolean hasCycle(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while (fast != null && fast.next != null && slow != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow)
				return true;
		}
		return false;
	}
