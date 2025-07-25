package com.tmosest.competitiveprogramming.leetcode.easy;

class CheckDivisibilityByDigitSumAndProduct {

	public boolean checkDivisibility(int n) {
		ProductSum productSum = new ProductSum(n);
		// System.out.println(String.format("Prod: %d, Sum: %d", productSum.product, productSum.sum));
		return n % (productSum.sum + productSum.product) == 0;
	}

	public static class ProductSum {
		int product = 1;
		int sum = 0;

		public ProductSum(int n)
		{
			while (n > 0) {
				sum += n % 10;
				product *= n % 10;
				n /= 10;
			}
		}
	}
}
