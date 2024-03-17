package com.tmosest.competitiveprogramming.leetcode.easy;

class ExistenceOfSubstringInStringAndItsReverse {

	public boolean isSubstringPresent(String s) {

		String r = new StringBuilder(s).reverse().toString();

		for (int i = 0; i < s.length() - 1; i++) {
			String sub = s.substring(i, i + 2);
			if (r.contains(sub)) return true;
		}

		return false;
	}
}
