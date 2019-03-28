package com.tmosest.competitiveprogramming.leetcode;

import java.util.Stack;

public class ValidParenthesisString {

  /**
   * Determine if the string is valid parentheses with a * character.
   * @param str The string.
   * @return Return true if this is valid parentheses.
   */
  public boolean checkValidString(String str) {
    Stack<Character> stack = new Stack<>();
    return checkValidString(str, stack);
  }

  private boolean checkValidString(String str, Stack<Character> stack) {
    for (int i = 0; i < str.length(); i++) {
      char letter = str.charAt(i);
      if (letter == '(') {
        stack.push(letter);
      } else if (letter == ')') {
        if (stack.isEmpty()) {
          return false;
        }
        char popped = stack.pop();
        if (popped != '(') {
          return false;
        }
      } else {
        // character is a wild card
        Stack<Character> openStack = (Stack<Character>) stack.clone();
        openStack.push('(');
        Stack<Character> closedStack = (Stack<Character>) stack.clone();
        closedStack.push(')');
        String subString = str.substring(i + 1, str.length());
        if (checkValidString(subString, openStack) || checkValidString(subString, closedStack)) {
          return true;
        }
      }
    }
    if (!stack.isEmpty() && stack.size() % 2 == 0) {
      StringBuilder stringBuilder = new StringBuilder();
      while (!stack.isEmpty()) {
        stringBuilder.insert(0, stack.pop());
      }
      str = stringBuilder.toString();
      if (str.contains("(") && str.contains(")")) {
        return checkValidString(str, stack);
      }
      return false;
    }
    return stack.isEmpty();
  }
}
