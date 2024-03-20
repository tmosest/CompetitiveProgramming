package com.tmosest.competitiveprogramming.leetcode.medium;

class DecodeXoredArray {
	/**
	 * https://leetcode.com/contest/weekly-contest-223/problems/decode-xored-array/
	 * @param encoded
	 * @param first
	 * @return
	 */
	public int[] decode(int[] encoded, int first) { 
		int[] result = new int[encoded.length + 1];
		result[0] = first;

		for (int i = 1; i < result.length; i++) {

			for(int j = 0; j < Integer.MAX_VALUE; j++) {

				if ((result[i - 1] ^ j) == encoded[i - 1]) {
					result[i] = j;
					break;
				}
			}

		}

		return result;
	}
}
