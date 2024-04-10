package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

class CountValidPathsInTree {
	private List<Integer>[] G;
	private long ans = 0;

	/**
	 * https://leetcode.com/problems/count-valid-paths-in-a-tree/description/
	 * 
	 * https://leetcode.com/problems/count-valid-paths-in-a-tree/
	 * 
	 * @param n
	 * @param edges
	 * @return
	 */
	public long countPaths(int n, int[][] edges) {
		G = new ArrayList[n + 1];
		for (int i = 0; i <= n; i++) {
			G[i] = new ArrayList<>();
		}
		for (int[] e : edges) {
			G[e[0]].add(e[1]);
			G[e[1]].add(e[0]);
		}
		dfs(1, -1);
		return ans;
	}

	private int[] dfs(int u, int prev) {

		// check if current node is prime
		boolean isp = isPrime(u);

		int primeChildren = 0;
		int nonPrimeChildren = 0;

		for (int v : G[u]) {
			if (v == prev) {
				continue;
			}
			int[] next = dfs(v, u);
			if (isp) {
				// if current is prime
				// combine paths with 0 primes from next child
				// with 0 primes paths from other children seen so far
				// which makes our current prime node the only prime node
				// in the middle of all the paths
				// Also combine again (+1) current node with all 0 primes
				// from next child which makes our current prime node
				// the only prime node at the end of the path
				ans += (nonPrimeChildren + 1) * next[0];
			} else {
				// if current is not prime
				// combine paths with 0 primes from next child with
				// prime paths from other children seen so far
				// our current non prime node will be in the middle
				ans += primeChildren * next[0];
				// combine path with 1 prime paths from next child
				// with 0 primes paths from other children seen so far
				// our current non prime node will be in the middle.
				// Also combine again (+1) 1 prime paths from next child
				// with current node. The current node will be at the end.
				ans += (nonPrimeChildren + 1) * next[1];
			}
			primeChildren += next[1];
			nonPrimeChildren += next[0];
		}

		int[] res = new int[2];

		// 0 index returns number of 0 prime paths. If current node is prime
		// it is impossible to make any 0 prime paths, so return 0/
		// if current node is not prime, all children 0 prime paths will still
		// have 0 primes, also current node start new 0 prime paths.
		res[0] = isp ? 0 : nonPrimeChildren + 1;

		// 1 index returns number of 1 prime paths to the parent.
		// if current node is prime, we can only combine our current
		// with other 0 prime chidlren paths.
		// If current node is not prime, 1 prime children paths will still
		// make the same number of 1 prime paths in combination with current node
		res[1] = isp ? nonPrimeChildren + 1 : primeChildren;
		return res;
	}

	private boolean isPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= Math.sqrt(n); i++)
			if (n % i == 0)
				return false;
		return true;
	}
}
