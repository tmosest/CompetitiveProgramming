package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Stack;

class MaximalRectangle {
	/**
	 * https://leetcode.com/problems/maximal-rectangle/?envType=daily-question&envId=2024-04-13
	 * 
	 * @param matrix
	 * @return
	 */
	public int maximalRectangle(char[][] matrix) {

		if (matrix.length == 0)
			return 0;
		int maxarea = 0;
		int[] dp = new int[matrix[0].length];

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {

				// update the state of this row's histogram using the last row's histogram
				// by keeping track of the number of consecutive ones

				dp[j] = matrix[i][j] == '1' ? dp[j] + 1 : 0;
			}
			// update maxarea with the maximum area from this row's histogram
			maxarea = Math.max(maxarea, leetcode84(dp));
		}
		return maxarea;
	}

	public int leetcode84(int[] heights) {
		Stack<Integer> stack = new Stack<>();
		stack.push(-1);
		int maxarea = 0;
		for (int i = 0; i < heights.length; ++i) {
			while (stack.peek() != -1 && heights[stack.peek()] >= heights[i])
				maxarea = Math.max(maxarea, heights[stack.pop()] * (i - stack.peek() - 1));
			stack.push(i);
		}
		while (stack.peek() != -1)
			maxarea = Math.max(maxarea, heights[stack.pop()] * (heights.length - stack.peek() - 1));
		return maxarea;
	}
}
