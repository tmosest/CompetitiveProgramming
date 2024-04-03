package com.tmosest.competitiveprogramming.leetcode.medium;

class WordSearch {
	/**
	 * https://leetcode.com/problems/word-search/
	 * 
	 * @param board
	 * @param word
	 * @return
	 */
	public boolean exist(char[][] board, String word) {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (search(i, j, board, word)) {
					return true;
				}
			}
		}
		return false;
	}

	public boolean search(int i, int j, char[][] board, String word) {
		if (word.length() == 0) {
			return true;
		}
		if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || board[i][j] == '-') {
			return false;
		}
		char temp = board[i][j];
		char letter = word.charAt(0);

		if (temp != letter) {
			return false;
		}

		board[i][j] = '-';
		boolean result = false;
		String toSearch = word.substring(1, word.length());

		if (search(i - 1, j, board, toSearch)) {
			result = true;
			return result;
		}

		if (search(i + 1, j, board, toSearch)) {
			result = true;
			return result;
		}

		if (search(i, j - 1, board, toSearch)) {
			result = true;
			return result;
		}

		if (search(i, j + 1, board, toSearch)) {
			result = true;
			return result;
		}

		board[i][j] = temp;

		return result;
	}
}
