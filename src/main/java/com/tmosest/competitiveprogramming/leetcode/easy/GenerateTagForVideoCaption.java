package com.tmosest.competitiveprogramming.leetcode.easy;

class GenerateTagForVideoCaption {

	public String generateTag(String caption) {
		// Handle null input
		if (caption == null) {
			return "#";
		}

		// Split the caption into words, removing extra spaces
		String[] words = caption.trim().split("\\s+");
		StringBuilder sb = new StringBuilder("#");

		// Process each word
		for (int i = 0; i < words.length; i++) {
			String w = words[i];

			// Skip empty words
			if (w.length() == 0 || w == null) {
				continue;
			}

			if (i == 0) {
				// First word: convert to lowercase
				sb.append(words[i].toLowerCase());
			} else {
				// Subsequent words: capitalize first letter, lowercase the rest
				sb.append(Character.toUpperCase(w.charAt(0)));
				sb.append(w.substring(1).toLowerCase());
			}
		}

		// Check length limit and truncate if necessary
		if (sb.length() < 100) {
			return sb.toString();
		}
		return sb.substring(0, 100);
	}
}
