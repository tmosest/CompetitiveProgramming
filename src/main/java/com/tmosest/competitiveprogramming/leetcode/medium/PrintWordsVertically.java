package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class PrintWordsVertically {

  List<String> printVertically(String str) {
    String[] words = str.split(" ");

    int longestWordSize = longestWordSize(words);
    char[][] matrix = new char[longestWordSize][words.length];

    for (int col = 0; col < matrix[0].length; col++) {
      for (int row = 0; row < longestWordSize; row++) {
        matrix[row][col] = (row < words[col].length()) ? words[col].charAt(row) : ' ';
      }
    }

    return Arrays.stream(matrix).map(String::new).map(this::rtrim).collect(Collectors.toList());
  }

  private String rtrim(String str) {
    int index = str.length() - 1;
    while (index >= 0 && Character.isWhitespace(str.charAt(index))) {
      index--;
    }
    return str.substring(0, index + 1);
  }

  private int longestWordSize(String[] words) {
    int max = 0;

    for (String word : words) {
      max = Math.max(max, word.length());
    }

    return max;
  }
}
