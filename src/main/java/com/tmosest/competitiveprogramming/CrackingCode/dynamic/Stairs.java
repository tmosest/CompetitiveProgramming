package com.tmosest.competitiveprogramming.crackingcode.dynamic;

public class Stairs {
  public static boolean debugMode = false;

  private static int[] memorization;

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  private static int countWaysUpStairs(int height) {
    if (height <= 0) {
      return 0;
    }
    if (memorization[height] == 0) {
      memorization[height] = 1 + countWaysUpStairs(height - 1) + countWaysUpStairs(height - 2)
          + countWaysUpStairs(height - 3);
    }
    return memorization[height];
  }

  /**
   * Method to determine the number of ways of a set of stairs. Given the option of 1 step, 2 step,
   * or 3 steps.
   * 
   * @param stairsHeight Height of the stairs
   * @return The number of ways up the stairs
   */
  public static int solve(int stairsHeight) {
    memorization = new int[stairsHeight + 1];
    int numWays = countWaysUpStairs(stairsHeight);
    if (debugMode) {
      printArray(memorization);
    }
    return numWays;
  }
}
