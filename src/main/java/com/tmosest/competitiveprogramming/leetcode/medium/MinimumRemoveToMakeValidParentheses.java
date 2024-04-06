package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Stack;

class MinimumRemoveToMakeValidParentheses {
	/**
	 * https://leetcode.com/problems/minimum-remove-to-make-valid-parentheses/
	 * 
	 * @param s
	 * @return
	 */
	public String minRemoveToMakeValid(String str) {

		Set<Integer> validParenthesesLocations = validParenthesesLocations(str);
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (letter != '(' && letter != ')') {
				sb.append(letter);
				continue;
			}
			if (validParenthesesLocations.contains(i)) {
				sb.append(letter);
			}
		}

		return sb.toString();
	}

	private Set<Integer> validParenthesesLocations(String str) {
		Set<Integer> result = new HashSet<>();

		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char letter = str.charAt(i);
			if (letter != '(' && letter != ')') {
				continue;
			}
			if (letter == '(') {
				stack.add(i);
				continue;
			}
			if (letter == ')') {
				if (stack.isEmpty()) {
					continue;
				}
				result.add(stack.pop());
				result.add(i);
			}
		}

		return result;
	}
}
