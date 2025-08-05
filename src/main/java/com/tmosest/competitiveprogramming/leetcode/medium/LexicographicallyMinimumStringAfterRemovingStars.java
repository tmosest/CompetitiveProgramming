package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayDeque;
import java.util.Deque;

class LexicographicallyMinimumStringAfterRemovingStars {
	/*
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/description/
	 * 
	 * You are given a string s. It may contain any number of '*' characters. Your
	 * task is to remove all '*' characters.
	 * 
	 * While there is a '*', do the following operation:
	 * 
	 * Delete the leftmost '*' and the smallest non-'*' character to its left. If
	 * there are several smallest characters, you can delete any of them.
	 * Return the lexicographically smallest resulting string after removing all '*'
	 * characters.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: s = "aaba*"
	 * 
	 * Output: "aab"
	 * 
	 * Explanation:
	 * 
	 * We should delete one of the 'a' characters with '*'. If we choose s[3], s
	 * becomes the lexicographically smallest.
	 * 
	 * Example 2:
	 * 
	 * Input: s = "abc"
	 * 
	 * Output: "abc"
	 * 
	 * Explanation:
	 * 
	 * There is no '*' in the string.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= s.length <= 105
	 * s consists only of lowercase English letters and '*'.
	 * The input is generated such that it is possible to delete all '*' characters.
	 * 
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6818352/cpp-java-python-greedy-100-beats-easy-to-eo6q/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6818111/using-min-heaps-with-images-example-walk-f0ng/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6820003/beats-without-heap-super-easy-beginners-flezs/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6819034/100-beat-onlogn-on-priority-queue-to-sta-0314/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6818363/its-just-simple-just-use-stack-vector-an-0idg/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/5243299/on-min-heap-with-indices-vector-with-dry-m0d1/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6819162/fast-and-clear-with-iterations-in-tables-9qhv/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/5243492/on-26-simple-greedy-solution-c-java-pyth-q37v/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6818536/easiest-solution-detail-explanation-beat-gxor/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6826184/easy-code-in-java-using-priority-queue-b-371l/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6818326/java-beats-greedy-by-aryanmsharma-b7v6/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6820493/super-easy-solution-by-prathmeshjejurkar-2kqa/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6819346/brute-force-solution-java-by-shastrii-ew8n/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6818886/solution-of-lexicographically-minimum-st-xucs/
	 * https://leetcode.com/problems/lexicographically-minimum-string-after-removing
	 * -stars/solutions/6819819/easy-solution-java-custom-pair-class-by-p77vb/
	 */
	public String clearStars(String s) {
		Deque<Integer>[] cnt = new Deque[26];
		for (int i = 0; i < 26; i++) {
			cnt[i] = new ArrayDeque<>();
		}
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != '*') {
				cnt[arr[i] - 'a'].push(i);
			} else {
				for (int j = 0; j < 26; j++) {
					if (!cnt[j].isEmpty()) {
						arr[cnt[j].pop()] = '*';
						break;
					}
				}
			}
		}

		StringBuilder ans = new StringBuilder();
		for (char c : arr) {
			if (c != '*') {
				ans.append(c);
			}
		}
		return ans.toString();
	}
}
