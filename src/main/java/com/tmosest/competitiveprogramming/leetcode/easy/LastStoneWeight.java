package com.tmosest.competitiveprogramming.leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class LastStoneWeight {
	/**
	 * We are playing a game with the stones. On each turn, we choose the heaviest two stones and smash them together. 
	 * Suppose the heaviest two stones have weights x and y with x <= y. The result of this smash is:
	 * 
	 * If x == y, both stones are destroyed, and
	 * 
	 * If x != y, the stone of weight x is destroyed, and the stone of weight y has new weight y - x.
	 * 
	 * At the end of the game, there is at most one stone left.
	 * 
	 * Return the weight of the last remaining stone. If there are no stones left, return 0.
	 * 
	 * @param stones
	 * @return
	 */
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList = new ArrayList<>();
        for (int weight : stones) {
            stoneList.add(weight);
        }

        while (stoneList.size() > 1) {
            int stone1 = removeLargest(stoneList);
            int stone2 = removeLargest(stoneList);
            if (stone1 != stone2) {
                stoneList.add(stone1 - stone2);
            }
        }

        return !stoneList.isEmpty() ? stoneList.remove(0) : 0;
    }

	private int removeLargest(List<Integer> stones) {
        int indexOfLargest = stones.indexOf(Collections.max(stones));
        int result = stones.get(indexOfLargest);
        stones.set(indexOfLargest, stones.get(stones.size() - 1));
        stones.remove(stones.size() - 1);
        return result;
    }
}
