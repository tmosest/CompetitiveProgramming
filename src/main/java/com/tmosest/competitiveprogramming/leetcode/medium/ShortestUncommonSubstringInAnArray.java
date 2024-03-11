package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class ShortestUncommonSubstringInAnArray {

	public String[] shortestSubstrings(String[] arr) {
		List<Set<String>> subStringSetList = Arrays.stream(arr).map(i -> generateAllSubstrings(i)).toList();

		Map<String, Integer> counts = new HashMap<>();

		for (Set<String> substrings : subStringSetList) {
			for (String s : substrings) {
				counts.put(s, counts.getOrDefault(s, 0) + 1);
			}
		}

		String[] results = new String[arr.length];
		int i = 0;
		

		for (Set<String> subStrings: subStringSetList) {

			List<String> list = subStrings.stream().collect(Collectors.toList());
			Collections.sort(list);
			Collections.reverse(list);

			results[i] = "";

			for (String s : list) {
				if (counts.get(s) == 1 && (results[i].equals("") || results[i].length() >= s.length())) {
 					results[i] = s;
				}
			}

			i++;
		}

		return results;
	}

	public Set<String> generateAllSubstrings(String str) {
		Set<String> results = new HashSet<>();

		for (int i = 0; i < str.length(); i++) {
			String subString = "";

			for (int j = i; j < str.length(); j++) {
				subString += str.charAt(j);
				results.add(subString);
			}
		}

		return results;
	}
}
