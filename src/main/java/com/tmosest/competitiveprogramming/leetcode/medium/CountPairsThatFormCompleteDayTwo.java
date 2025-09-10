package com.tmosest.competitiveprogramming.leetcode.medium;

class CountPairsThatFormCompleteDayTwo {
	/*
	 * 3185. Count Pairs That Form a Complete Day II
	 * 
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * description/
	 * 
	 * Given an integer array hours representing times in hours, return an integer
	 * denoting the number of pairs i, j where i < j and hours[i] + hours[j] forms a
	 * complete day.
	 * 
	 * A complete day is defined as a time duration that is an exact multiple of 24
	 * hours.
	 * 
	 * For example, 1 day is 24 hours, 2 days is 48 hours, 3 days is 72 hours, and
	 * so on.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: hours = [12,12,30,24,24]
	 * 
	 * Output: 2
	 * 
	 * Explanation: The pairs of indices that form a complete day are (0, 1) and (3,
	 * 4).
	 * 
	 * Example 2:
	 * 
	 * Input: hours = [72,48,24,3]
	 * 
	 * Output: 3
	 * 
	 * Explanation: The pairs of indices that form a complete day are (0, 1), (0,
	 * 2), and (1, 2).
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= hours.length <= 5 * 105
	 * 1 <= hours[i] <= 109
	 * 
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5319811/hash-table-tutorial-count-pairs-that-for-xo5x/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5319980/mapdictionary-remainder-method-explained-itjg/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5319983/hashmap-java-by-ganesh_dandekar-eh49/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5659923/very-easy-solution-do-and-understand-in-7ajgo/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5319932/easy-solution-beats-100-by-deleted_user-k7a6/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/6848112/on-by-gitchuan-0i4a/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5319923/on-approach-most-efficient-by-aiqqia-9070/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5322384/java-fastest-array-only-100-time-on-100s-bj1e/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5324949/easy-java-solution-hashmap-by-ravikumar5-7yju/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5320901/easy-java-map-by-shapunk-h2st/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5319893/easy-java-beginner-solution-by-ravi_prak-ictk/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5320946/vote-it-by-tharundev-k9k4/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/5323244/the-simple-explanation69_beats_100easy-s-56wl/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/6791644/clean-code-by-smileysuneet-y1ii/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-ii/
	 * solutions/6338154/hashmap-java-by-prachikumari-brzy/
	 */
	/* public long countCompleteDayPairs(int[] hours) */
	public long countCompleteDayPairs(int[] hours) {
		long ans = 0;
		int[] count = new int[24];

		for (int i = 0; i < hours.length; i++) {
			ans += count[(24 - hours[i] % 24) % 24];
			count[hours[i] % 24]++;
		}

		return ans;
	}
}
