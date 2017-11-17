package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.util.ArrayList;
import java.util.Scanner;

public class MatrixLand {

  public static boolean debugMode = false;

  private static class MaximizedPath {
    int rows;
    int columns;
    int bestPath;
    int[][] bestPathToCache;

    public MaximizedPath(int[][] grid) {
      rows = grid.length;
      columns = grid[0].length;
      bestPathToCache = new int[rows][columns];
      initCache(grid);
      bestPath = bestPathTo(rows - 1, columns - 1, grid, 0);
    }

    private void initCache(int grid[][]) {
      for (int i = 0; i < rows; i++)
        for (int j = 0; j < columns; j++)
          bestPathToCache[i][j] = Integer.MIN_VALUE;
      
      bestPathToCache[0][0] = grid[0][0];
      
      for(int j = 1; j < columns; j++) {
        bestPathToCache[0][j] = bestPathToCache[0][j - 1];
      }
    }

    public int bestPathTo(int i, int j, int[][] grid, int score) {
      score += grid[i][j];
      if (debugMode) {
        System.out.println("\ni: " + i + " j: " + j + " score: " + score);
      }
      if (debugMode) {
        printGrid(grid);
        System.out.println();
      }
      grid[i][j] = 0;
      if (i == 0 && j == 0) {
        return score;
      }
      int bestPath = Integer.MIN_VALUE;
      int[][] newGrid;
      if (i - 1 > -1) {
        if (debugMode) {
          System.out.println("i - 1 : " + (i - 1) + " score: " + score);
        }
        newGrid = copyGrid(grid);
        bestPath = Math.max(bestPath, bestPathTo(i - 1, j, newGrid, score));
        if (debugMode) {
          System.out.println("i - 1  best path: " + bestPath);
        }
      }
      boolean shouldTryLeft = shouldTryLeft(i, j, grid);
      if (debugMode) {
        System.out.println("shouldTryLeft: " + shouldTryLeft);
      }
      if (j - 1 > -1 && shouldTryLeft) {
        if (debugMode) {
          System.out.println("j - 1 : " + (j - 1) + " score: " + score);
        }
        newGrid = copyGrid(grid);
        bestPath = Math.max(bestPath, bestPathTo(i, j - 1, newGrid, score));
        if (debugMode) {
          System.out.println("j - 1  best path: " + bestPath);
        }
      }
      boolean shouldTryRight = shouldTryRight(i, j, grid);
      if (debugMode) {
        System.out.println("shouldTryRight: " + shouldTryRight);
      }
      if (j + 1 < columns && shouldTryRight) {
        if (debugMode) {
          System.out.println("j + 1 : " + (j + 1));
        }
        newGrid = copyGrid(grid);
        bestPath = Math.max(bestPath, bestPathTo(i, j + 1, newGrid, score));
      }
      if (debugMode) {
        System.out.println("bestPath: " + bestPath);
      }
      return bestPath;
    }

    private boolean shouldTryLeft(int i, int j, int[][] grid) {
      for (int c = j; c > -1; c--) {
        if (grid[i][c] > 0)
          return true;
      }
      return false;
    }

    private boolean shouldTryRight(int i, int j, int[][] grid) {
      for (int c = j; c < columns; c++) {
        if (grid[i][c] > 0)
          return true;
      }
      return false;
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
          System.out.print(grid[i][j] + " ");
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
