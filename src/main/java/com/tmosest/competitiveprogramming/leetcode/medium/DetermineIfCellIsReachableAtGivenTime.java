package com.tmosest.competitiveprogramming.leetcode.medium;

class DetermineIfCellIsReachableAtGivenTime {
	/**
	 * https://leetcode.com/problems/determine-if-a-cell-is-reachable-at-a-given-time/
	 * 
	 * https://en.wikipedia.org/wiki/Chebyshev_distance
	 * 
	 * @param sx
	 * @param sy
	 * @param fx
	 * @param fy
	 * @param t
	 * @return
	 */
	public boolean isReachableAtTime(int sx, int sy, int fx, int fy, int t) { 
		int width = Math.abs(sx - fx);
        int height = Math.abs(sy - fy);
        if (width == 0 && height == 0 && t == 1) {
            return false;
        }
        return t >= Math.max(width, height);
	}
}
