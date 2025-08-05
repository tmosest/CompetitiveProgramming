package com.tmosest.competitiveprogramming.leetcode.hard;

class FindSubarrayWithBitwiseOrClosestTo {
	/*
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * description/
	 * 
	 * You are given an array nums and an integer k. You need to find a subarray of
	 * nums such that the absolute difference between k and the bitwise OR of the
	 * subarray elements is as small as possible. In other words, select a subarray
	 * nums[l..r] such that |k - (nums[l] OR nums[l + 1] ... OR nums[r])| is
	 * minimum.
	 * 
	 * Return the minimum possible value of the absolute difference.
	 * 
	 * A subarray is a contiguous non-empty sequence of elements within an array.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,4,5], k = 3
	 * 
	 * Output: 0
	 * 
	 * Explanation:
	 * 
	 * The subarray nums[0..1] has OR value 3, which gives the minimum absolute
	 * difference |3 - 3| = 0.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,3,1,3], k = 2
	 * 
	 * Output: 1
	 * 
	 * Explanation:
	 * 
	 * The subarray nums[1..1] has OR value 3, which gives the minimum absolute
	 * difference |3 - 2| = 1.
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [1], k = 10
	 * 
	 * Output: 9
	 * 
	 * Explanation:
	 * 
	 * There is a single subarray with OR value 1, which gives the minimum absolute
	 * difference |10 - 1| = 9.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 105
	 * 1 <= nums[i] <= 109
	 * 1 <= k <= 109
	 * 
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/6942862/easiest-solution-using-two-sets-by-ashu_-a4di/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5256239/javacpython-bits-by-lee215-sl42/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5244268/sliding-window-with-frequency-of-bits-ja-2dbb/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5244211/dp-concept-used-here-fast-and-accurate-t-gkju/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5243855/using-simple-sliding-window-approach-wit-8lp4/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5449682/easy-solution-by-krrishnichanii-r57o/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5674513/set-solution-beats-100-by-its_shiv43-g5cw/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5333482/sliding-window-java-ono32-by-wangcai20-b2iz/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5246275/efficient-subarray-bitwise-and-solution-he8bu/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5244193/100-minimum-difference-in-subarray-with-hr1sn/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5244167/solution-using-hashset-by-sajaltiwari007-r8w0/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5251211/solution-by-dare2solve-full-explanation-t0rtm/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/6287923/hashing-java-full-explaination-by-prachi-yqo6/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5283187/sliding-window-approach-but-not-the-best-3b2d/
	 * https://leetcode.com/problems/find-subarray-with-bitwise-or-closest-to-k/
	 * solutions/5256327/easy-on-with-hashset-by-asavershin-si9v/
	 */
	public int minimumDifference(int[] nums, int k) {
		int leftPoi = 0;
		int index = 0;
		int minDiff = Integer.MAX_VALUE;
		int[] mapping = new int[32];
		int ORres = 0;
		int n = nums.length;
		while (index < n) {
			addEle(mapping, nums[index]);
			ORres = calcORres(mapping);
			minDiff = Math.min(minDiff, Math.abs(k - ORres));
			while (leftPoi < index && ORres > k) {
				remEle(mapping, nums[leftPoi]);
				ORres = calcORres(mapping);
				minDiff = Math.min(minDiff, Math.abs(k - ORres));
				if (minDiff == 0)
					return 0;
				leftPoi++;
			}
			if (minDiff == 0)
				return 0;
			index++;
		}
		return minDiff;
	}

	public void addEle(int[] mapping, int ele) {
		for (int i = 0; i < 32; i++) {
			if (((1 << i) & ele) != 0) { // checking if the bit is set or not.
				mapping[i]++;
			}
		}
		return;
	}

	public void remEle(int[] mapping, int ele) {
		for (int i = 0; i < 32; i++) {
			if (((1 << i) & ele) != 0) { // checking if the bit is set or not.
				mapping[i]--;
			}
		}
		return;
	}

	public int calcORres(int[] mapping) {
		int ORres = 0;
		for (int i = 0; i < 32; i++) {
			if (mapping[i] > 0) {
				ORres |= (1 << i);
			}
		}
		return ORres;
	}
}
