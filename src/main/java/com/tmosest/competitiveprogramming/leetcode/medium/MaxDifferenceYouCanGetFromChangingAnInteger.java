package com.tmosest.competitiveprogramming.leetcode.medium;

class MaxDifferenceYouCanGetFromChangingAnInteger {

	public int maxDiff(int num) {

		int min = num;
		int max = num;

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
				int change = change(num, i, j);
				
				if (change == 0)
					continue;

				min = Math.min(min, change);
				max = Math.max(max, change);
			}
		}

		return max - min;
	}

	private int change(int num, int x, int y) {
		StringBuilder sb = new StringBuilder();

		char[] digits = String.valueOf(num).toCharArray();

		if (digits[0] - '0' == x && y == 0) {
			return 0;
		}

		for (char digit : digits) {
			
			if (digit - '0' != x) {
				sb.append(digit);
				continue;
			}

			sb.append(y);
		}

		return Integer.parseInt(sb.toString());
	}
}
