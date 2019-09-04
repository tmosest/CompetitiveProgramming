package com.tmosest.competitiveprogramming.leetcode.medium;

class RotateFunction {

  int maxRotateFunction(int[] arr) {
    int size = arr.length;
    if (size == 0) {
      return 0;
    }

    int max = Integer.MIN_VALUE;
    int f0 = 0; //to store F value after each iteration.
    int arraySum = 0; /*to store sum of all variables; A+B+C+D+E in example above*/

    for (int i = 0; i < size; i++) {
      f0 += i * arr[i];
      arraySum += arr[i];
    }

    for (int j = 1; j <= size; j++) {
      f0 += arraySum - size * arr[size - j];
      if (f0 > max) {
        max = f0;
      }
    }

    return max;
  }
}
