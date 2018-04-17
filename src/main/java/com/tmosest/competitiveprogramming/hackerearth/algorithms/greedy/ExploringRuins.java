package com.tmosest.competitiveprogramming.hackerearth.algorithms.greedy;

import java.util.Scanner;

public class ExploringRuins {

  public static boolean debugMode = false;

  private static String findSmallestWord(String input) {
    char[] chars = input.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      if ('?' == chars[i]) {
        boolean hasNeighboringA = false;
        if (i - 1 >= 0) {
          if (chars[i - 1] == 'a') {
            hasNeighboringA = true;
          }
        }
        if (i + 1 < chars.length) {
          if (chars[i + 1] == 'a') {
            hasNeighboringA = true;
          }
        }
        if (hasNeighboringA) {
          chars[i] = 'b';
        } else {
          chars[i] = 'a';
        }
      }
    }
    return String.valueOf(chars);
  }

  /**
   * Test function.
   *
   * @return String.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    String input = in.nextLine();
    return findSmallestWord(input);
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }
}
