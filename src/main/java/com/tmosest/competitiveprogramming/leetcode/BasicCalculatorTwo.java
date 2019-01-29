package com.tmosest.competitiveprogramming.leetcode;

import java.util.Stack;

class BasicCalculatorTwo {

  private int index = 0;

  /**
   * Treats the string like an expression with +,-,*,/ and all positive numbers.
   * @param calculation String to be calculated.
   * @return The int value of the expression.
   */
  int calculate(String calculation) {
    char[] trimmed = calculation.replace(" ", "").toCharArray();
    Stack<Integer> stack = new Stack<>();
    stack.push(nextNum(trimmed));
    while (index < trimmed.length) {
      switch (trimmed[index]) {
        case '+':
          ++index;
          stack.push(nextNum(trimmed));
          break;
        case '-':
          ++index;
          stack.push(-1 * nextNum(trimmed));
          break;
        case '*':
          ++index;
          stack.push(stack.pop() * nextNum(trimmed));
          break;
        case '/':
          ++index;
          stack.push(stack.pop() / nextNum(trimmed));
          break;
        default:
      }
    }
    int result = 0;
    while (!stack.isEmpty()) {
      result += stack.pop();
    }
    return result;
  }

  private int nextNum(char[] input) {
    int num = 0;
    while (index < input.length) {
      if (!Character.isDigit(input[index])) {
        break;
      }
      num *= 10;
      num += (input[index] - '0');
      ++index;
    }
    return num;
  }
}
