package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MaximumTotalDamageWithSpellCasting {
	/*
	 * 3186. Maximum Total Damage With Spell Casting
	 * 
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * description/
	 * 
	 * A magician has various spells.
	 * 
	 * You are given an array power, where each element represents the damage of a
	 * spell. Multiple spells can have the same damage value.
	 * 
	 * It is a known fact that if a magician decides to cast a spell with a damage
	 * of power[i], they cannot cast any spell with a damage of power[i] - 2,
	 * power[i] - 1, power[i] + 1, or power[i] + 2.
	 * 
	 * Each spell can be cast only once.
	 * 
	 * Return the maximum possible total damage that a magician can cast.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: power = [1,1,3,4]
	 * 
	 * Output: 6
	 * 
	 * Explanation:
	 * 
	 * The maximum possible damage of 6 is produced by casting spells 0, 1, 3 with
	 * damage 1, 1, 4.
	 * 
	 * Example 2:
	 * 
	 * Input: power = [7,1,6,6]
	 * 
	 * Output: 13
	 * 
	 * Explanation:
	 * 
	 * The maximum possible damage of 13 is produced by casting spells 1, 2, 3 with
	 * damage 1, 6, 6.
	 * 
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= power.length <= 105
	 * 1 <= power[i] <= 109
	 * 
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5320446/beats-100-explained-with-video-cjavapyth-di6s/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5323940/6-approaches-by-jay_1410-0lsn/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5319898/dynamic-programming-tutorial-maximum-tot-n5mo/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5319804/simple-dfs-solution-by-0x4c0de-h4j1/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5321288/dp-sorting-either-take-every-occurrence-i8o4x/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5320111/dp-beats-by-mohityadavtx-lbor/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5320557/beats-100-java-dp-memoization-simple-cle-u3ta/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5322681/beats-100-intution-memoization-tabulatio-hd6k/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5321159/java-dpmap-from-recursion-to-optimised-b-ah0m/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5319922/java-dp-solution-by-sudasan3-lsjl/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5321069/dont-know-how-to-optimize-100-beats-java-9ux2/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5323573/on-solutionjava-using-dynamic-programmin-55lb/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5393000/iterative-solution-java-space-complexity-a7l1/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5372079/easy-to-understand-java-solution-by-godo-xyzx/
	 * https://leetcode.com/problems/maximum-total-damage-with-spell-casting/
	 * solutions/5320036/java-top-down-dp-by-robertskonieczny-tnnr/
	 */
	/* public long maximumTotalDamage(int[] power) */
	public long maximumTotalDamage(int[] power) {
		// Step 1: Count the frequency of each damage value
		Map<Integer, Long> damageFrequency = new HashMap<>();
		for (int damage : power) {
			damageFrequency.put(damage, damageFrequency.getOrDefault(damage, 0L) + 1);
		}

		// Step 2: Extract and sort the unique damage values
		List<Integer> uniqueDamages = new ArrayList<>(damageFrequency.keySet());
		Collections.sort(uniqueDamages);

		int totalUniqueDamages = uniqueDamages.size();
		long[] maxDamageDP = new long[totalUniqueDamages];

		// Step 3: Initialize the DP array with the first unique damage
		maxDamageDP[0] = uniqueDamages.get(0) * damageFrequency.get(uniqueDamages.get(0));

		// Step 4: Fill the DP array with the maximum damage calculations
		for (int i = 1; i < totalUniqueDamages; i++) {
			int currentDamageValue = uniqueDamages.get(i);
			long currentDamageTotal = currentDamageValue * damageFrequency.get(currentDamageValue);

			// Initially, consider not taking the current damage
			maxDamageDP[i] = maxDamageDP[i - 1];

			// Find the previous damage value that doesn't conflict with the current one
			int previousIndex = i - 1;
			while (previousIndex >= 0 &&
					(uniqueDamages.get(previousIndex) == currentDamageValue - 1 ||
							uniqueDamages.get(previousIndex) == currentDamageValue - 2 ||
							uniqueDamages.get(previousIndex) == currentDamageValue + 1 ||
							uniqueDamages.get(previousIndex) == currentDamageValue + 2)) {
				previousIndex--;
			}

			// Update the DP value considering the current damage
			if (previousIndex >= 0) {
				maxDamageDP[i] = Math.max(maxDamageDP[i], maxDamageDP[previousIndex] + currentDamageTotal);
			} else {
				maxDamageDP[i] = Math.max(maxDamageDP[i], currentDamageTotal);
			}
		}

		// Return the maximum damage possible
		return maxDamageDP[totalUniqueDamages - 1];
	}
}
