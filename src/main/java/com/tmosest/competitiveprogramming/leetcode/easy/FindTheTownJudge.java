package com.tmosest.competitiveprogramming.leetcode.easy;

class FindTheTownJudge {
	/**
	 * In a town, there are n people labeled from 1 to n. There is a rumor that one
	 * of these people is secretly the town judge.
	 * If the town judge exists, then:
	 * 
	 * 1. The town judge trusts nobody.
	 * 2. Everybody (except for the town judge) trusts the town judge.
	 * 3. There is exactly one person that satisfies properties 1 and 2.
	 * 
	 * You are given an array trust where trust[i] = [ai, bi] representing that the
	 * person labeled ai trusts the person labeled bi.
	 * If a trust relationship does not exist in trust array, then such a trust
	 * relationship does not exist.
	 * 
	 * @param n     The number of people in the town
	 * @param trust A matrix with trust relationships.
	 * @return Return the label of the town judge if the town judge exists and can
	 *         be identified, or return -1 otherwise.
	 */
	public int findJudge(int N, int[][] trust) {

		if (trust.length < N - 1) {
			return -1;
		}

		int[] trustScores = new int[N + 1];

		for (int[] relation : trust) {
			trustScores[relation[0]]--;
			trustScores[relation[1]]++;
		}

		for (int i = 1; i <= N; i++) {
			if (trustScores[i] == N - 1) {
				return i;
			}
		}
		return -1;
	}
}
