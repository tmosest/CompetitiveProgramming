package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

class PeaksInArray {
	/*
	 * 3187. Peaks in Array
	 * 
	 * https://leetcode.com/problems/peaks-in-array/description/
	 * 
	 * A peak in an array arr is an element that is greater than its previous and
	 * next element in arr.
	 * 
	 * You are given an integer array nums and a 2D integer array queries.
	 * 
	 * You have to process queries of two types:
	 * 
	 * queries[i] = [1, li, ri], determine the count of peak elements in the
	 * subarray nums[li..ri].
	 * queries[i] = [2, indexi, vali], change nums[indexi] to vali.
	 * Return an array answer containing the results of the queries of the first
	 * type in order.
	 * 
	 * Notes:
	 * 
	 * The first and the last element of an array or a subarray cannot be a peak.
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [3,1,4,2,5], queries = [[2,3,4],[1,0,4]]
	 * 
	 * Output: [0]
	 * 
	 * Explanation:
	 * 
	 * First query: We change nums[3] to 4 and nums becomes [3,1,4,4,5].
	 * 
	 * Second query: The number of peaks in the [3,1,4,4,5] is 0.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [4,1,4,2,1,5], queries = [[2,2,4],[1,0,2],[1,0,4]]
	 * 
	 * Output: [0,1]
	 * 
	 * Explanation:
	 * 
	 * First query: nums[2] should become 4, but it is already set to 4.
	 * 
	 * Second query: The number of peaks in the [4,1,4] is 0.
	 * 
	 * Third query: The second 4 is a peak in the [4,1,4,2,1].
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 3 <= nums.length <= 105
	 * 1 <= nums[i] <= 105
	 * 1 <= queries.length <= 105
	 * queries[i][0] == 1 or queries[i][0] == 2
	 * For all i that:
	 * queries[i][0] == 1: 0 <= queries[i][1] <= queries[i][2] <= nums.length - 1
	 * queries[i][0] == 2: 0 <= queries[i][1] <= nums.length - 1, 1 <= queries[i][2]
	 * <= 105
	 * 
	 * https://leetcode.com/problems/peaks-in-array/solutions/5319870/segment-tree-
	 * solution-beat-1000-by-mysel-1181/
	 * https://leetcode.com/problems/peaks-in-array/solutions/7044629/fenwick-tree-
	 * java-simple-understand-code-t7z9/
	 * https://leetcode.com/problems/peaks-in-array/solutions/6184659/easy-segment-
	 * tree-solution-by-viraj_pati-gcsu/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5321237/java-yet-
	 * another-segment-tree-solution-b-1bt7/
	 * https://leetcode.com/problems/peaks-in-array/solutions/6993530/easy-java-
	 * fenwick-tree-solution-by-arham-bxxb/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5320380/sqrt-
	 * decomposition-nsqrtn-by-ppwani-lnnw/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5344380/segment-tree-
	 * by-irvifa-z3lk/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5323230/counting-peaks
	 * -in-a-range-by-cregan_wolf-doco/
	 * https://leetcode.com/problems/peaks-in-array/solutions/6946994/java-solution-
	 * using-segment-trees-by-deb-uxk7/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5862002/java-solution-
	 * segment-tree-onlogn-by-har-djak/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5496493/easy-to-
	 * understande-commented-step-by-st-eoiv/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5388746/simple-
	 * solution-segment-tree-by-akash_so-3d2n/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5373314/java-use-
	 * segment-tree-by-biolearning-vdzl/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5337835/peaks-in-array
	 * -using-segment-tree-by-nag-id7h/
	 * https://leetcode.com/problems/peaks-in-array/solutions/5336884/clean-segment-
	 * tree-solution-onlogn-by-kl-qekq/
	 */
	/* public List<Integer> countOfPeaks(int[] nums, int[][] queries) */
	static class SegTree {
		private int size;
		private int[] tree;

		public SegTree(int size) {
			this.size = size;
			this.tree = new int[4 * size];
		}

		public void build(int[] peaks, int node, int start, int end) {
			if (start == end) {
				tree[node] = peaks[start];
			} else {
				int mid = (start + end) / 2;
				build(peaks, 2 * node + 1, start, mid);
				build(peaks, 2 * node + 2, mid + 1, end);
				tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
			}
		}

		public void update(int idx, int node, int start, int end, int val) {
			if (start == end) {
				tree[node] = val;
			} else {
				int mid = (start + end) / 2;
				if (idx <= mid)
					update(idx, 2 * node + 1, start, mid, val);
				else
					update(idx, 2 * node + 2, mid + 1, end, val);

				tree[node] = tree[2 * node + 1] + tree[2 * node + 2];
			}
		}

		public int query(int node, int start, int end, int l, int r) {
			if (start > r || end < l) {
				return 0;
			}

			if (start >= l && end <= r)
				return tree[node];

			int res = 0;
			int mid = (start + end) / 2;
			res += query(2 * node + 1, start, mid, l, r);
			res += query(2 * node + 2, mid + 1, end, l, r);

			return res;
		}
	}

	public List<Integer> countOfPeaks(int[] nums, int[][] queries) {
		int n = nums.length;
		int[] peaks = new int[n];
		List<Integer> ans = new ArrayList<>();

		for (int i = 1; i < n - 1; i++) {
			peaks[i] = nums[i] > nums[i - 1] && nums[i] > nums[i + 1] ? 1 : 0;
		}

		SegTree segTree = new SegTree(n);
		segTree.build(peaks, 0, 0, n - 1);

		for (int[] q : queries) {
			if (q[0] == 1) {
				int start = q[1];
				int end = q[2];
				if (start == end || start + 1 == end) {
					// avoid querying the segtree
					ans.add(0);
				} else {
					ans.add(segTree.query(0, 0, n - 1, start + 1, end - 1));
				}
			} else if (q[0] == 2) {
				int idx = q[1];
				int val = q[2];
				nums[idx] = val;

				int start = Math.max(1, idx - 1);
				int end = Math.min(n - 2, idx + 1);
				for (int i = start; i <= end; i++) {
					int peaksVal = nums[i] > nums[i - 1] && nums[i] > nums[i + 1] ? 1 : 0;
					segTree.update(i, 0, 0, n - 1, peaksVal);
				}
			}
		}

		return ans;
	}
}
