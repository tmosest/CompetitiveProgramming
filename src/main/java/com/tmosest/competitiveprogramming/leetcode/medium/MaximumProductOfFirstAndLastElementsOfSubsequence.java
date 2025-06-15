package com.tmosest.competitiveprogramming.leetcode.medium;

class MaximumProductOfFirstAndLastElementsOfSubsequence {

	public long maximumProduct(int[] nums, int m) {
        int n = nums.length;
        long ans = Long.MIN_VALUE;

        if (m == 1) {
            for (int x : nums) {
                ans = Math.max(ans, 1L * x * x);
            }
            return ans;
        }

        long maxi = Long.MIN_VALUE;
        long mini = Long.MAX_VALUE;

        for (int j = m - 1; j < n; j++) {
            int i = j - m + 1;
            maxi = Math.max(maxi, nums[i]);
            mini = Math.min(mini, nums[i]);

            long prod1 = maxi * nums[j];
            long prod2 = mini * nums[j];
            ans = Math.max(ans, Math.max(prod1, prod2));
        }

        return ans;
    }
}
