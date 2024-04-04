package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.HashMap;
import java.util.Map;

class CountBeautifulSubstringsTwo {
	/**
	 * https://leetcode.com/problems/count-beautiful-substrings-ii/
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
    public long beautifulSubstrings(String s, int k) {
        int n = s.length(), v = 0, l = 1;
        while (l * l % (k * 4) > 0) {
            l++;
        }
        String vowels = "aeiou";
        Map<Integer, Integer>[] seen = new HashMap[l];
        for (int i = 0; i < l; i++) {
            seen[i] = new HashMap<>();
        }
        seen[l - 1].put(0, 1);
        long res = 0;
        for (int i = 0; i < n; i++) {
            v += vowels.indexOf(s.charAt(i)) == -1 ? -1 : 1;
            int c = seen[i % l].getOrDefault(v, 0);
            res += c;
            seen[i % l].put(v, c + 1);
        }
        return res;
    }
}
