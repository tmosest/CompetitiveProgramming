package com.tmosest.competitiveprogramming.hackerrank.woc.week35;

import java.util.Scanner;

public class ThreeDSurfaceArea {
  
  public static boolean debugMode = false; 
  
  private static class Cube {
    public boolean isTopHidden;
    public boolean isBottomHidden;
    public boolean isLeftHidden;
    public boolean isRightHidden;
    public boolean isFrontHidden;
    public boolean isBackHidden;
    
    public Cube() {
      isTopHidden = false;
      isBottomHidden = false;
      isLeftHidden = false;
      isRightHidden = false;
      isFrontHidden = false;
      isBackHidden = false;
    }
    
    public int getSurfaceArea() {
      int sum = 0;
      if(!isTopHidden) sum++;
      if(!isBottomHidden) sum++;
      if(!isLeftHidden) sum++;
      if(!isRightHidden) sum++;
      if(!isFrontHidden) sum++;
      if(!isBackHidden) sum++;
      if(debugMode)
        System.out.println("Square Surface Area " + sum);
      return sum;
    }
  }
  
  private static class CubeStack {
    public Cube[] cubes;
    
    public CubeStack(int height) {
      cubes = new Cube[height];
      for(int i = 0; i < height; i++) {
        Cube cube = new Cube();
        if(i > 1|| (i == 0 && height > 1)) {
          cube.isBottomHidden = true;
        }
        if(i < height - 1) {
          cube.isTopHidden = true;
        }
        cubes[i] = cube;
      }
    }
    
    public int getSurfaceArea() {
      int sum = 0;
      for(int i = 0; i < cubes.length; i++) {
        sum += cubes[i].getSurfaceArea();
      }
      return sum;
    }
  }
  
  private static class CubeBoard {
    public CubeStack[][] cubeStacks;
    
    /**
     * 0        columns
     * 
     * 
     * 
     * rows        rows,columns
     */
    private void hideSides() {
      if(debugMode) {
        System.out.println("rows: " + cubeStacks.length + " columns: " + cubeStacks[0].length);
      }
      for(int i = 0; i < cubeStacks.length; i++) {
        for(int j = 0; j < cubeStacks[0].length; j++) {
          // Hide left side of current and right side of other
          if(j - 1 > -1) {
            for(int h = 0; h < Math.min(cubeStacks[i][j].cubes.length, cubeStacks[i][j-1].cubes.length); h++) {
              cubeStacks[i][j].cubes[h].isLeftHidden = true;
              cubeStacks[i][j - 1].cubes[h].isRightHidden = true;
            }
          }
          if(j + 1 < cubeStacks[0].length) {
            if(debugMode) {
              System.out.println("j + 1: " + (j + 1));
            }
            for(int h = 0; h < Math.min(cubeStacks[i][j].cubes.length, cubeStacks[i][j + 1].cubes.length); h++) {
              cubeStacks[i][j + 1].cubes[h].isLeftHidden = true;
              cubeStacks[i][j].cubes[h].isRightHidden = true;
            }
          }
          if(i - 1 > -1) {
            for(int h = 0; h < Math.min(cubeStacks[i][j].cubes.length, cubeStacks[i - 1][j].cubes.length); h++) {
              cubeStacks[i - 1][j].cubes[h].isBackHidden = true;
              cubeStacks[i][j].cubes[h].isFrontHidden = true;
            }
          }
          if(i + 1 < cubeStacks.length) {
            for(int h = 0; h < Math.min(cubeStacks[i][j].cubes.length, cubeStacks[i + 1][j].cubes.length); h++) {
              cubeStacks[i][j].cubes[h].isBackHidden = true;
              cubeStacks[i + 1][j].cubes[h].isFrontHidden = true;
            }
          }
        }
      }
    }
    
    public CubeBoard(int[][] heights) {
      cubeStacks = new CubeStack[heights.length][heights[0].length];
      for(int i = 0; i < cubeStacks.length; i++) {
        for(int j = 0; j < cubeStacks[0].length; j++) {
          CubeStack cubeStack = new CubeStack(heights[i][j]);
          cubeStacks[i][j] = cubeStack;
        }
      }
      hideSides();
    }
    
    public int getSurfaceArea() {
      int sum = 0;
      for(int i = 0; i < cubeStacks.length; i++) {
        for(int j = 0; j < cubeStacks[0].length; j++) {
          sum += cubeStacks[i][j].getSurfaceArea();
        }
      }
      return sum;
    }
  }
  
  /**
   * 
   * @return
   */
  public static int solve() {
    Scanner in = new Scanner(System.in);
    int rows = in.nextInt();
    int columns = in.nextInt();
    int[][] heights = new int[rows][columns];
    for(int i = 0; i < rows; i++) {
      for(int j = 0; j < columns; j++) {
        heights[i][j] = in.nextInt();
      }
    }
    in.close();
    return new CubeBoard(heights).getSurfaceArea();
  }
  
  public static void main(String[] args) {
    System.out.println(solve());
  }
  
}
