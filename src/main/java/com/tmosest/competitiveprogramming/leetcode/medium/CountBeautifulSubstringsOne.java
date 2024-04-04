package com.tmosest.competitiveprogramming.leetcode.medium;

class CountBeautifulSubstringsOne {
	/**
	 * https://leetcode.com/problems/count-beautiful-substrings-i/description/
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public int beautifulSubstrings(String s, int k) {

		int count = 0;

		String vowels = "aeiou";
		for (int i = 0; i < s.length(); i++) {
			int vowelCount = 0;
			int constCount = 0;

			for (int j = i; j < s.length(); j++) {
				if (vowels.contains("" + s.charAt(j))) {
					vowelCount++;
				} else {
					constCount++;
				}

				long mult = vowelCount * constCount;
				if (vowelCount == constCount && mult % k == 0) {
					++count;
				}
			}
		}

		return count;
	}
}
