package com.tmosest.competitiveprogramming.leetcode.medium;

class LexicographicallySmallestStringAfterOperationsWithConstraint {
	/**
	 * https://leetcode.com/problems/lexicographically-smallest-string-after-operations-with-constraint/description/
	 * 
	 * @param s
	 * @param k
	 * @return
	 */
	public String getSmallestString(String s, int k) {
        
        if (k == 0) {
            return s;
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            int val = letter - 'a';
            if (val == 0 || k == 0) {
                sb.append(letter);
                continue;
            }
			// Check if subtracting is better than adding.
            if (val < 25 - val) {
                if (val - k < 0) {
                    sb.append('a');
                    k -= val;
                } else {
                    sb.append((char) (letter - k));
                    k = 0;
                }
                continue;
            }
			// Check if we can add to get to 'a'.
            if (val + k > 25) {
                sb.append('a');
                k -= 'z' - 'a' - val + 1;
                continue;
            }
			// Use left over changes if we have any.
            if (k > 0) {
                if (val - k < 0) {
                    sb.append('a');
                    k -= val;
                } else {
                    sb.append((char) (letter - k));
                    k = 0;
                }
            }
        }
        
        return sb.toString();
    }
}
