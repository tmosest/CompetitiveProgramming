package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

class OpenTheLock {
	/**
	 * https://leetcode.com/problems/open-the-lock/description/?envType=daily-question&envId=2024-04-22
	 * 
	 * @param deadends
	 * @param target
	 * @return
	 */
	public int openLock(String[] deadends, String target) {
		
		Set<String> deadendSet = new HashSet<>();
		
		for (String deadend : deadends) {
			deadendSet.add(deadend);
		}

		Set<String> visited = new HashSet<>();

		Queue<Position> queue = new LinkedList<>();
		queue.add(new Position("0000", 0));

		while(!queue.isEmpty()) {
			
			Position pos = queue.poll();

			visited.add(pos.lock);

			if (target.equals(pos.lock)) {
				return pos.pos;
			}

			for (int i = 0; i < pos.lock.length(); i++) {
				int digit = pos.lock.charAt(i) - '0';
				int digitPlus = digit == 9 ? 0 : digit + 1;
				int digitMinus = digit == 0 ? 9 : digit - 1;
				
				StringBuilder stringBuilder = new StringBuilder(pos.lock);
				stringBuilder.setCharAt(i, (char) (digitPlus + '0'));

				if (!deadendSet.contains(stringBuilder.toString()) && !visited.contains(stringBuilder.toString())) {
					queue.add(new Position(stringBuilder.toString(), pos.pos + 1));
				}

				stringBuilder.setCharAt(i, (char) (digitMinus + '0'));
				if (!deadendSet.contains(stringBuilder.toString()) && !visited.contains(stringBuilder.toString())) {
					queue.add(new Position(stringBuilder.toString(), pos.pos + 1));
				}
			}
		}

		return -1;
	}
	
	private static class Position {
		String lock;
		int pos;

		public Position(String lock, int pos) {
			this.lock = lock;
			this.pos = pos;
		}
	}
}
