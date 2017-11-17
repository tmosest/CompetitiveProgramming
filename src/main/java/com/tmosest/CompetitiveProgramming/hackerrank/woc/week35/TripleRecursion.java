package com.tmosest.CompetitiveProgramming.hackerrank.woc.week35;

import java.util.Scanner;

/**
 * Contests -> Week of Code 35 -> Triple Recursion
 * 
 * Difficulty: Easy
 * 
 * Score: 20 pts
 * 
 * link: https://www.hackerrank.com/contests/w35/challenges/triple-recursion/problem
 * 
 * @author tmosest (Tyler Owen Moses)
 */
public class TripleRecursion {
  
  /**
   * Boolean debugMode for debugging.
   */
  public static boolean debugMode = false;
  
  /**
   * @name Matrix
   * Wrapper class for a matrix.
   * @author tmosest (Tyler Owen Moses)
   */
  public static class Matrix {
    /**
     * Grid
     */
    public int[][] grid;
    /**
     * Function to initialize the grid based on the rules
     * @param n Size of the grid
     * @param m Initnital value for index 0,0
     * @param k Another value used for when i == j
     */
    private void initGrid(int n, int m, int k) {
      for(int i = 0; i < n; i++) {
        for(int j = 0; j < n; j++) {
          if(debugMode)
            System.out.println("i: " + i + " j: " + j);
          if(i == 0 && j ==0) {
            grid[i][j] = m;
          } else if(i == j) {
            grid[i][j] = grid[i - 1][j - 1] + k;
          } else if(i > j) {
            grid[i][j] = grid[i - 1][j] - 1;
          } else {
            grid[i][j] = grid[i][j - 1] - 1;
          }
        }
      }
    }
    /**
     * Constructor function
     * @param n 
     * @param m
     * @param k
     */
    public Matrix(int n, int m, int k) {
      grid = new int[n][n];
      initGrid(n, m, k);
    }
    
    /**
     * To String method.
     */
    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder();
      for(int i = 0; i < grid.length; i++) {
        for(int j = 0; j < grid[i].length; j++) {
          sb.append(grid[i][j]);
          if(j != grid[i].length - 1) sb.append(" ");
        }
        if(i != grid.length - 1) sb.append("\n");
      }
      return sb.toString();
    }
  }
  /**
   * Main wrapper for testing.
   * @return Solution Matrix
   */
  public static Matrix solve() {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int m = in.nextInt();
    int k = in.nextInt();
    in.close();
    return new Matrix(n, m, k);
  }
  /**
   * Main method.
   * @param args main string array!
   */
  public static void main(String[] args) {
    System.out.println(solve().toString());
  }
  
}
