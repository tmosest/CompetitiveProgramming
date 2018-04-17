package com.tmosest.competitiveprogramming.hackerrank.woc.week37;

import java.util.Scanner;

public class SimpleLanguage {

  public static boolean debugMode = false;

  /**
   * Function for solving this problem.
   *
   * @return maximum int
   */
  public static long solve() {
    Scanner in = new Scanner(System.in);

    long result = 0;
    // Read # of commands
    int commands = in.nextInt();

    for (int i = 0; i < commands; i++) {
      String command = in.next();
      int value = in.nextInt();
      if (debugMode) {
        System.out.println("cmd: " + command);
        System.out.println("y: " + value);
      }
      switch (command) {
        case "add":
          if (value > 0) {
            result += value;
          }
          break;
        case "set":
          if (value >= result) {
            result = value;
          }
          break;
        default:
          System.out.println("Cmd not found!");
      }
    }
    in.close();
    return result;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }
}
