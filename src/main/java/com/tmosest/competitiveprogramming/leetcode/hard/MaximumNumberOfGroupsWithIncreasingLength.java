package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Collections;
import java.util.List;

class MaximumNumberOfGroupsWithIncreasingLength {
	/**
	 * https://leetcode.com/problems/maximum-number-of-groups-with-increasing-length/description/
	 * 
	 * https://leetcode.com/problems/maximum-number-of-groups-with-increasing-length/solutions/3808537/java-beats-100-from-priority-queue-to-lee-s-solution/
	 * 
	 * @param usageLimits
	 * @return
	 */
	public int maxIncreasingGroups(List<Integer> usageLimits) {
        Collections.sort(usageLimits);
        long k = 0;
        long total = 0L;
        for(int i = 0; i < usageLimits.size(); i++) {
            total += usageLimits.get(i);
            if((k + 1) * (k + 2) / 2 <= total) {
                k++;
            }
        }
        return (int)k;
    }
}
