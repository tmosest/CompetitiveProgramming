package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class DoubleNumberRepresentedAsLinkedList {
	/**
	 * https://leetcode.com/problems/double-a-number-represented-as-a-linked-list/description/
	 * 
	 * @param head
	 * @return
	 */
	public ListNode doubleIt(ListNode head) {
		if (head.val > 4) {
			head = new ListNode(0, head);
		}

		for (ListNode node = head; node != null; node = node.next) {
			node.val = node.val * 2 % 10;
			if (node.next != null && node.next.val > 4) {
				node.val++;
			}
		}
		return head;
	}
}
