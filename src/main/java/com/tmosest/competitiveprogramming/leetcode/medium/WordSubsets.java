package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class WordSubsets {
	/*
	 * 916. Word Subsets
	 * 
	 * https://leetcode.com/problems/word-subsets/description/
	 * 
	 * You are given two string arrays words1 and words2.
	 * 
	 * A string b is a subset of string a if every letter in b occurs in a including
	 * multiplicity.
	 * 
	 * For example, "wrr" is a subset of "warrior" but is not a subset of "world".
	 * A string a from words1 is universal if for every string b in words2, b is a
	 * subset of a.
	 * 
	 * Return an array of all the universal strings in words1. You may return the
	 * answer in any order.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 =
	 * ["e","o"]
	 * 
	 * Output: ["facebook","google","leetcode"]
	 * 
	 * Example 2:
	 * 
	 * Input: words1 = ["amazon","apple","facebook","google","leetcode"], words2 =
	 * ["lc","eo"]
	 * 
	 * Output: ["leetcode"]
	 * 
	 * Example 3:
	 * 
	 * Input: words1 = ["acaac","cccbb","aacbb","caacc","bcbbb"], words2 =
	 * ["c","cc","b"]
	 * 
	 * Output: ["cccbb"]
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= words1.length, words2.length <= 104
	 * 1 <= words1[i].length, words2[i].length <= 10
	 * words1[i] and words2[i] consist only of lowercase English letters.
	 * All the strings of words1 are unique.
	 * 
	 * https://leetcode.com/problems/word-subsets/solutions/6257553/memsetfreq-
	 * detailed-solution-by-sumeet_s-07xg/
	 * https://leetcode.com/problems/word-subsets/solutions/6258168/simple-brute-
	 * force-solution-c-java-pytho-v2wb/
	 * https://leetcode.com/problems/word-subsets/solutions/6258094/beats-100-array-
	 * max-freq-in-words2-solut-u2om/
	 * https://leetcode.com/problems/word-subsets/solutions/6257618/max-frequency-
	 * for-each-character-on-m-c-245ad/
	 * https://leetcode.com/problems/word-subsets/solutions/6257966/easy-to-
	 * understand-frequency-aggregation-b4ee/
	 * https://leetcode.com/problems/word-subsets/solutions/2352794/c-java-python-
	 * full-explanations-with-com-yos7/
	 * https://leetcode.com/problems/word-subsets/solutions/6261620/clean-
	 * explanation-beats-100-runtime-cpy3-q5j2/
	 * https://leetcode.com/problems/word-subsets/solutions/6257778/most-optimized-
	 * python-solution-for-word-yvg6w/
	 * https://leetcode.com/problems/word-subsets/solutions/1128456/java-100-faster-
	 * by-himanshuchhikara-207j/
	 * https://leetcode.com/problems/word-subsets/solutions/6260541/easy-beats-9244-
	 * java-optimal-tc-onm-sc-o-zw2c/
	 * https://leetcode.com/problems/word-subsets/solutions/6260878/beats-super-easy
	 * -beginners-by-codewithsp-aepc/
	 * https://leetcode.com/problems/word-subsets/solutions/6583443/easy-to-
	 * understand-by-omesh987-nvcs/
	 * https://leetcode.com/problems/word-subsets/solutions/6258822/java-solution-
	 * using-hashmap-by-ruch21-4rmd/
	 * https://leetcode.com/problems/word-subsets/solutions/6257928/java-hash-table-
	 * easy-by-mani-26-3qho/
	 * https://leetcode.com/problems/word-subsets/solutions/6258685/simplest-
	 * approach-by-shoaib94577-rpx7/
	 */
	/* public List<String> wordSubsets(String[] words1, String[] words2) */
	public List<String> wordSubsets(String[] words1, String[] words2) {
		int l1 = words1.length;
		int l2 = words2.length;
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < l2; i++) {
			HashMap<Character, Integer> wordhm = wordhm(words2[i]);
			updatehm(hm, wordhm);
		}
		List<String> list = new ArrayList<>();
		for (int i = 0; i < l1; i++) {
			if (isuniversal(words1[i], hm))
				list.add(words1[i]);
		}
		return list;
	}

	public static boolean isuniversal(String s, HashMap<Character, Integer> hm) {
		int l = s.length();
		HashMap<Character, Integer> wordhm = wordhm(s);
		for (char ch : hm.keySet()) {
			if (wordhm.getOrDefault(ch, 0) < hm.get(ch))
				return false;
		}
		return true;
	}

	public static void updatehm(HashMap<Character, Integer> hm1, HashMap<Character, Integer> hm2) {
		for (char ch : hm2.keySet()) {
			if (hm2.get(ch) > hm1.getOrDefault(ch, 0)) {
				hm1.put(ch, hm2.get(ch));
			}
		}
	}

	public static HashMap<Character, Integer> wordhm(String s) {
		int l = s.length();
		HashMap<Character, Integer> hm = new HashMap<>();
		for (int i = 0; i < l; i++) {
			char ch = s.charAt(i);
			hm.put(ch, hm.getOrDefault(ch, 0) + 1);
		}
		return hm;
	}
}
