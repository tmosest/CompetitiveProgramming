package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;

class FindTheLengthOfTheLongestCommonPrefix {
	/**
	 * https://leetcode.com/contest/weekly-contest-385/problems/find-the-length-of-the-longest-common-prefix/
	 * 
	 * @param arr1
	 * @param arr2
	 * @return
	 */
	public int longestCommonPrefix(int[] arr1, int[] arr2) {

		HashSet<Integer> set = new HashSet<>();

		for (int val : arr1) {
			String str = val + "";
			int len = str.length();
			for (int i = 0; i < len; i++) {
				int curr = Integer.parseInt(str.substring(0, i + 1));
				set.add(curr);
			}
		}

		int ans = 0;
		for (int val : arr2) {
			String str = val + "";
			int len = str.length();

			for (int i = ans; i < len; i++) {
				int curr = Integer.parseInt(str.substring(0, i + 1));
				if (set.contains(curr)) {
					ans = i + 1;
				}
			}

		}

		return ans;
	}

	public int longestCommonPrefixBruteForce(int[] arr1, int[] arr2) {

		String[] str1 = (String[]) Arrays.stream(arr1).mapToObj(i -> String.valueOf(i)).toArray(String[]::new);
		String[] str2 = (String[]) Arrays.stream(arr2).mapToObj(i -> String.valueOf(i)).toArray(String[]::new);

		int maxLength = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				for (int s = 1; s <= str1[i].length(); s++) {
					String prefix = str1[i].substring(0, s);
					if (str2[j].startsWith(prefix) && prefix.length() > maxLength) {
						maxLength = prefix.length();
					}
				}
			}
		}

		return maxLength;
	}
}
