package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class MinimumCostToConvertStringOne {
	/**
	 * https://leetcode.com/problems/minimum-cost-to-convert-string-i/description/
	 * 
	 * https://leetcode.com/problems/minimum-cost-to-convert-string-i/solutions/4565139/floyd-warshall-algorithm-easy-to-understand-beats-93-java/
	 * 
	 * Floyd Warshall Algorithm
	 * 
	 * @param source
	 * @param target
	 * @param original
	 * @param changed
	 * @param cost
	 * @return
	 */
	public long minimumCost(String inputText, String desiredText, char[] fromLetters, char[] toLetters,
			int[] transformationCost) {
		int alphabetSize = 26;
		int[][] transformationMatrix = new int[alphabetSize][alphabetSize];

		for (int idx = 0; idx < alphabetSize; idx++) {
			Arrays.fill(transformationMatrix[idx], Integer.MAX_VALUE);
			transformationMatrix[idx][idx] = 0;
		}

		int i = 0;
		while (i < fromLetters.length) {
			int origChar = fromLetters[i] - 'a';
			int newChar = toLetters[i] - 'a';
			int changeCost = transformationCost[i];

			transformationMatrix[origChar][newChar] = Math.min(transformationMatrix[origChar][newChar], changeCost);
			i++;
		}

		int k = 0;
		do {
			for (int row = 0; row < alphabetSize; row++) {
				for (int col = 0; col < alphabetSize; col++) {
					if (transformationMatrix[row][k] != Integer.MAX_VALUE
							&& transformationMatrix[k][col] != Integer.MAX_VALUE) {
						transformationMatrix[row][col] = Math.min(transformationMatrix[row][col],
								transformationMatrix[row][k] + transformationMatrix[k][col]);
					}
				}
			}
			k++;
		} while (k < alphabetSize);

		long totalCost = 0;
		for (int pos = 0; pos < inputText.length(); pos++) {
			int startChar = inputText.charAt(pos) - 'a';
			int endChar = desiredText.charAt(pos) - 'a';
			if (startChar == endChar) {
				continue;
			}
			if (transformationMatrix[startChar][endChar] == Integer.MAX_VALUE) {
				return -1;
			} else {
				totalCost += transformationMatrix[startChar][endChar];
			}
		}

		return totalCost;
	}
}
