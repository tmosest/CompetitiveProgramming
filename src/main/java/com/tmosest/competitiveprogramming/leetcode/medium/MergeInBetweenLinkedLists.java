package com.tmosest.competitiveprogramming.leetcode.medium;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class MergeInBetweenLinkedLists {
	/**
	 * https://leetcode.com/problems/merge-in-between-linked-lists/description/
	 * 
	 * @param list1
	 * @param a
	 * @param b
	 * @param list2
	 * @return
	 */
	public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
		ListNode head = list1;

		ListNode pointerOneStart = list1;

		ListNode pointerOneEnd = list1;

		for (int i = 0; i <= b; i++) {
			if (i + 1 < a) {
				pointerOneStart = pointerOneStart.next;
			}

			if (i <= b + 1) {
				pointerOneEnd = pointerOneEnd.next;
			}
		}

		ListNode pointerTwoStart = list2;

		ListNode pointerTwoEnd = list2;

		while (pointerTwoEnd != null && pointerTwoEnd.next != null) {
			pointerTwoEnd = pointerTwoEnd.next;
		}

		pointerOneStart.next = pointerTwoStart;
		pointerTwoEnd.next = pointerOneEnd;

		return head;
	}
}
