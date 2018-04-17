package com.tmosest.competitiveprogramming.spoj;

import java.util.Scanner;

public class LifeTheUniverseAndEverything {

  public static boolean debugMode = false;

  /**
   * Prints out numbers that are read in until we see 42.
   */
  public static void solve() {
    Scanner in = new Scanner(System.in);
    while (in.hasNextLine()) {
      String line = in.nextLine();
      if (line.equals("42")) {
        break;
      }
      System.out.println(line);
    }
    in.close();
  }

  public static void main(String[] args) {
    solve();
  }
}
