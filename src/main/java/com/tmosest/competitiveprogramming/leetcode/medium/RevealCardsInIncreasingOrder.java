package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;

class RevealCardsInIncreasingOrder {
	/**
	 * https://leetcode.com/problems/reveal-cards-in-increasing-order/description/
	 * 
	 * @param deck
	 * @return
	 */
	public int[] deckRevealedIncreasing(int[] deck) {
		int[] result = new int[deck.length];

		Arrays.sort(deck);

		return everyOther(deck, result, 0, 0, false);
	}

	private int[] everyOther(int[] deck, int[] result, int indexInDeck, int indexInResult, boolean skip) {
		int N = deck.length;

		if (indexInDeck == N) {
			return result;
		}

		while (indexInResult < N) {
			if (result[indexInResult] == 0) {
				if (!skip) {
					result[indexInResult] = deck[indexInDeck];
					indexInDeck++;
				}
				skip = !skip;
			}
			indexInResult++;
		}

		return everyOther(deck, result, indexInDeck, 0, skip);
	}

	public int[] deckRevealedIncreasingDefault(int[] deck) {

		int[] result = new int[deck.length];
		boolean skip = false;
		int indexInDeck = 0;
		int indexInResult = 0;

		Arrays.sort(deck);

		while (indexInDeck < deck.length) {
			// There is an available gap in result
			if (result[indexInResult] == 0) {

				// Add a card to result
				if (!skip) {
					result[indexInResult] = deck[indexInDeck];
					indexInDeck++;
				}

				// Toggle skip to alternate between adding and skipping cards
				skip = !skip;
			}
			// Progress to next index of result array
			indexInResult = (indexInResult + 1) % deck.length;
		}
		return result;
	}
}
