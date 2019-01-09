package com.tmosest.competitiveprogramming.leetcode;

import java.util.ArrayList;
import java.util.List;

public class FlipGame {

  /**
   * Function to generate all moves for a game.
   * @param str The original state of the game.
   * @return A list of possible states after one move.
   */
  public List<String> generatePossibleNextMoves(String str) {
    List<String> result = new ArrayList<>();
    for (int i = 0; i < str.length() - 1; i++) {
      String move = generateMove(str,i);
      if (move != null) {
        result.add(move);
      }
    }
    return result;
  }

  private String generateMove(String start, int index) {
    char[] startArray = start.toCharArray();
    if (startArray[index] == '+' && startArray[index + 1] == '+') {
      startArray[index] = '-';
      startArray[index + 1] = '-';
      return new String(startArray);
    }
    return null;
  }
}
