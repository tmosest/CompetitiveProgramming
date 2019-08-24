package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Stack;

class AsteroidCollision {

  int[] asteroidCollision(int[] asteroids) {
    int len = asteroids.length;
    if (len == 0) {
      return asteroids;
    }
    Stack<Integer> s = new Stack<>();

    int index = 0;
    while (index < len) {
      if (asteroids[index] > 0) {
        s.push(asteroids[index]);
      } else {
        if (s.isEmpty()) {
          s.push(asteroids[index]);
        } else {
          while (!s.isEmpty() && s.peek() > 0 && s.peek() < Math.abs(asteroids[index])) {
            s.pop();
          }
          if (s.isEmpty()) {
            s.push(asteroids[index]);
          } else if (s.peek() < 0) {
            s.push(asteroids[index]);
          } else if (s.peek() == Math.abs(asteroids[index])) {
            s.pop();
          }
        }
      }
      index++;
    }

    int[] res = new int[s.size()];
    for (int j = res.length - 1; j >= 0; j--) {
      res[j] = s.pop();
    }
    return res;
  }
}
