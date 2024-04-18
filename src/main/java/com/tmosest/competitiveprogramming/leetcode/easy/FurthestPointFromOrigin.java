package com.tmosest.competitiveprogramming.leetcode.easy;

class FurthestPointFromOrigin {
	/**
	 * https://leetcode.com/problems/furthest-point-from-origin/description/
	 * 
	 * @param moves
	 * @return
	 */
	public int furthestDistanceFromOrigin(String moves) {
		
		int left = 0;
		int right = 0; 
		int blank = 0;

		for (char letter : moves.toCharArray()) {
			if (letter == '_') {
				++blank;
				continue;
			}
			if (letter == 'R') {
				++right;
				continue;
			}
			++left;
		}

		if (right > left) {
			right += blank;
		} else {
			left += blank;
		}

		return Math.abs(right - left);
	}
}
