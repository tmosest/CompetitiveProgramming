package com.tmosest.competitiveprogramming.leetcode.easy;

class LongPressedName {
	/**
	 * Your friend is typing his name into a keyboard. Sometimes, when typing a character c, the key might get long pressed, and the character will be typed 1 or more times.
	 * You examine the typed characters of the keyboard. Return True if it is possible that it was your friends name, with some characters (possibly none) being long pressed.
	 * @param name
	 * @param typed
	 * @return
	 */
	public boolean isLongPressedName(String name, String typed) {

        // two pointers to the "name" and "typed" string respectively
        int np = 0;
		int tp = 0;
        // convert the string to array of chars, for ease of processing later.
        char[] name_chars = name.toCharArray();
        char[] typed_chars = typed.toCharArray();

        // advance two pointers, until we exhaust one of the strings
        while (np < name_chars.length && tp < typed_chars.length) {
            if (name_chars[np] == typed_chars[tp]) {
                np += 1;
                tp += 1;
            } else if (tp >= 1 && typed_chars[tp] == typed_chars[tp - 1]) {
                tp += 1;
            } else {
                return false;
            }
        }

        // if there is still some characters left *unmatched* in the origin string,
        // then we don't have a match.
        // e.g. name = "abc" typed = "aabb"
        if (np != name_chars.length) {
            return false;
        } else {
            // In the case that there are some redundant characters left in typed
            // we could still have a match.
            // e.g. name = "abc" typed = "abccccc"
            while (tp < typed_chars.length) {
                if (typed_chars[tp] != typed_chars[tp - 1])
                    return false;
                tp += 1;
            }
        }

        // both strings have been consumed.
        return true;
    }
}
