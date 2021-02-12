package com.tmosest.competitiveprogramming.datastructures.implementations;

import java.util.Stack;

public class Bracket {

  public static final char STANDARD_OPENING_BRACKET = '(';
  public static final char STANDARD_CLOSING_BRACKET = ')';

  /**
   * Finds the ending index of a bracket.
   * Only handles () at the moment and doesn't validate inputs.
   * @param str The string.
   * @param startingIndex The starting index of a bracket.
   * @return The ending index for that bracket.
   */
  public static int findEndingBracketIndex(String str, int startingIndex) {
    String sub = str.substring(startingIndex);
    int index = 0;

    Stack<Character> openingStack = new Stack<>();
    openingStack.add(sub.charAt(index++));

    while (!openingStack.empty()) {
      char val = sub.charAt(index);
      if (STANDARD_CLOSING_BRACKET == val) {
        openingStack.pop();
        if (openingStack.empty()) {
          return index + startingIndex;
        }
      } else if (STANDARD_OPENING_BRACKET == val) {
        openingStack.push(STANDARD_OPENING_BRACKET);
      }
      index++;
    }

    return -1;
  }
}
