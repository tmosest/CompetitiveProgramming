package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixLand {

  public static boolean debugMode = false;

  private static class MaximizedPath {
    int rows;
    int columns;
    int bestPath;
    int[][] bestPathFromCache;

    public MaximizedPath(int[][] grid) {
      rows = grid.length;
      columns = grid[0].length;
      initCache(grid);
      bestPath = determineBestPath(grid);
    }

    private void initCache(int grid[][]) {
      bestPathFromCache = new int[rows][columns];
      for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
          bestPathFromCache[i][j] = Integer.MIN_VALUE;

      for (int j = 0; j < columns; j++) {
        bestPathFromCache[0][j] = determineBestPathValuesForStartingRow(j, grid);
      }
    }

    public int determineBestPath(int[][] grid) {
      int best = Integer.MIN_VALUE;
      for (int i = 1; i < rows; i++) {
        for (int j = 0; j < columns; j++) {
          bestPathFromCache[i][j] = determineBestPathValuesForRow(i, j, grid);
        }
      }
      if(debugMode) {
        System.out.println("Original Grid");
        printGrid(grid);
      }
      if (debugMode) {
        System.out.println("Best Possible Value Per Row");
        printGrid(bestPathFromCache);
      }
      for(int j = 0; j < columns; j++) {
        int sum = 0;
        for(int i = 0; i < rows; i++) {
          sum += bestPathFromCache[i][j];
        }
        best = Math.max(sum, best);
      }
      return best;
    }

    public int determineBestPathValuesForStartingRow(int j, int[][] grid) {
      int bestValue = grid[0][j];
      int sum;
      if (j - 1 > -1) {
        sum = bestValue;
        for (int c = j - 1; c > -1; c--) {
          sum += grid[0][c];
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (j + 1 < columns) {
        sum = bestValue;
        for (int c = j + 1; c < columns; c++) {
          sum += grid[0][c];
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (debugMode) {
        System.out.println("j: " + j + " bestValue: " + bestValue);
      }
      return bestValue;
    }

    public int determineBestPathValuesForRow(int i, int j, int[][] grid) {
      int bestValue = grid[i][j];
      int sum;
      if (j - 1 > -1) {
        sum = bestValue;
        for (int c = j - 1; c > -1; c--) {
          sum += grid[i][c];
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (j + 1 < columns) {
        sum = bestValue;
        for (int c = j + 1; c < columns; c++) {
          sum += grid[i][c];
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (debugMode) {
        System.out.println("i: " + i + " j: " + j + " bestValue: " + bestValue);
      }
      return bestValue;
    }

    public int updateBestPathValuesBasedOnPreviousRow(int i, int j) {
      int bestValue = bestPathFromCache[i][j] + bestPathFromCache[i - 1][j];
      int sum = Integer.MIN_VALUE;
      if (j - 1 > -1) {
        sum = bestPathFromCache[i][j];
        for (int c = j - 1; c > -1; c--) {
          sum += bestPathFromCache[i - 1][c] + bestPathFromCache[i][c];
          if(sum < j - 1) {
            sum -= bestPathFromCache[i - 1][c +  1];
          }
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (j + 1 < columns) {
        sum = bestPathFromCache[i][j];
        for (int c = j + 1; c < columns; c++) {
          sum += bestPathFromCache[i - 1][c] + bestPathFromCache[i][c];
          if(c > j + 1) {
            sum -= bestPathFromCache[i - 1][c - 1];
          }
          bestValue = Math.max(bestValue, sum);
        }
      }
      if (debugMode) {
        System.out.println("i : " + i + " j: " + j + " bestValue: " + bestValue);
      }
      return bestValue;
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

}
