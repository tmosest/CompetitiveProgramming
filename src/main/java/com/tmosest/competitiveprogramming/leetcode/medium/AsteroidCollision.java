package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class AsteroidCollision {

  int[] asteroidCollision(int[] asteroids) {
    int len = asteroids.length;
    if (len == 0) {
      return asteroids;
    }
    Stack<Integer> stack = new Stack<>();

    int index = 0;
    while (index < len) {
      if (asteroids[index] > 0) {
        stack.push(asteroids[index]);
      } else {
        if (stack.isEmpty()) {
          stack.push(asteroids[index]);
        } else {
          while (!stack.isEmpty()
              && stack.peek() > 0
              && stack.peek() < Math.abs(asteroids[index])) {
            stack.pop();
          }
          if (stack.isEmpty()) {
            stack.push(asteroids[index]);
          } else if (stack.peek() < 0) {
            stack.push(asteroids[index]);
          } else if (stack.peek() == Math.abs(asteroids[index])) {
            stack.pop();
          }
        }
      }
      index++;
    }

    int[] res = new int[stack.size()];
    for (int j = res.length - 1; j >= 0; j--) {
      res[j] = stack.pop();
    }
    return res;
  }
}
