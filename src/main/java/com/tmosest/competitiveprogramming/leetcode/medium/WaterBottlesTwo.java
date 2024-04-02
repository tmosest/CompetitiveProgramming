package com.tmosest.competitiveprogramming.leetcode.medium;

class WaterBottlesTwo {
	/**
	 * https://leetcode.com/problems/water-bottles-ii/description/
	 * 
	 * @param numBottles
	 * @param numExchange
	 * @return
	 */
	public int maxBottlesDrunk(int numBottles, int numExchange) {
		int sum = numBottles;
		int bottle = numBottles;
		while (bottle >= numExchange) {
			bottle -= numExchange;
			numExchange++;
			sum++;
			bottle++;
		}
		return sum;
	}
}
