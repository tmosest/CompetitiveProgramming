package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class SwappingNodesInLinkedList {
	/**
	 * 
	 * @param head
	 * @param k
	 * @return
	 */
	public ListNode swapNodes(ListNode head, int k) {
		ListNode firstPtr = head;
		ListNode secondPtr = head;

		for (int i = 0; i < k - 1; i++) {
			firstPtr = firstPtr.next;
		}

		ListNode temp = firstPtr;

		while (firstPtr.next != null) {
			firstPtr = firstPtr.next;
			secondPtr = secondPtr.next;
		}

		int tempVal = temp.val;
		temp.val = secondPtr.val;
		secondPtr.val = tempVal;

		return head;
	}
}
