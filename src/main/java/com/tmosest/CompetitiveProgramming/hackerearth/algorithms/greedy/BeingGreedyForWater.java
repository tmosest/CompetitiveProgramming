package com.tmosest.CompetitiveProgramming.hackerearth.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.LongStream;

public class BeingGreedyForWater {

  public static boolean debugMode = false;

  public static int calculateBottles(long containerAmount, long[] bottles) {
    Arrays.sort(bottles);
    int i = 0;
    for (int b = 0; b < bottles.length; b++) {
      if (containerAmount - bottles[b] < 0)
        break;
      containerAmount -= bottles[b];
      i++;
    }
    return i;
  }

  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[] results = new int[tests];
    for (int t = 0; t < tests; t++) {
      int numBottles = in.nextInt();
      long containerAmount = in.nextLong();
      long[] bottles = LongStream.range(0, numBottles).map(i -> in.nextLong()).toArray();
      results[t] = calculateBottles(containerAmount, bottles);
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    int[] results = solve();
    Arrays.stream(results).forEach(System.out::println);
  }
}
