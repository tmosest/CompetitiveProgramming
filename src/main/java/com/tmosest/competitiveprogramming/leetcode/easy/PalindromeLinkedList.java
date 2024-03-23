package com.tmosest.competitiveprogramming.leetcode.easy;

import com.tmosest.competitiveprogramming.leetcode.common.ListNode;

class PalindromeLinkedList {
	/**
	 * https://leetcode.com/problems/palindrome-linked-list/
	 * 
	 * Uses O(N) complexity and O(2 * N) space where N is the length of the List.
	 * 
	 * @param head
	 * @return
	 */
	public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return true;
        }

        StringBuilder sb = new StringBuilder();

        while (head != null) {
            sb.append(Integer.valueOf(head.val));
            head = head.next;
        }

        String original = sb.toString();
        String reverse = sb.reverse().toString();

        return original.equals(reverse);
    }

	
}
