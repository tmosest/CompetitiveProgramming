package com.tmosest.competitiveprogramming.leetcode.hard;

import java.util.ArrayList;
import java.util.List;

class TrappingRainWater {
	/**
	 * https://leetcode.com/problems/trapping-rain-water/description/?envType=daily-question&envId=2024-04-12
	 * 
	 * @param height
	 * @return
	 */
	public int trap(int[] height) {
		int left = 0;
		int right = height.length - 1;

		int ans = 0;

		int leftMax = 0;
		int rightMax = 0;

		while (left < right) {
			if (height[left] < height[right]) {
				if (height[left] >= leftMax) {
					leftMax = height[left];
				} else {
					ans += (leftMax - height[left]);
				}
                ++left;
			} else {
				if (height[right] >= rightMax) {
					rightMax = height[right];
				} else {
					ans += (rightMax - height[right]);
				}
				--right;
			}
		}

		return ans;
	}

	public int trapBruteForce(int[] height) { 
		
		int ans = 0;
		
		for (int  i = 1; i < height.length - 1; i++) {
			int leftMax = 0;
			int rightMax = 0;

			for (int j = i; j >= 0; j--) {
				leftMax = Math.max(leftMax, height[j]);
			}

			for (int j = i; j < height.length; j++) { //Search the right part for max bar size
                rightMax = Math.max(rightMax, height[j]);
            }

			ans += Math.min(leftMax, rightMax) - height[i];
		}

		return ans;
	}
}
