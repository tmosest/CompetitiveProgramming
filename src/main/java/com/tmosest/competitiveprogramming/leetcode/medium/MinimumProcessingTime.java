package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class MinimumProcessingTime {
	/**
	 * https://leetcode.com/problems/minimum-processing-time/description/
	 * 
	 * @param processorTime
	 * @param tasks
	 * @return
	 */
	public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {

		List<Integer> sortedTasks = new ArrayList<>(tasks);
		List<Integer> sortedProcessorTime = new ArrayList<>(processorTime);
		
		Collections.sort(sortedTasks);
		Collections.sort(sortedProcessorTime);

		int maxTime = 0;
		int tasksIndex = 0;

		for (int processor : sortedProcessorTime) {

			if (tasksIndex >= sortedTasks.size())
				break;

			maxTime = Math.max(maxTime, processor + sortedTasks.get(tasks.size() - tasksIndex - 1));
			maxTime = Math.max(maxTime, processor + sortedTasks.get(tasks.size() - tasksIndex - 2));
			maxTime = Math.max(maxTime, processor + sortedTasks.get(tasks.size() - tasksIndex - 3));
			maxTime = Math.max(maxTime, processor + sortedTasks.get(tasks.size() - tasksIndex - 4));

			tasksIndex += 4;
		}

		return maxTime;
	}
}
