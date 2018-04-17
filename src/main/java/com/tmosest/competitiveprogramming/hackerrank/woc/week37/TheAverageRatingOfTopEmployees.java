package com.tmosest.competitiveprogramming.hackerrank.woc.week37;

import java.util.Scanner;

public class TheAverageRatingOfTopEmployees {

  public static boolean debugMode = false;

  /**
   * Function to solve the problem.
   *
   * @return Average of grades >= 90%
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    double sum = 0.0;
    int count = 0;
    int grades = in.nextInt();
    for (int i = 0; i < grades; i++) {
      int grade = in.nextInt();
      if (grade >= 90) {
        sum += grade;
        count++;
      }
    }
    in.close();
    double result = sum / count;
    return String.format("%.2f", result);
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

}
