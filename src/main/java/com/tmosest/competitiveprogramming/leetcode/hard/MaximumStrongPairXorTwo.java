package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;

class MaximumStrongPairXorTwo {
	/**
	 * https://leetcode.com/problems/maximum-strong-pair-xor-ii/description/
	 * 
	 * https://leetcode.com/problems/maximum-strong-pair-xor-ii/solutions/4278549/c-java-python-javascript-easy-approach-explained/
	 * 
	 * @param nums
	 * @return
	 */
	public int maximumStrongPairXor(int[] nums) {
		Arrays.sort(nums);

		int n = nums.length;

		Trie t = new Trie((int) (Math.log(nums[n - 1]) / Math.log(2)));

		int i = 0;
		int j = 0;

		int maxXor = 0;

		while (j < n) {
			t.insert(nums[j], j);

			int half = (int) (Math.ceil(nums[j] / 2.0));

			while (nums[i] < half) {
				i++;
			}

			maxXor = Math.max(maxXor, t.getMaxXor(nums[j], i));

			j++;
		}

		return maxXor;
	}

	private static class Trie {
		class Node {
			Node child0;
			Node child1;
			int lastIdx;
		}

		Node head;
		int maxBit;

		Trie(int maxBit) {
			this.maxBit = maxBit;
			head = new Node();
		}

		void insert(int num, int idx) {
			Node temp = head;

			int i = maxBit;

			while (i >= 0) {
				int bit = (num & (1 << i));

				if (bit == 0) {
					if (temp.child0 == null) {
						temp.child0 = new Node();
					}

					temp = temp.child0;
				} else {
					if (temp.child1 == null) {
						temp.child1 = new Node();
					}

					temp = temp.child1;
				}

				temp.lastIdx = idx;
				i--;
			}
		}

		int getMaxXor(int num, int minIdx) {
			Node temp = head;

			int i = maxBit;
			int maxXor = 0;

			while (i >= 0) {

				int bit = (num & (1 << i));

				if (bit == 0) {
					if (temp.child1 != null && temp.child1.lastIdx >= minIdx) {
						temp = temp.child1;
						maxXor = (maxXor | (1 << i));
					} else
						temp = temp.child0;
				} else {
					if (temp.child0 != null && temp.child0.lastIdx >= minIdx) {
						temp = temp.child0;
						maxXor = (maxXor | (1 << i));
					} else
						temp = temp.child1;
				}

				i--;
			}

			return maxXor;
		}
	}
}
