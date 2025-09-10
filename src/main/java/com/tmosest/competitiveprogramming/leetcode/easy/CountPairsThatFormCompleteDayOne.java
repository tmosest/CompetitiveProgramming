package com.tmosest.competitiveprogramming.leetcode.easy;

class CountPairsThatFormCompleteDayOne {
	/*
	 * 3184. Count Pairs That Form a Complete Day I
	 * 
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
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
	 * Explanation:
	 * 
	 * The pairs of indices that form a complete day are (0, 1) and (3, 4).
	 * 
	 * Example 2:
	 * 
	 * Input: hours = [72,48,24,3]
	 * 
	 * Output: 3
	 * 
	 * Explanation:
	 * 
	 * The pairs of indices that form a complete day are (0, 1), (0, 2), and (1, 2).
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= hours.length <= 100
	 * 1 <= hours[i] <= 109
	 * 
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5319834/brute-force-vs-hashmap-approach-detailed-gv7g/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/6656964/100-beats-easy-to-understand-simple-by-k-8yow/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5319866/brute-force-tutorial-count-pairs-that-fo-gied/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/6791322/java-easy-100-solution-counting-by-ytcho-vg7z/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5319819/simple-java-code-by-ydvaaman-d7qn/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5854992/one-pass-solution-only-one-loop-with-sim-n9e8/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/6374002/easiest-solution-in-java-by-sathurnithy-euhc/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/6363776/solution-in-java-and-c-by-vickyy234-bgby/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5324934/easy-java-solution-beats-100-by-ravikuma-uoqn/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/6229550/1ms-in-java-very-easiest-code-by-galani_-g0io/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/6510789/simple-double-forloop-by-sairangineeni-we4f/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/6252976/beats-97-code-easiest-solution-in-java-u-khv2/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5659892/very-easy-on-solution-understand-in-2-mi-qkc4/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5320056/simple-solution-multiple-approach-easy-e-a9jr/
	 * https://leetcode.com/problems/count-pairs-that-form-a-complete-day-i/
	 * solutions/5319835/easy-solution-beats-100-by-deleted_user-kxe4/
	 */
	/* public int countCompleteDayPairs(int[] hours) */

	public int countCompleteDayPairs(int[] hours) {
		int count = 0;
		int n = hours.length;
		for (int i = 0; i < n; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if ((hours[i] + hours[j]) % 24 == 0) {
					++count;
				}
			}
		}
		return count;
	}
}
