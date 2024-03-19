package com.tmosest.competitiveprogramming.leetcode.easy;

class NumberOfRectanglesThatCanFormTheLargestSquare {
	/**
	 * https://leetcode.com/contest/weekly-contest-224/problems/number-of-rectangles-that-can-form-the-largest-square/
	 * @param rectangles
	 * @return
	 */
	public int countGoodRectangles(int[][] rectangles) {
		int maxLength = 0;

		for (int[] rect : rectangles) {
			maxLength = Math.max(maxLength, Math.min(rect[0], rect[1]));
		}

		int result = 0;

		for (int[] rect : rectangles) {
			if (Math.min(rect[0], rect[1]) >= maxLength) {
				++result;
			}
		}
		
		return result;
	}
}
