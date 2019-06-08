package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.IntStream;

class ShortEncodingOfWords {

  /**
   * Determine length of prefix string encoding.
   *
   * @param words The words.
   * @return length of prefix encoding.
   */
  int minimumLengthEncoding(String[] words) {
    Set<String> prefixes = new HashSet(Arrays.asList(words));
    Arrays.stream(words).forEach(word ->
        IntStream.range(1, word.length()).forEach(index ->
            prefixes.remove(word.substring(index))
        )
    );
    return prefixes.stream().mapToInt(str -> str.length() + 1).sum();
  }
}
