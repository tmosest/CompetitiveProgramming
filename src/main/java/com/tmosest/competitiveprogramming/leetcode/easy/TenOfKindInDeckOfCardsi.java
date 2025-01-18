package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class TenOfKindInDeckOfCardsi {

	public boolean hasGroupsSizeX(int[] deck) {
		
		Map<Integer, Integer> count = new HashMap<>();
		
		for (int num : deck) {
			count.put(num, count.getOrDefault(num, 0) + 1);
		}

		int gcd = count.get(deck[0]);

		for (int val : count.values()) {
			gcd = gcd(gcd, val);
		}

		if (gcd < 2) {
			return false;
		}

		return true;
	}

	// Function to return gcd of a and b
    private int gcd(int a, int b) {
        // Find Minimum of a and b
        int result = Math.min(a, b);
        while (result > 0) {
            if (a % result == 0 && b % result == 0) {
                break;
            }
            result--;
        }

        // Return gcd of a and b
        return result;
    }
}
