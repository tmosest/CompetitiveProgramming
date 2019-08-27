package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class ClumsyFactorial {

  int clumsy(int num) {
    int res = num;
    Stack<Integer> stack = new Stack<>();
    char[] operations = new char[]{'*', '/', '+', '-'};
    for (int n = num - 1, operationIndex = 0; n > 0;
        n--, operationIndex = operationIndex >= 3 ? 0 : operationIndex + 1) {
      switch (operations[operationIndex]) {
        case '*':
          if (stack.isEmpty()) {
            res *= n;
          } else {
            stack.push(stack.pop() * n);
          }
          break;
        case '/':
          if (stack.isEmpty()) {
            res /= n;
          } else {
            res += stack.pop() / n;
          }
          break;
        case '+':
          res += n;
          break;
        case '-':
          stack.push(-n);
          break;
        default:
          System.out.println("unknown operation");
      }
    }
    if (!stack.isEmpty()) {
      res += stack.pop();
    }
    return res;
  }
}
