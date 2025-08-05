package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.Arrays;

public class PartitionArrayForMaximumXorAndAnd {
	/*
	 * https://leetcode.com/problems/partition-array-for-maximum-xor-and-and/
	 * description/
	 * 
	 * You are given an integer array nums.
	 * 
	 * Partition the array into three (possibly empty) subsequences A, B, and C such
	 * that every element of nums belongs to exactly one subsequence.
	 * 
	 * Your goal is to maximize the value of: XOR(A) + AND(B) + XOR(C)
	 * 
	 * where:
	 * 
	 * XOR(arr) denotes the bitwise XOR of all elements in arr. If arr is empty, its
	 * value is defined as 0.
	 * AND(arr) denotes the bitwise AND of all elements in arr. If arr is empty, its
	 * value is defined as 0.
	 * Return the maximum value achievable.
	 * 
	 * Note: If multiple partitions result in the same maximum sum, you can consider
	 * any one of them.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,3]
	 * 
	 * Output: 5
	 * 
	 * Explanation:
	 * 
	 * One optimal partition is:
	 * 
	 * A = [3], XOR(A) = 3
	 * B = [2], AND(B) = 2
	 * C = [], XOR(C) = 0
	 * The maximum value of: XOR(A) + AND(B) + XOR(C) = 3 + 2 + 0 = 5. Thus, the
	 * answer is 5.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [1,3,2]
	 * 
	 * Output: 6
	 * 
	 * Explanation:
	 * 
	 * One optimal partition is:
	 * 
	 * A = [1], XOR(A) = 1
	 * B = [2], AND(B) = 2
	 * C = [3], XOR(C) = 3
	 * The maximum value of: XOR(A) + AND(B) + XOR(C) = 1 + 2 + 3 = 6. Thus, the
	 * answer is 6.
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [2,3,6,7]
	 * 
	 * Output: 15
	 * 
	 * Explanation:
	 * 
	 * One optimal partition is:
	 * 
	 * A = [7], XOR(A) = 7
	 * B = [2,3], AND(B) = 2
	 * C = [6], XOR(C) = 6
	 * The maximum value of: XOR(A) + AND(B) + XOR(C) = 7 + 2 + 6 = 15. Thus, the
	 * answer is 15.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= nums.length <= 19
	 * 1 <= nums[i] <= 109
	 * 
	 * https://leetcode.com/problems/partition-array-for-maximum-xor-and-and/
	 * solutions/7013450/java-solution-by-following-hints-compute-wp37/
	 */
	public long maximizeXorAndXor(int[] nums) {
		int n = nums.length;

		int[] xor1 = new int[1 << n];
		long[] xor2 = new long[1 << n];
		int[] and = new int[1 << n];

		for (int i = 0; i < n; i++)
			and[1 << i] = xor1[1 << i] = nums[i];
		for (int i = 3; i < xor1.length; i++) {
			int lowest = i & -i;
			if (lowest == i)
				continue;
			xor1[i] = xor1[i - lowest] ^ xor1[lowest];
			and[i] = and[i - lowest] & and[lowest];
		}

		for (int i = 1; i < xor2.length; i++) {
			XORBasisExample.XORBasis basis = new XORBasisExample.XORBasis(32); // 32-bit integers

			// Insert all numbers into the basis
			for (int j = 0; j < n; j++) {
				if (((1 << j) & i) != 0) {
					basis.insert(nums[j] & ~xor1[i]);
				}
			}
			// Compute the maximum XOR subset
			int maxXOR = basis.maxXORSubset();
			xor2[i] = xor1[i] + 2 * maxXOR;
		}
		long res = 0;
		for (int i = 0; i < xor2.length; i++) {
			int maskOfOther = (1 << n) - 1 - i;
			res = Math.max(res, xor2[i] + and[maskOfOther]);
		}
		return res;
	}

	public static class XORBasisExample {

		static class XORBasis {
			private final int[] basis; // Stores the basis for each bit position
			private final int maxBits; // Number of bits (e.g., 32 for integers)

			public XORBasis(int maxBits) {
				this.maxBits = maxBits;
				this.basis = new int[maxBits];
			}

			// Insert a number into the basis
			public void insert(int x) {
				for (int i = maxBits - 1; i >= 0; i--) {
					if ((x >> i & 1) == 1) { // Check if the i-th bit is set
						if (basis[i] == 0) {
							basis[i] = x; // Add to basis if no number exists for this bit
							return;
						} else {
							x ^= basis[i]; // Eliminate the i-th bit using existing basis
						}
					}
				}
			}

			// Compute the maximum XOR subset
			public int maxXORSubset() {
				int maxXOR = 0;
				for (int i = maxBits - 1; i >= 0; i--) {
					if ((maxXOR ^ basis[i]) > maxXOR) {
						maxXOR ^= basis[i]; // Greedily take the best option
					}
				}
				return maxXOR;
			}

			// (Optional) Check if a number can be formed using the basis
			public boolean canForm(int x) {
				for (int i = maxBits - 1; i >= 0; i--) {
					if ((x >> i & 1) == 1) {
						x ^= basis[i];
					}
				}
				return x == 0;
			}
		}

		public static void main(String[] args) {
			int[] nums = { 5, 2, 3, 4, 6 }; // Example array
			XORBasis basis = new XORBasis(32); // 32-bit integers

			// Insert all numbers into the basis
			for (int num : nums) {
				basis.insert(num);
			}

			// Compute the maximum XOR subset
			int maxXOR = basis.maxXORSubset();
			System.out.println("Maximum XOR subset: " + maxXOR); // Output: 7 (5 ^ 2)

			// (Optional) Check if a number can be formed
			System.out.println("Can form 4? " + basis.canForm(4)); // Output: true (5 ^ 1)
			System.out.println("Can form 7? " + basis.canForm(7)); // Output: true (5 ^ 2)
			System.out.println("Can form 8? " + basis.canForm(8)); // Output: false
		}
	}
}
