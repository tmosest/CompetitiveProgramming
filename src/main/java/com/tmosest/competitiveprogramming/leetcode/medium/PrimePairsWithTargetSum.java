package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class PrimePairsWithTargetSum {
	/**
	 * https://leetcode.com/problems/prime-pairs-with-target-sum/
	 * 
	 * @param n
	 * @return
	 */
	public List<List<Integer>> findPrimePairs(int n) {
		SortedSet<Integer> primes = primes(n);

		List<List<Integer>> result = new ArrayList<>();

		for (int prime : primes) {
			if (prime > n / 2) {
				continue;
			}
			int other = n - prime;
			if (primes.contains(other)) {
				List<Integer> list = new ArrayList<>();
				list.add(prime);
				list.add(other);
				result.add(list);
			}
		}

		return result;
	}

	private SortedSet<Integer> primes(int n) {
		SortedSet<Integer> primes = new TreeSet<>(); 

		boolean[] primesArray = new boolean[n + 1];

		for (int i = 2; i * i < primesArray.length; i++) {
			if (!primesArray[i]) {
				for (int j = 2; j * i < primesArray.length; j++) {
					primesArray[i * j] = true;
				}
			}
		}

		for (int i = 2; i < primesArray.length; i++) {
			if (!primesArray[i]) {
				primes.add(i);
			}
		}

		return primes;
	}
}
