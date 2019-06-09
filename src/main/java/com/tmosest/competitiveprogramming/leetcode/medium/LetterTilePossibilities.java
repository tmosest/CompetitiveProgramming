package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

class LetterTilePossibilities {

  private Set<String> set;

  /**
   * Return the number of tile possibilities.
   *
   * @param tiles The characters on the tiles.
   * @return The number of sequences.
   */
  int numTilePossibilities(String tiles) {
    set = new HashSet<>();
    backtrack(tiles.toCharArray(), 0);
    return set.size();
  }

  private void backtrack(char[] chars, int index) {
    if (index >= 1) {
      set.add(String.valueOf(Arrays.copyOf(chars, index)));
    }

    if (index == chars.length) {
      return;
    }

    for (int j = index; j < chars.length; j++) {
      swap(chars, index, j);
      backtrack(chars, index + 1);
      swap(chars, index, j);
    }
  }

  private void swap(char[] chars, int one, int two) {
    char temp = chars[one];
    chars[one] = chars[two];
    chars[two] = temp;
  }
}
