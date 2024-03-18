package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;


class MinimumNumberOfArrowsToBurstBalloons {
	/**
	 * https://leetcode.com/problems/minimum-number-of-arrows-to-burst-balloons/description/?envType=daily-question&envId=2024-03-18
	 * @param points
	 * @return
	 */
	public int findMinArrowShots(int[][] points) {

		// Sort the balloons based on their end coordinates
        Arrays.sort(points, (a, b) -> Integer.compare(a[1], b[1]));
        
        int arrows = 1;
        int prevEnd = points[0][1];
        
        // Count the number of non-overlapping intervals
        for (int i = 1; i < points.length; ++i) {
            if (points[i][0] > prevEnd) {
                arrows++;
                prevEnd = points[i][1];
            }
        }
        
        return arrows;
	}
}
