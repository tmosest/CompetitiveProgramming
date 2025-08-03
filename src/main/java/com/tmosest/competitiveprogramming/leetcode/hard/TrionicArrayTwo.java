package com.tmosest.competitiveprogramming.leetcode.hard;

class TrionicArrayTwo {
	/*
	 * https://leetcode.com/problems/trionic-array-ii/description/
	 * 
	 * You are given an integer array nums of length n.
	 * 
	 * A trionic subarray is a contiguous subarray nums[l...r] (with 0 <= l < r < n)
	 * for which there exist indices l < p < q < r such that:
	 * 
	 * nums[l...p] is strictly increasing,
	 * nums[p...q] is strictly decreasing,
	 * nums[q...r] is strictly increasing.
	 * Return the maximum sum of any trionic subarray in nums.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [0,-2,-1,-3,0,2,-1]
	 * 
	 * Output: -4
	 * 
	 * Explanation:
	 * 
	 * Pick l = 1, p = 2, q = 3, r = 5:
	 * 
	 * nums[l...p] = nums[1...2] = [-2, -1] is strictly increasing (-2 < -1).
	 * nums[p...q] = nums[2...3] = [-1, -3] is strictly decreasing (-1 > -3)
	 * nums[q...r] = nums[3...5] = [-3, 0, 2] is strictly increasing (-3 < 0 < 2).
	 * Sum = (-2) + (-1) + (-3) + 0 + 2 = -4.
	 * Example 2:
	 * 
	 * Input: nums = [1,4,2,7]
	 * 
	 * Output: 14
	 * 
	 * Explanation:
	 * 
	 * Pick l = 0, p = 1, q = 2, r = 3:
	 * 
	 * nums[l...p] = nums[0...1] = [1, 4] is strictly increasing (1 < 4).
	 * nums[p...q] = nums[1...2] = [4, 2] is strictly decreasing (4 > 2).
	 * nums[q...r] = nums[2...3] = [2, 7] is strictly increasing (2 < 7).
	 * Sum = 1 + 4 + 2 + 7 = 14.
	 * �
	 * 
	 * Constraints:
	 * 
	 * 4 <= n = nums.length <= 105
	 * -109 <= nums[i] <= 109
	 * It is guaranteed that at least one trionic subarray exists.
	 * 
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7044220/java-3ms-
	 * sliding-window-very-easy-by-piy-h1ot/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7044670/easy-java-
	 * code-by-akshat9999-cvh7/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7040093/sliding-
	 * window-approach-java-solution-tc-7ha7/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7040504/just-clean-
	 * on-iteration-explained-beats-y275k/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7038248/beats-100-
	 * easiest-ever-prefix-suffix-arr-r0ji/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7038907/beats-100-2-
	 * pointer-prefix-sum-on-time-s-bgsi/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7038860/easy-
	 * explanation-time-on-and-space-o1-wi-sary/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7048018/dp-explained
	 * -easy-to-understand-time-com-rnjd/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7045325/simple-three
	 * -times-traversal-by-hmhn5qap-vgq7/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7038381/java-4-ms-
	 * easy-solution-by-frankch-ywxv/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7038148/3d-dp-
	 * solution-by-saketcodescribe-5g36/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7038048/simple-
	 * solution-linear-time-beats-100-by-aloy/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7038023/java-on-
	 * brute-force-by-okamipancake-wniw/
	 * https://leetcode.com/problems/trionic-array-ii/solutions/7037990/java-
	 * solution-with-100-beat-by-ansh1411-kitg/
	 */
	public long maxSumTrionic(int[] nums) {

		int n = nums.length;
		long res = -1 * (long) 1e16;

		for (int i = 1; i < n - 2; i++) {

			int a = i; // starting point
			int b = i; // ending point

			long net = nums[a];

			// net decreasing window
			while (b + 1 < n && nums[b + 1] < nums[b]) {
				net += (long) nums[b + 1];
				b++;
			}

			if (b == a)
				continue;

			int c = b; // to store ending point

			long left = 0;
			long right = 0;

			long lx = Integer.MIN_VALUE;
			long rx = Integer.MIN_VALUE;

			// left increasing window
			while (a - 1 >= 0 && nums[a - 1] < nums[a]) {
				left += (long) nums[a - 1];
				lx = Math.max(lx, left);
				a--;
			}

			if (a == i)
				continue;

			// right increasing window
			while (b + 1 < n && nums[b + 1] > nums[b]) {
				right += (long) nums[b + 1];
				rx = Math.max(rx, right);
				b++;
			}

			if (b == c)
				continue;
			i = b - 1;
			res = Math.max(res, lx + rx + net);

		}
		return res;
	}
}
