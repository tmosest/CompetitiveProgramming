package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumBalancedShipments {
	/*
	 * https://leetcode.com/problems/maximum-balanced-shipments/description/
	 * 
	 * You are given an integer array weight of length n, representing the weights
	 * of n parcels arranged in a straight line. A shipment is defined as a
	 * contiguous subarray of parcels. A shipment is considered balanced if the
	 * weight of the last parcel is strictly less than the maximum weight among all
	 * parcels in that shipment.
	 * 
	 * Select a set of non-overlapping, contiguous, balanced shipments such that
	 * each parcel appears in at most one shipment (parcels may remain unshipped).
	 * 
	 * Return the maximum possible number of balanced shipments that can be formed.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: weight = [2,5,1,4,3]
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * We can form the maximum of two balanced shipments as follows:
	 * 
	 * Shipment 1: [2, 5, 1]
	 * Maximum parcel weight = 5
	 * Last parcel weight = 1, which is strictly less than 5. Thus, it's balanced.
	 * Shipment 2: [4, 3]
	 * Maximum parcel weight = 4
	 * Last parcel weight = 3, which is strictly less than 4. Thus, it's balanced.
	 * It is impossible to partition the parcels to achieve more than two balanced
	 * shipments, so the answer is 2.
	 * 
	 * Example 2:
	 * 
	 * Input: weight = [4,4]
	 * 
	 * Output: 0
	 * 
	 * Explanation:
	 * 
	 * No balanced shipment can be formed in this case:
	 * 
	 * A shipment [4, 4] has maximum weight 4 and the last parcel's weight is also
	 * 4, which is not strictly less. Thus, it's not balanced.
	 * Single-parcel shipments [4] have the last parcel weight equal to the maximum
	 * parcel weight, thus not balanced.
	 * As there is no way to form even one balanced shipment, the answer is 0.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 2 <= n <= 105
	 * 1 <= weight[i] <= 109
	 * 
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7038409/
	 * easiest-greedy-approach-by-la_castille-nmu2/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7037945/
	 * javacpython-easy-and-concise-by-lee215-bmx0/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7038783/
	 * balanced-shipment-problem-greedy-grab-an-uthm/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7048338/
	 * easy-greedy-solution-very-intuitive-by-s-pi1j/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7043486/
	 * easy-solution-in-java-10-line-code-by-ku-el3d/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7040668/
	 * easiest-solution-using-greedy-on-optimal-tmtd/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7038190/
	 * java-solution-greedy-approach-beats-100-g8uou/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7040521/
	 * one-pass-greedy-by-sampath_k29-b6e8/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7038035/
	 * single-pass-solution-on-by-ankith_kumar-d8w6/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7041087/
	 * easy-2-line-solution-by-rimji-1dwy/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7040775/
	 * java-beats-100-on-time-by-aryanajwani-dxp1/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7038611/
	 * insane-java-solution-by-vishall001-wom9/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7039235/
	 * 100-beats-greedy-solution-for-3638-maxim-8wbc/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7038459/
	 * simple-solution-beat-100-by-arinyadav98g-f9bc/
	 * https://leetcode.com/problems/maximum-balanced-shipments/solutions/7038321/
	 * simple-java-by-bhimanshu7-neyk/
	 */
	public int maxBalancedShipments(int[] weight) {
		int prev = 0;
		int res = 0;

		for (int w : weight) {
			if (w < prev) {
				res++;
				prev = 0;
			} else {
				prev = w;
			}
		}

		return res;
	}
}
