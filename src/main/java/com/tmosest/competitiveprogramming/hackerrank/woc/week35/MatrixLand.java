package com.tmosest.competitiveprogramming.hackerrank.woc.week35;

import java.util.Scanner;

/**
 * you can visit already visited index. To stop goback process, use counter for all the index to
 * track the visited index. that is, for the first time you visit y, then it will be zero(counter =
 * 1) as per the problem statement, and you go to y+1. if you goback to y again(counter = 1). if
 * counter > 1, you can stop this.
 *
 * @author tmosest
 */
public class MatrixLand {

  public static boolean debugMode = false;

  /**
   * Function for testing.
   *
   * @return Integer.
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int columns = in.nextInt();
    int[][] grid = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        grid[i][j] = in.nextInt();
      }
    }
    in.close();
    MaximizedPath path = new MaximizedPath(grid);
    if (debugMode) {
      System.out.println("final answer: " + path.getMaxPath());
    }
    return path.getMaxPath();
  }

  public static void main(String[] args) {
    System.out.println(solve());
  }

  private static class MaximizedPath {

    int rows;
    int columns;
    int bestPath;
    int[][] bestPathFromCache;

    public MaximizedPath(int[][] grid) {
      rows = grid.length;
      columns = grid[0].length;
      if (debugMode) {
        System.out.println("Starting Grid!");
        printGrid(grid);
        System.out.println();
      }
      initCache(grid);
      bestPath = determineBestPath(grid);
    }

    private void initCache(int[][] grid) {
      bestPathFromCache = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          bestPathFromCache[i][j] = Integer.MIN_VALUE;
        }
      }

      for (int i = 0; i < 1; i++) {
        for (int j = 0; j < columns; j++) {
          bestPathFromCache[i][j] = determineBestPathValuesForRow(i, j, grid);
        }
      }
    }

    public int determineBestPathValuesForRow(int row, int col, int[][] grid) {
      int bestValue = grid[row][col];
      int sum;
      if (col - 1 > -1) {
        sum = bestValue;
        for (int c = col - 1; c > -1; c--) {
          sum += grid[row][c];
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (col + 1 < columns) {
        sum = bestValue;
        for (int c = col + 1; c < columns; c++) {
          sum += grid[row][c];
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (debugMode) {
        System.out.println("i: " + row + " j: " + col + " bestValue: " + bestValue);
      }
      return bestValue;
    }

    public int determineBestPath(int[][] grid) {
      int bestPath = Integer.MIN_VALUE;
      for (int c = 0; c < columns; c++) {
        bestPath = Math.max(bestPath, bestPathTo(rows - 1, c, grid, 0));
        if (debugMode) {
          System.out.println("c: " + c + " bestPath: " + bestPath);
        }
      }
      return bestPath;
    }

    public int bestPathTo(int row, int col, int[][] grid, int score) {
      if (debugMode) {
        System.out.println("\ni: " + row + " j: " + col + " score: " + score);
      }
      if (row == 0) {
        if (debugMode) {
          System.out.println("Hit row 0!");
          // printGrid(bestPathFromCache);
        }
        return bestPathFromCache[row][col] + score;
      }
      if (debugMode) {
        printGrid(grid);
        // System.out.println();
      }
      int bestPath = Integer.MIN_VALUE;
      int[][] newGrid;
      if (row - 1 > -1 && grid[row - 1][col] != -500) {
        if (debugMode) {
          // System.out.println("i - 1 : " + (i - 1) + " score: " + score);
        }
        newGrid = copyGrid(grid);
        int tempScore = newGrid[row - 1][col];
        newGrid[row - 1][col] = 0;
        if (tempScore == 0) {
          newGrid[row - 1][col] = -500;
        }
        bestPath = Math.max(bestPath, bestPathTo(row - 1, col, newGrid, tempScore));
        if (debugMode) {
          // System.out.println("i - 1 best path: " + bestPath);
        }
      }
      if (col - 1 > -1 && grid[row][col - 1] != -500) {
        if (debugMode) {
          // System.out.println("j - 1 : " + (j - 1) + " score: " + score);
        }
        newGrid = copyGrid(grid);
        int tempScore = newGrid[row][col - 1];
        newGrid[row][col - 1] = 0;
        if (tempScore == 0) {
          newGrid[row][col - 1] = -500;
        }
        bestPath = Math.max(bestPath, bestPathTo(row, col - 1, newGrid, tempScore));
        if (debugMode) {
          // System.out.println("j - 1 best path: " + bestPath);
        }
      }
      if (col + 1 < columns && grid[row][col + 1] != -500) {
        if (debugMode) {
          System.out.println("j + 1 : " + (col + 1));
        }
        newGrid = copyGrid(grid);
        int tempScore = newGrid[row][col + 1];
        newGrid[row][col + 1] = 0;
        if (tempScore == 0) {
          newGrid[row][col + 1] = -500;
        }
        bestPath = Math.max(bestPath, bestPathTo(row, col + 1, newGrid, tempScore));
      }
      //score += grid[i][j];
      if (debugMode) {
        System.out.println("\ni: " + row + " j: " + col + " bestPath: " + bestPath);
        printGrid(grid);
        // System.out.println();
      }
      return bestPath + score;
    }

    private int[][] copyGrid(int[][] grid) {
      int[][] newGrid = new int[rows][columns];
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          newGrid[i][j] = grid[i][j];
        }
      }
      return newGrid;
    }

    private void printGrid(int[][] grid) {
      for (int i = 0; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          System.out.print(String.format("%-5s ", grid[i][j]));
        }
        System.out.println();
      }
    }

    public int getMaxPath() {
      return bestPath;
    }
  }

}
