package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Map.Entry;

class ReplaceQuestionMarksInStringToMinimizeItsValue {
	private String alphabet = "abcdefghijklmnopqrstuvwxyz";
	/**
	 * https://leetcode.com/contest/biweekly-contest-126/problems/replace-question-marks-in-string-to-minimize-its-value/
	 * @param s
	 * @return
	 */
	public String minimizeStringValue(String s) {

		Map<Character, Integer> counts = new HashMap<>();

		for (char letter : alphabet.toCharArray()) {
			counts.put(letter, 0);
		}

		for (char letter : s.toCharArray()) {
			if (letter == '?') continue;

			counts.put(letter, counts.getOrDefault(letter, 0) + 1);
		}

		PriorityQueue<Entry<Character, Integer>> priorityQueue = new PriorityQueue<>(s.length(), new Comparator<Entry<Character, Integer>>() {
			
			public int compare(Entry<Character, Integer> e1, Entry<Character, Integer> e2) {
				int valueCompare = Integer.compare((int) e1.getValue(), (int) e2.getValue());

				if (valueCompare == 0) {
					return Integer.compare((int) e1.getKey() - 'a', (int) e2.getKey() - 'a');
				}

				return valueCompare;
			}
		});

		priorityQueue.addAll(counts.entrySet());

		StringBuilder result = new StringBuilder();

		for (char letter : s.toCharArray()) {
			if (letter != '?') {
				result.append(letter);
				continue;
			}

			Entry<Character, Integer> entry = priorityQueue.poll();
			entry.setValue(entry.getValue() + 1);
			priorityQueue.add(entry);
			
			result.append(entry.getKey());
		}

		return result.toString();
	}
}
