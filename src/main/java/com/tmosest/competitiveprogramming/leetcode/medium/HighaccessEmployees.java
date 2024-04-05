package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

class HighaccessEmployees {
	
	/**
	 * 
	 * @param access_times
	 * @return
	 */
	public List<String> findHighAccessEmployees(List<List<String>> access_times) {

		Map<String, PriorityQueue<Integer>> map = new HashMap<>();

		for (List<String> ac : access_times) {
			PriorityQueue<Integer> priorityQueue = map.getOrDefault(ac.get(0), new PriorityQueue<>());
			priorityQueue.add(Integer.parseInt(ac.get(1)));
			map.put(ac.get(0), priorityQueue);
		}

		Set<String> results = new HashSet<>();

		for (String key : map.keySet()) {
			PriorityQueue<Integer> priorityQueue = map.get(key);
			while (!priorityQueue.isEmpty()) {
				int timeStart = priorityQueue.poll();
				if (priorityQueue.isEmpty()) {
					continue;
				}
				int nextTime = priorityQueue.poll();
				if (priorityQueue.isEmpty()) {
					continue;
				}
				if (nextTime - timeStart >= 100) {
					priorityQueue.add(nextTime);
					continue;
				}
				int finalTime = priorityQueue.poll();
				if (finalTime - timeStart >= 100) {
					priorityQueue.add(nextTime);
					priorityQueue.add(finalTime);
					continue;
				}
				results.add(key);
			}
		}

		return new ArrayList<>(results);
	}
}
