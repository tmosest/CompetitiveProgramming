package com.tmosest.CompetitiveProgramming.CrackingCode.dynamic;

public class Stairs {
  public static boolean debugMode = false;

  private static int[] memorization;

  private static void printArray(int[] array) {
    for (int i = 0; i < array.length; i++)
      System.out.print(array[i] + " ");
    System.out.println();
  }

  private static int countWaysUpStairs(int height) {
    if (height <= 0)
      return 0;
    if (memorization[height] == 0)
      memorization[height] = 1 + countWaysUpStairs(height - 1) + countWaysUpStairs(height - 2)
          + countWaysUpStairs(height - 3);
    return memorization[height];
  }

  public static int solve(int stairsHeight) {
    memorization = new int[stairsHeight + 1];
    int numWays = countWaysUpStairs(stairsHeight);
    if (debugMode)
      printArray(memorization);
    return numWays;
  }
}
