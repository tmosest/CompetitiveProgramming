package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class MinimumJumpsToReachEndViaPrimeTeleportation {
	boolean[] primes;

	// Precompute primes up to 1e6
	public void sieve() {
		int N = (int) 1e6 + 1;
		primes = new boolean[N + 1];
		Arrays.fill(primes, true);
		primes[0] = primes[1] = false;

		for (int i = 2; i * i <= N; i++) {
			if (primes[i]) {
				for (int j = i * i; j <= N; j += i) {
					primes[j] = false;
				}
			}
		}
	}

	/*
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/description/
	 * 
	 * You are given an integer array nums of length n.
	 * 
	 * You start at index 0, and your goal is to reach index n - 1.
	 * 
	 * From any index i, you may perform one of the following operations:
	 * 
	 * Adjacent Step: Jump to index i + 1 or i - 1, if the index is within bounds.
	 * Prime Teleportation: If nums[i] is a prime number p, you may instantly jump
	 * to any index j != i such that nums[j] % p == 0.
	 * Return the minimum number of jumps required to reach index n - 1.
	 * 
	 * �
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [1,2,4,6]
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * One optimal sequence of jumps is:
	 * 
	 * Start at index i = 0. Take an adjacent step to index 1.
	 * At index i = 1, nums[1] = 2 is a prime number. Therefore, we teleport to
	 * index i = 3 as nums[3] = 6 is divisible by 2.
	 * Thus, the answer is 2.
	 * 
	 * Example 2:
	 * 
	 * Input: nums = [2,3,4,7,9]
	 * 
	 * Output: 2
	 * 
	 * Explanation:
	 * 
	 * One optimal sequence of jumps is:
	 * 
	 * Start at index i = 0. Take an adjacent step to index i = 1.
	 * At index i = 1, nums[1] = 3 is a prime number. Therefore, we teleport to
	 * index i = 4 since nums[4] = 9 is divisible by 3.
	 * Thus, the answer is 2.
	 * 
	 * Example 3:
	 * 
	 * Input: nums = [4,6,5,8]
	 * 
	 * Output: 3
	 * 
	 * Explanation:
	 * 
	 * Since no teleportation is possible, we move through 0 ? 1 ? 2 ? 3. Thus, the
	 * answer is 3.
	 * �
	 * 
	 * Constraints:
	 * 
	 * 1 <= n == nums.length <= 105
	 * 1 <= nums[i] <= 106
	 * 
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7013232/stellars-clean-code-video-intuition-appr-
	 * i1b0/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7011288/easy-graph-dijkstra-solution-on-logmax-b-
	 * 5xzu/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7009950/graph-queue-onlogm-by-ankith_kumar-k169/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7009810/seive-of-primes-graphbfs-very-simple-and-
	 * gwmx/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7015322/java-solution-priority-queue-bfs-by-ayus-
	 * voz8/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7013550/easy-java-solution-bfs-sieve-implementat-
	 * d493/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7011222/simple-bfs-traversal-by-anurag_100305-wupx/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7009932/java-solution-by-1729karthik_d-ms28/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7009998/bfs-using-the-priority-queue-by-k_l_sri_-
	 * qxeq/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7028295/java-javascript-typescript-c-c-kotlin-go-
	 * otxo/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7018934/java-back-to-the-front-bfs-approach-with-
	 * nhar/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7017293/java-simple-bfs-implementation-beats-100-
	 * ezqb/
	 * https://leetcode.com/problems/minimum-jumps-to-reach-end-via-prime-
	 * teleportation/solutions/7010216/simple-bfs-by-catchme999-7l54/
	 */
	public int minJumps(int[] nums) {
		int n = nums.length;
		if (primes == null)
			sieve();

		// Map each value to list of indices
		HashMap<Integer, List<Integer>> numToIndices = new HashMap<>();
		int maxVal = 0;
		for (int i = 0; i < n; i++) {
			numToIndices.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
			maxVal = Math.max(maxVal, nums[i]);
		}

		boolean[] visited = new boolean[n];
		visited[0] = true;
		Queue<Integer> q = new LinkedList<>();
		q.add(0);
		int moves = 0;

		while (!q.isEmpty()) {
			int size = q.size();
			for (int s = 0; s < size; s++) {
				int idx = q.poll();
				if (idx == n - 1)
					return moves;

				// Normal neighbors
				if (idx + 1 < n && !visited[idx + 1]) {
					visited[idx + 1] = true;
					q.add(idx + 1);
				}
				if (idx - 1 >= 0 && !visited[idx - 1]) {
					visited[idx - 1] = true;
					q.add(idx - 1);
				}

				// Jump to multiples if nums[idx] is prime
				if (primes[nums[idx]] && numToIndices.containsKey(nums[idx])) {
					int val = nums[idx];
					for (int factor = 1; val * factor <= maxVal; factor++) {
						int mul = val * factor;
						if (!numToIndices.containsKey(mul))
							continue;

						for (int index : numToIndices.get(mul)) {
							if (!visited[index]) {
								visited[index] = true;
								q.add(index);
							}
						}
						numToIndices.remove(mul); // ✅ Optimization: remove processed value
					}
				}
			}
			moves++;
		}
		return -1;
	}
}
