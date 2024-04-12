package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.List;

class HappyStudents {
	/**
	 * https://leetcode.com/problems/happy-students/description/
	 * 
	 * @param nums
	 * @return
	 */
	public int countWays(List<Integer> nums) {
        int maxVal = nums.size();
        int[] count = new int[maxVal + 1];
        for (int num : nums) {
            count[num]++;
        }
        int numWays = 0;
        int totalStudentsSelected = 0;
        
        if (count[0] == 0) {
            numWays++;
        }
        for (int i = 1; i < maxVal; i++) {
            totalStudentsSelected += count[i - 1];
            if (count[i] == 0 && i == totalStudentsSelected) {
                numWays++;
            } 
        }
        numWays++;
        return numWays;
    }
}
