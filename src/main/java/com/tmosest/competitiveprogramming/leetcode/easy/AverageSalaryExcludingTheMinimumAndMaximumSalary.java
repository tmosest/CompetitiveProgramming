package com.tmosest.competitiveprogramming.leetcode.easy;

class AverageSalaryExcludingTheMinimumAndMaximumSalary {

  double average(int[] salary) {
    int min = Integer.MAX_VALUE;
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int amount : salary) {
      min = Math.min(amount, min);
      max = Math.max(amount, max);
      sum += amount;
    }

    return (double) (sum - max - min) / (salary.length - 2);
  }
}
