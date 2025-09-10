package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

class TenOfKindInDeckOfCards {
	/*
	 * 914. X of a Kind in a Deck of Cards
	 * 
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/description/
	 * 
	 * You are given an integer array deck where deck[i] represents the number
	 * written on the ith card.
	 * 
	 * Partition the cards into one or more groups such that:
	 * 
	 * Each group has exactly x cards where x > 1, and
	 * All the cards in one group have the same integer written on them.
	 * Return true if such partition is possible, or false otherwise.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: deck = [1,2,3,4,4,3,2,1]
	 * Output: true
	 * Explanation: Possible partition [1,1],[2,2],[3,3],[4,4].
	 * Example 2:
	 * 
	 * Input: deck = [1,1,1,2,2,2,3,3]
	 * Output: false
	 * Explanation: No possible partition.
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= deck.length <= 104
	 * 0 <= deck[i] < 104
	 * 
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/176027
	 * /x-of-a-kind-in-a-deck-of-cards-by-leetco-xa3a/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/175845
	 * /cjavapython-greatest-common-divisor-by-l-ibi5/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 7018529/solving-x-of-a-kind-in-a-deck-of-cards-j-fam0/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 6949008/java-beats-100-1-ms-by-teja_1403-7r6w/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 6788069/simple-python-solution-beats-100-by-user-tpn5/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 6753616/c-clear-and-efficient-solution-beats-100-ap4q/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 1277550/c-easy-to-understand-fast-and-efficient-osbhj/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/776795
	 * /c-simple-with-explanations-without-gcd-f-lr3l/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 1929514/easy-step-by-step-explanation-by-juno_11-1a33/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 6739187/java-easy-100-solution-using-gcd-by-ytch-g48g/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 1609224/c-easy-solution-accepted-by-wjeevika-5f5s/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 6699746/simple-c-solution-by-namanverma01-jhbc/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/759833
	 * /java-simple-solution-with-description-by-wyjz/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/
	 * 6666850/greatest-common-divisor-by-khaled-alomar-35pk/
	 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/solutions/285942
	 * /python-faster-than-97-without-in-build-g-7th6/
	 */
	/*
	 * public boolean hasGroupsSizeX(int[] deck) Map<Integer, Integer> count = new
	 * HashMap<>(); for (int num : deck) count.put(num, count.getOrDefault(num, 0) +
	 * 1); int gcd = count.get(deck[0]); for (int val : count.values()) gcd =
	 * gcd(gcd, val);
	 */
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
