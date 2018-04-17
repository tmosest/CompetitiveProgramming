package com.tmosest.competitiveprogramming.uri.beginner;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanceBetweenTwoPoints {

  public static boolean debugMode = false;

  private static String roundTwoDecimals(double number) {
    DecimalFormat twoDForm = new DecimalFormat("#.0000");
    return twoDForm.format(number);
  }

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    Point point1 = new Point(in.nextDouble(), in.nextDouble());
    Point point2 = new Point(in.nextDouble(), in.nextDouble());
    in.close();
    String result = roundTwoDecimals(point1.distance(point2));
    return result;
  }

  /**
   * Main function.
   *
   * @param args String array.
   */
  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class Point {
    double start;
    double end;

    public Point(double start, double end) {
      this.start = start;
      this.end = end;
    }

    public double distance(Point other) {
      return Math.sqrt(Math.pow(other.start - this.start, 2) + Math.pow(other.end - this.end, 2));
    }
  }

}
