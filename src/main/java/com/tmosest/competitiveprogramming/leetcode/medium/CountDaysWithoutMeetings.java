package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class CountDaysWithoutMeetings {
	/*
	 * https://leetcode.com/problems/count-days-without-meetings/description/
	 * 
	 * You are given a positive integer days representing the total number of days
	 * an employee is available for work (starting from day 1). You are also given a
	 * 2D array meetings of size n where, meetings[i] = [start_i, end_i] represents
	 * the starting and ending days of meeting i (inclusive).
	 * 
	 * Return the count of days when the employee is available for work but no
	 * meetings are scheduled.
	 * 
	 * Note: The meetings may overlap.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: days = 10, meetings = [[5,7],[1,3],[9,10]]
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * There is no meeting scheduled on the 4th and 8th days.
	 * 
	 * Example 2:
	 * 
	 * Input: days = 5, meetings = [[2,4],[1,3]]
	 * 
	 * Output: 1
	 * 
	 * Explanation:
	 * 
	 * There is no meeting scheduled on the 5th day.
	 * 
	 * Example 3:
	 * 
	 * Input: days = 6, meetings = [[1,6]]
	 * 
	 * Output: 0
	 * 
	 * Explanation:
	 * 
	 * Meetings are scheduled for all working days.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= days <= 109
	 * 1 <= meetings.length <= 105
	 * meetings[i].length == 2
	 * 1 <= meetings[i][0] <= meetings[i][1] <= days
	 * 
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6572674/
	 * beats-super-easy-beginners-java-c-c-pyth-oqws/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6571887/
	 * brute-force-optimal-with-hints-c-python-9uq9v/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/5243315/
	 * greedy-merge-intervals-by-fahad06-nv3y/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6944136/
	 * try-brute-force-yourself-by-helloaarav-n4do/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6572326/
	 * python-java-c-simple-solution-by-mrunal_-nxbe/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/5243470/
	 * line-sweep-using-map-all-similar-problem-gcvg/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6571907/
	 * beats-7845-sorting-solution-for-leetcode-hcfi/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6573520/
	 * 100-efficient-way-to-count-free-days-bet-dan0/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6574732/
	 * java-simple-sorting-by-que_ayesha-cv5q/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6572435/1
	 * -pass-interval-clean-simple-explanation-41ep/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6573979/
	 * sorting-simple-logic-beginner-friendly-j-g5dh/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6572616/
	 * optimal-solution-python-java-cpp-on-logn-zlzm/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6572799/
	 * 36-ms-count-days-java-sorting-arrays-by-6ior9/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6575199/
	 * easy-solution-beginner-approach-c-java-b-lj0c/
	 * https://leetcode.com/problems/count-days-without-meetings/solutions/6573055/
	 * 3169-count-days-without-meetings-solutio-4bwb/
	 */
	private int[][] mergeIntervals(int[][] meetings) {
		int length = meetings.length, size = 0;

		for (int i = 0; i < length;) {
			int[] meeting = meetings[i];
			int j = i + 1;
			for (; j < length; j++) {
				// Ignore all subsequent, in-bound interval
				if (meeting[0] <= meetings[j][0] && meeting[1] >= meetings[j][1])
					continue;
				// Merge overlappoing interval
				else if (meeting[0] <= meetings[j][0] && meetings[j][0] - meeting[1] <= 1)
					meeting[1] = meetings[j][1];
				// Exit on first failure since there can be no more overlapping intervals for
				// the selected range
				else
					break;
			}
			// move pointer to the first non-overlapping interval
			i = j;
			meetings[size++] = meeting;
		}

		return Arrays.copyOf(meetings, size);
	}

	public int countDays(int days, int[][] meetings) {
		// Sort ranges in ascending order
		Arrays.sort(meetings, (int[] days1, int[] days2) -> {
			int diff = days1[0] - days2[0];
			if (diff == 0)
				diff = days1[1] - days2[1];
			return diff;
		});

		// Merge all intervals
		meetings = this.mergeIntervals(meetings);

		// Calculate the range of each interval and sum it up
		return days - Arrays.stream(meetings)
				.map((int[] meeting) -> meeting[1] - meeting[0] + 1)
				.reduce(Integer::sum)
				.orElse(0);
	}
}
