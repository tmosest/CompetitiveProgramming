package com.tmosest.competitiveprogramming.leetcode;

import java.util.List;

public class ValidWordSqaure {

  private String getColumn(List<String> words, int col) {
    StringBuilder stringBuilder = new StringBuilder();
    for (String word : words) {
      if (col < word.length()) {
        stringBuilder.append(word.charAt(col));
      }
    }
    return stringBuilder.toString();
  }

  /**
   * Grid is a word square if the column matches the row.
   * @param words List of strings that represents the grid.
   * @return True if it is a valid word square.
   */
  public boolean validWordSquare(List<String> words) {
    for (int i = 0; i < words.size(); i++) {
      String row = words.get(i);
      String col = getColumn(words, i);
      if (!row.equals(col)) {
        return false;
      }
    }
    return true;
  }
}
