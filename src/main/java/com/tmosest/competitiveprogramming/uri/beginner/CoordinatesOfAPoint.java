package com.tmosest.competitiveprogramming.uri.beginner;

import java.util.Scanner;

public class CoordinatesOfAPoint {

  public static boolean debugMode = false;

  /**
   * Test function.
   *
   * @return String result.
   */
  public static String solve() {
    Scanner in = new Scanner(System.in);
    Point point = new Point(in.nextDouble(), in.nextDouble());
    in.close();
    return point.getQuadrant();
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

    double cordX;
    double cordY;

    public Point(double cordX, double cordY) {
      this.cordX = cordX;
      this.cordY = cordY;
    }

    public String getQuadrant() {
      if (cordX > 0) {
        if (cordY > 0) {
          return "Q1";
        } else if (cordY < 0) {
          return "Q4";
        } else {
          return "Eixo X";
        }
      }
      if (cordX < 0) {
        if (cordY > 0) {
          return "Q2";
        } else if (cordY < 0) {
          return "Q3";
        } else {
          return "Eixo X";
        }
      }
      if (cordY > 0 || cordY < 0) {
        return "Eixo Y";
      }
      return "Origem";
    }
  }
}
