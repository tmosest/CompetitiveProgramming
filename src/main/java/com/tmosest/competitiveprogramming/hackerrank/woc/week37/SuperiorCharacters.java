package com.tmosest.competitiveprogramming.hackerrank.woc.week37;

import java.util.Arrays;
import java.util.Scanner;

public class SuperiorCharacters {

  public static boolean debugMode = false;

  private static class SuperiorAlphabet {

    public int[] alphabet = new int[26];
    public int letterCount = 0;

    public SuperiorAlphabet(Scanner in) {
      for (int l = 0; l < 26; l++) {
        alphabet[l] = in.nextInt();
        letterCount += alphabet[l];
      }
    }

    public int determineMaxSuperirorCharacters() {
      return (letterCount - 1) / 2;
    }
  }

  /**
   * Function for testing.
   *
   * @return Int array of max superior characters
   */
  public static int[] solve() {
    Scanner in = new Scanner(System.in);
    int tests = in.nextInt();
    int[] results = new int[tests];
    for (int t = 0; t < tests; t++) {
      results[t] = new SuperiorAlphabet(in).determineMaxSuperirorCharacters();
    }
    in.close();
    return results;
  }

  public static void main(String[] args) {
    Arrays.stream(solve()).forEach(System.out::println);
  }
}
