package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class ReverseLinkedList {
	/**
	 * https://leetcode.com/problems/reverse-linked-list/description/
	 * 
	 * @param head
	 * @return
	 */
	public ListNode reverseList(ListNode head) {
		List<ListNode> array = new ArrayList<ListNode>();

		while (head != null) {
			array.add(head);
			head = head.next;
		}

		if (array.isEmpty()) {
			return head;
		}

		for (ListNode node : array) {
			node.next = null;
		}

		Collections.reverse(array);

		for (int i = 0; i < array.size() - 1; i++) {
			array.get(i).next = array.get(i + 1);
		}

		return array.get(0);
	}
}
