package com.tmosest.competitiveprogramming.hackerrank.woc.week35;

import java.util.Scanner;

/**
 * Contests -> Week of Code 35 -> Triple Recursion Difficulty: Easy Score: 20 pts link:
 * https://www.hackerrank.com/contests/w35/challenges/triple-recursion/problem.
 *
 * @author tmosest (Tyler Owen Moses).
 */
public class TripleRecursion {

  /**
   * Boolean debugMode for debugging.
   */
  public static boolean debugMode = false;

  /**
   * Main wrapper for testing.
   *
   * @return Solution Matrix
   */
  public static Matrix solve() {
    Scanner in = new Scanner(System.in);
    int num = in.nextInt();
    int mom = in.nextInt();
    int kill = in.nextInt();
    in.close();
    return new Matrix(num, mom, kill);
  }

  /**
   * Main method.
   *
   * @param args main string array!
   */
  public static void main(String[] args) {
    System.out.println(solve().toString());
  }

  /**
   * Matrix class.
   * @author tmosest (Tyler Owen Moses).
   * @name Matrix Wrapper class for a matrix.
   */
  public static class Matrix {

    /**
     * Grid.
     */
    public int[][] grid;

    /**
     * Constructor function.
     */
    public Matrix(int num, int mom, int kill) {
      grid = new int[num][num];
      initGrid(num, mom, kill);
    }

    /**
     * Function to initialize the grid based on the rules.
     *
     * @param num Size of the grid
     * @param mom Initnital value for index 0,0
     * @param kill Another value used for when i == j
     */
    private void initGrid(int num, int mom, int kill) {
      for (int i = 0; i < num; i++) {
        for (int j = 0; j < num; j++) {
          if (debugMode) {
            System.out.println("i: " + i + " j: " + j);
          }
          if (i == 0 && j == 0) {
            grid[i][j] = mom;
          } else if (i == j) {
            grid[i][j] = grid[i - 1][j - 1] + kill;
          } else if (i > j) {
            grid[i][j] = grid[i - 1][j] - 1;
          } else {
            grid[i][j] = grid[i][j - 1] - 1;
          }
        }
      }
    }

    /**
     * To String method.
     */
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[i].length; j++) {
          sb.append(grid[i][j]);
          if (j != grid[i].length - 1) {
            sb.append(" ");
          }
        }
        if (i != grid.length - 1) {
          sb.append("\n");
        }
      }
      return sb.toString();
    }
  }

}
