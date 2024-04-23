package com.tmosest.competitiveprogramming.leetcode.easy;

class LatestTimeYouCanObtainAfterReplacingCharacters {
	/**
	 * https://leetcode.com/problems/latest-time-you-can-obtain-after-replacing-characters/
	 * 
	 * @param s
	 * @return
	 */
	public String findLatestTime(String time) {
		char[] times = time.toCharArray();
		if (times[0] == '?' && times[1] == '?') {
			times[0] = '1';
			times[1] = '1';
		} else if (times[1] == '?') {
			times[1] = times[0] == '0' ? '9' : '1';
		} else if (times[0] == '?') {
			times[0] = times[1] >= '2' ? '0' : '1';
		}
		if (times[3] == '?') {
			times[3] = '5';
		}
		if (times[4] == '?') {
			times[4] = '9';
		}
		return new String(times);
	}
}
