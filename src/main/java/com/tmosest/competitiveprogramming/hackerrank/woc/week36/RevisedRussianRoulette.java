package com.tmosest.competitiveprogramming.hackerrank.woc.week36;

import java.util.Scanner;

public class RevisedRussianRoulette {

  public static boolean debugMode = false;

  /**
   * Function for testing.
   *
   * @return A min max string of door counts.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);

    int count = in.nextInt();
    boolean[] doors = new boolean[count];

    for (int i = 0; i < doors.length; i++) {
      doors[i] = (in.nextInt() == 1);
    }

    in.close();

    int minimumDoorsToClose = 0;
    int maximumDoorsToClose = 0;

    for (int i = 0; i < doors.length; i++) {
      if (doors[i]) {
        minimumDoorsToClose++;
        if (i + 1 < doors.length && doors[i + 1]) {
          maximumDoorsToClose++;
          doors[i + 1] = false;
        }
        maximumDoorsToClose++;
      }
    }

    return minimumDoorsToClose + " " + maximumDoorsToClose;
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
