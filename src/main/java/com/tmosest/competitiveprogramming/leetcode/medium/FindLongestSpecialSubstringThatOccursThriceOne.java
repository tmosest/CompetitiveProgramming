package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashMap;
import java.util.Map;

class FindLongestSpecialSubstringThatOccursThriceOne {
	/**
	 * https://leetcode.com/problems/find-longest-special-substring-that-occurs-thrice-i/description/
	 * 
	 * @param s
	 * @return
	 */
	public int maximumLength(String s) {
		Map<String, Integer> map = new HashMap<>();
		
		int n = s.length();
		
		for (int i = 0; i < n; i++) {
			String str = "";
			for (int j = i; j < n; j++) {
				str += s.charAt(j);
				if (special(str)) {
					if (map.containsKey(str))
						map.put(str, map.get(str) + 1);
					else
						map.put(str, 1);
				}
			}
		}
		
		int max = -1;
		
		for (String s1 : map.keySet()) {
			if (map.get(s1) > 2)
				max = Math.max(max, s1.length());
		}
		
		return max;
	}

	private boolean special(String str) {
		for (int i = 0; i < str.length() - 1; i++) {
			if (str.charAt(i) != str.charAt(i + 1))
				return false;
		}
		return true;
	}
}
