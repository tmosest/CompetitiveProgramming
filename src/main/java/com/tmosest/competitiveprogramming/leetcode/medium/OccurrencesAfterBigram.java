package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

class OccurrencesAfterBigram {

  /**
   * Find words that are of the patter: first second third. Return Third.
   *
   * @param text The text to look through.
   * @param first The first word to look for.
   * @param second The second.
   * @return Return a list of third words.
   */
  String[] findOcurrences(String text, String first, String second) {
    List<String> thirds = new ArrayList<>();
    String[] words = text.split(" ");
    IntStream.range(0, words.length - 2).forEach(i -> {
      if (words[i].equals(first) && words[i + 1].equals(second)) {
        thirds.add(words[i + 2]);
      }
    });
    return thirds.toArray(new String[thirds.size()]);
  }
}
