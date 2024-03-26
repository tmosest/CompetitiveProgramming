package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class FindLongestSpecialSubstringThatOccursThriceTwo {
	/**
	 * https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-ii/description/
	 * 
	 * @param s
	 * @return
	 */
	// Function to find the maximum length of a substring with at least three
	// repeating characters
	public int maximumLength(String s) {
		// Map to store the frequency of each character in the string
		Map<Character, Long> mp = new HashMap<>();

		// Map to store the frequency of each substring in the string
		Map<String, Integer> mpp = new HashMap<>();

		// Counter for consecutive identical characters
		int cnt = 0;

		// Variable to store the current character
		char c = s.charAt(0);

		// Index variable for substring extraction
		int j = 0;

		// Length of the input string
		int n = s.length();

		// Variables to store substrings
		String ns, ns1, ns2, ns3;

		// Iterate through the string
		for (int i = 0; i < n; i++) {
			// Update character frequency
			mp.put(s.charAt(i), mp.getOrDefault(s.charAt(i), 0L) + 1);

			// Check if the current character is the same as the previous one
			if (s.charAt(i) == c) {
				cnt++;
			} else {
				// Extract substring and update its frequency in the map
				ns = s.substring(j, i);
				mpp.put(ns, mpp.getOrDefault(ns, 0) + 1);

				// Handle substrings of length at least 3
				if (ns.length() >= 3) {
					ns1 = s.substring(j, i - 1);
					mpp.put(ns1, mpp.getOrDefault(ns1, 0) + 2);
					ns2 = s.substring(j, i - 2);
					mpp.put(ns2, mpp.getOrDefault(ns2, 0) + 3);
				}

				// Reset counter and update index and current character
				cnt = 1;
				j = i;
				c = s.charAt(i);
			}
		}

		// Process the last substring in the string
		ns = s.substring(j, n);

		// Handle substrings of length at least 3
		if (ns.length() >= 3) {
			ns1 = s.substring(j, n - 1);
			mpp.put(ns1, mpp.getOrDefault(ns1, 0) + 2);
			ns2 = s.substring(j, n - 2);
			mpp.put(ns2, mpp.getOrDefault(ns2, 0) + 3);
		}

		// Update the frequency of the last substring
		mpp.put(s.substring(j, n), mpp.getOrDefault(s.substring(j, n), 0) + 1);

		// Variables to store the final result
		int ans = 0;
		int nns;
		int v;

		// Iterate through the substring frequency map
		for (Map.Entry<String, Integer> entry : mpp.entrySet()) {
			nns = entry.getKey().length();
			v = entry.getValue();

			// Check if the frequency is at least 3, update the result
			if (v >= 3) {
				ans = Math.max(ans, nns);
			}
		}

		// If no substring of length at least 3 is found, check individual characters
		if (ans == 0) {
			for (Map.Entry<Character, Long> entry : mp.entrySet()) {
				if (entry.getValue() >= 3) {
					ans = 1;
					return ans;
				}
			}
		}

		// Return the final result (or -1 if no such substring is found)
		return (ans == 0) ? -1 : ans;
	}
}
