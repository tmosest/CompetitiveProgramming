package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.LinkedList;
import java.util.List;

class RemoveDigits {
	/**
	 * https://leetcode.com/problems/remove-k-digits/?envType=daily-question&envId=2024-04-11
	 * 
	 * @param num
	 * @param k
	 * @return
	 */
	public String removeKdigits(String num, int k) {
		LinkedList<Character> stack = new LinkedList<Character>();

		for (char digit : num.toCharArray()) {
			while (stack.size() > 0 && k > 0 && stack.peekLast() > digit) {
				stack.removeLast();
				k -= 1;
			}
			stack.addLast(digit);
		}

		/* remove the remaining digits from the tail. */
		for (int i = 0; i < k; ++i) {
			stack.removeLast();
		}

		// build the final string, while removing the leading zeros.
		StringBuilder ret = new StringBuilder();
		boolean leadingZero = true;
		for (char digit : stack) {
			if (leadingZero && digit == '0')
				continue;
			leadingZero = false;
			ret.append(digit);
		}

		/* return the final string */
		if (ret.length() == 0)
			return "0";
		return ret.toString();
	}
}
