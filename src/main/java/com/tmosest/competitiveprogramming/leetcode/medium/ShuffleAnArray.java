package com.tmosest.competitiveprogramming.leetcode.medium;

import java.util.Random;

class ShuffleAnArray {

  private int[] original;
  private int[] workingCopy;
  private Random random;
  private int length;

  ShuffleAnArray(int[] nums) {
    this.length = nums.length;
    this.original = new int[length];
    this.workingCopy = new int[length];
    this.random = new Random();

    for (int i = 0; i < length; i++) {
      this.original[i] = this.workingCopy[i] = nums[i];
    }
  }

  /**
   * Resets the array to its original configuration and return it.
   */
  int[] reset() {
    return this.original;
  }

  /**
   * Returns a random shuffling of the array.
   */
  int[] shuffle() {
    int index;
    int one;
    int two;
    int temp;

    for (index = 0; index < length; index++) {
      one = this.random.nextInt(length);
      two = this.random.nextInt(length);

      if (one != two) {
        temp = this.workingCopy[one];
        this.workingCopy[one] = this.workingCopy[two];
        this.workingCopy[two] = temp;
      }
    }

    return this.workingCopy;
  }
}
