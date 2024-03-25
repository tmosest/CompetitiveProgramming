package com.tmosest.competitiveprogramming.leetcode.medium;

class MinimumMovesToCaptureTheQueen {
	/**
	 * https://leetcode.com/problems/minimum-moves-to-capture-the-queen/
	 * 
	 * @param a White Rook x
	 * @param b White Rook y
	 * @param c White Bishop x
	 * @param d White Bishop y
	 * @param e Black Queen x
	 * @param f Black Queen y
	 * @return
	 */
	public int minMovesToCaptureTheQueen(int a, int b, int c, int d, int e, int f) {
		if (a == e || b == f) {
			if (a == e && a == c && ((d - b) * (d - f) < 0))
				return 2;
			if (b == f && b == d && ((c - a) * (c - e) < 0))
				return 2;
			return 1;
		}
		if (Math.abs(c - e) == Math.abs(d - f)) {
			if (Math.abs(c - a) == Math.abs(d - b) && Math.abs(e - a) == Math.abs(f - b) && ((b - f) * (b - d) < 0))
				return 2;
			return 1;
		}
		return 2;
	}
}
