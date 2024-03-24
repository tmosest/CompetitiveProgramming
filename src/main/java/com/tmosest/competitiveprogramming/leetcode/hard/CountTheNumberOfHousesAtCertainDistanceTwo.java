package com.tmosest.competitiveprogramming.leetcode.hard;

class CountTheNumberOfHousesAtCertainDistanceTwo {
	/**
	 * https://leetcode.com/problems/count-the-number-of-houses-at-a-certain-distance-ii/solutions/4600675/my-dumb-java-code-3-segments-4-cases-prefix/
	 * 
	 * @param n
	 * @param x
	 * @param y
	 * @return
	 */
	public long[] countOfPairs(int n, int x, int y) {
		long[] res = new long[n];
		if (x > y) {
			int tmp = y;
			y = x;
			x = tmp;
		}
		int dist = y - x;
		if (dist == 0 || dist == 1) {
			line(res, n);
			return res;
		}
		if (x != 1 && y != n) {
			// disjoin
			disjoin(res, x - 1, n - y);
		} else if (x != 1 || y != n) {
			// line
			line(res, n - dist);
		}
		// circle
		circle(res, dist + 1);
		if (x != 1) {
			half(res, x - 1, dist / 2);
			half(res, x - 1, dist / 2 + dist % 2);
		}
		if (n != y) {
			half(res, n - y, dist / 2);
			half(res, n - y, dist / 2 + dist % 2);
		}
		return res;
	}

	private static void line(long[] arr, int n) {
		for (int i = 0; i < n; i++) {
			arr[i] += (n - i - 1) * 2;
		}
	}

	private static void circle(long[] arr, int n) {
		int finish = n / 2 - 1, add = 2 * n;
		for (int i = 0; i < finish; i++) {
			arr[i] += add;
		}
		if (n % 2 == 0) {
			arr[finish] += n;
		} else {
			arr[finish] += add;
		}
	}

	private static void half(long[] arr, int f, int s) {
		int min, max, dist = f + s;
		if (f < s) {
			min = f;
			max = s;
		} else {
			min = s;
			max = f;
		}
		for (int i = 1; i < min; i++) {
			arr[i] += 2 * i;
		}
		for (int i = min; i <= max; i++) {
			arr[i] += 2 * min;
		}
		for (int i = max + 1; i < dist; i++) {
			arr[i] += 2 * (dist - i);
		}
	}

	private static void disjoin(long[] arr, int f, int s) {
		// left line
		line(arr, f + 1);
		// right line
		line(arr, s + 1);
		// disjoin
		int min, max, dist = f + s;
		if (f < s) {
			min = f;
			max = s;
		} else {
			min = s;
			max = f;
		}
		for (int i = 1; i < min; i++) {
			arr[i + 1] += 2 * i;
		}
		for (int i = min; i <= max; i++) {
			arr[i + 1] += 2 * min;
		}
		for (int i = max + 1; i < dist; i++) {
			arr[i + 1] += 2 * (dist - i);
		}
	}
}
